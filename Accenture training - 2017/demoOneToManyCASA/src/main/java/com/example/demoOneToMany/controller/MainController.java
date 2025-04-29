package com.example.demoOneToMany.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoOneToMany.model.Articulo;
import com.example.demoOneToMany.model.DaoArticulo;
import com.example.demoOneToMany.model.DaoFabricante;
import com.example.demoOneToMany.model.Fabricante;

@Controller
public class MainController {

	@Autowired
	DaoFabricante daoFabricante;
	@Autowired
	DaoArticulo daoArticulo;
	
	@RequestMapping (value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("Paso por aca.");
		
		Fabricante fab = new Fabricante();
		model.addAttribute("fabricante", fab);
		
		return "home";
	}
	
	@RequestMapping (value = "/createFabricante", method = RequestMethod.POST)
	public String crearFabricante(Model model, @RequestAttribute Fabricante fab) {
		
		model.addAttribute("nombre", fab.getNombre());
		
		
		Articulo art = new Articulo("Martillo", 1200);
		
		
		fab.agregarArticulos(art);
		
		
		daoFabricante.save(fab);
		
		
		model.addAttribute("listaFabricantes", daoFabricante.findAll());
		
		return "agregado";
	}
	
//	@RequestMapping(value="/deleteFabricante", method = RequestMethod.GET)
//	public String DeleteFabricante(Model model, @RequestParam Long id) {
//	
//		daoFabricante.delete(id);
//		
//		model.addAttribute("listaFabricantes", daoFabricante.findOne(id));
//		
//		model.addAttribute("listaFabricantes", daoFabricante.findAll());
//		
//		return "agregado";
//		
//	}
	
	
	
}
