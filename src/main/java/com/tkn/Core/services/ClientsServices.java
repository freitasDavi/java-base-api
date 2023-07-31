package com.tkn.Core.services;

import com.tkn.Core.models.Clientes;
import com.tkn.Core.repository.IClientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsServices {

    private IClientsRepository repository;

    ClientsServices(IClientsRepository _repository) {
        this.repository = _repository;
    }

    public List<Clientes> getAll() {
        return repository.findAll();
    }

    public Clientes create (Clientes newClient) {
        return repository.save(newClient);
    }
}
