package com.example.demoOneToMany.model;


//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoMunicipio extends CrudRepository<Municipio, Long> {

	//List<Municipio> listaMunicipios;
	
}
