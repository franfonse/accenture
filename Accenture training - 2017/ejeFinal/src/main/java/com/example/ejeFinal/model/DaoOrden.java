package com.example.ejeFinal.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoOrden extends CrudRepository<Orden, Long> {

}
