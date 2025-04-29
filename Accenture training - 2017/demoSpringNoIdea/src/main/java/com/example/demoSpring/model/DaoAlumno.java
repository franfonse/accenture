package com.example.demoSpring.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoAlumno extends CrudRepository<Alumno, Long> {
	
	public List<Alumno> findBynombre(String nomb);
}
