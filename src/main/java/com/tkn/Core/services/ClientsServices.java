package com.tkn.Core.services;

import com.tkn.Core.models.Clientes;
import com.tkn.Core.repository.IClientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsServices {

    private IClientsRepository repository;

    ClientsServices(IClientsRepository _repository) {
        this.repository = _repository;
    }

    public Optional<Clientes> getOne (Long id) {
        return repository.findById(id);
    }

    public List<Clientes> getAll() {
        return repository.findAll();
    }

    public Clientes create (Clientes newClient) {
        return repository.save(newClient);
    }
}
