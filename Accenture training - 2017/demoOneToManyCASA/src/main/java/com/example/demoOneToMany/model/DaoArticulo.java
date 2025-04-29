package com.example.demoOneToMany.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoArticulo extends CrudRepository<Articulo, Long> {

}
