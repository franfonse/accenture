package com.example.ejeFactura.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoItem extends CrudRepository<Item, Long> {

	public List<Item> findByfactura(Factura factura);
}
