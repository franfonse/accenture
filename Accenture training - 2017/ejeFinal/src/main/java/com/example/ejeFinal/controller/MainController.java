package com.example.ejeFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ejeFinal.model.DaoOrden;
import com.example.ejeFinal.model.DaoPropietario;
import com.example.ejeFinal.model.DaoRepdetalle;
import com.example.ejeFinal.model.DaoRepuesto;
import com.example.ejeFinal.model.Orden;

@Controller
public class MainController {
	
	@Autowired
	DaoPropietario daoPropietario;
	
	@Autowired
	DaoOrden daoOrden;
	
	@Autowired
	DaoRepdetalle deoRepdetalle;
	
	@Autowired
	DaoRepuesto daoRepuesto;
	

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "homepage";
	}
	
	@RequestMapping(value="/acceder", method = RequestMethod.POST)
	public String accederpropietario(Model model, @ModelAttribute Orden orden, @RequestParam long idpropietario) {
		
		
		
		return "listaordenes";
	}
	
}
