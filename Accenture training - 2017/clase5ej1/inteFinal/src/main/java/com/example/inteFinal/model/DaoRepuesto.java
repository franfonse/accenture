package com.example.inteFinal.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepuesto extends CrudRepository<Repuesto, Long> {

}
