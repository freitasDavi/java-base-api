package com.tkn.Core.repository;

import com.tkn.Core.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientsRepository extends JpaRepository<Clientes, Long> {
}
