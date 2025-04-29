package com.example.inteFinal.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepdetalle extends CrudRepository<Repdetalle, Long> {

	public List<Repdetalle> findByorden (Orden orden);
}
