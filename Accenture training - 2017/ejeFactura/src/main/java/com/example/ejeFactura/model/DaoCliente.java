package com.example.ejeFactura.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoCliente extends CrudRepository<Cliente, Long> {

}
