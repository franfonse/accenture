package com.example.ejeIntegrador.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoPropietario extends CrudRepository<Propietario, Long> {

}
