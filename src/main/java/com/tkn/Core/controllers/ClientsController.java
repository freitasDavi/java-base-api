package com.tkn.Core.controllers;

import com.tkn.Core.dtos.responses.ResourceNotFound;
import com.tkn.Core.dtos.responses.SuccessResponse;
import com.tkn.Core.models.Clientes;
import com.tkn.Core.services.ClientsServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/clientes")
public class ClientsController {

    private ClientsServices service;

    ClientsController(ClientsServices _service) {
        this.service = _service;
    }

    @GetMapping
    public List<Clientes> getAll () {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity getOne (@PathVariable Long id) {
        var client = service.getOne(id);

        if (client.isPresent()) {
            return ResponseEntity.ok(new SuccessResponse<Clientes>(null, null, client.get()));
        }

        return ResponseEntity.ok(new ResourceNotFound<Clientes>(true, String.format("Cliente com o id %s não foi encontrado!", id), null));
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Clientes create (@RequestBody Clientes novoCli) {
        return service.create(novoCli);
    }
}
