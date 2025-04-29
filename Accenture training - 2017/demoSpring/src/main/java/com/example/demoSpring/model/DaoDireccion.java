package com.example.demoSpring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoDireccion extends CrudRepository<Direccion, Long> {

}
