package com.tkn.Core.controllers;

import com.tkn.Core.models.Clientes;
import com.tkn.Core.services.ClientsServices;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Clientes create (@RequestBody Clientes novoCli) {
        return service.create(novoCli);
    }
}
