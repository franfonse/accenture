package com.example.demoSpring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DaoAlumno extends CrudRepository<Alumno, Long> {
	
	public List<Alumno> findBynombre(String nomb);
}