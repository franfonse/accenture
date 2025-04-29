package com.example.demoManyToMany.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demoManyToMany.model.DaoIngrediente;
import com.example.demoManyToMany.model.DaoReceingre;
import com.example.demoManyToMany.model.DaoReceta;
import com.example.demoManyToMany.model.Ingrediente;
import com.example.demoManyToMany.model.Receingre;
import com.example.demoManyToMany.model.Receta;
import com.example.demoManyToMany.sevices.Pasos;

@Controller
@SessionAttributes("carritopasos")
public class MainController {
	
	@Autowired
	DaoReceta daoReceta;
	
	@Autowired
	DaoIngrediente daoIngrediente;
	
	@Autowired
	DaoReceingre daoReceingre;
	
	
	
	
	@RequestMapping (value = "/nuevaReceta", method = RequestMethod.GET)
	public String nuevaRece (Model model) {
		
		Receta receta = new Receta ();
		model.addAttribute("receta", receta);
		model.addAttribute("nombre", receta.getNombre());
		
		if(!model.containsAttribute("carritopasos")) {
			model.addAttribute("carritopasos", new ArrayList<Pasos>());
		}
		
		return "home";
		
	}
	
	
	@RequestMapping (value = "/crearReceta", method = RequestMethod.POST)
	public String nuevaRece (Model model, @RequestAttribute Receta receta, @ModelAttribute("carritopasos") ArrayList<Pasos> listaPasos) {
		
		daoReceta.save(receta);
		model.addAttribute("receta",receta);
		model.addAttribute("nombre", receta.getNombre());
		
		model.addAttribute("listaIngredientes",daoIngrediente.findAll());
		model.addAttribute("listaPasos", listaPasos);
		
		
		return "listaIngredientes";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping (value = "/", method = RequestMethod.GET)
	public String crear (Model model) {
		
		Receta receta1 = new Receta("Tarta de Jamon");
		Ingrediente ingrediente1 = new Ingrediente("Jamon", "Panini");
		Ingrediente ingrediente2 = new Ingrediente("Masa", "La Salteña");
		Receingre receingre1 = new Receingre(receta1, ingrediente1, 200, "g");
		Receingre receingre2 = new Receingre(receta1, ingrediente2, 1, "Kg");
		
		receta1.agregoIngrediente(receingre1);
		receta1.agregoIngrediente(receingre2);
		
		
		daoReceta.save(receta1);
		
		return "home";
	}
	

}
