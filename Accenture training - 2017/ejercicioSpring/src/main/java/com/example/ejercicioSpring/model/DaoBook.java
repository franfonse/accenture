package com.example.ejercicioSpring.model;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DaoBook extends CrudRepository<Book, Long> {

}