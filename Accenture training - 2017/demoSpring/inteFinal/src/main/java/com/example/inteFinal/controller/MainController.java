package com.example.inteFinal.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.inteFinal.model.DaoOrden;
import com.example.inteFinal.model.DaoPropietario;
import com.example.inteFinal.model.DaoRepdetalle;
import com.example.inteFinal.model.DaoRepuesto;
import com.example.inteFinal.model.Orden;
import com.example.inteFinal.model.Propietario;
import com.example.inteFinal.model.Repdetalle;

@Controller
public class MainController {
	
	@Autowired
	DaoPropietario daoPropietario;
	
	@Autowired
	DaoOrden daoOrden;
	
	@Autowired
	DaoRepdetalle daoRepdetalle;
	
	@Autowired
	DaoRepuesto daoRepuesto;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		
		return "homepage";
	}
	
	@RequestMapping(value = "/crearOrden", method = RequestMethod.POST)
	public String crearorden(Model model, @ModelAttribute Orden orden, @RequestParam long idpropietario, 
			@RequestParam String detalle) {
		
		Propietario propietario = daoPropietario.findOne(idpropietario);
		
		model.addAttribute("orden", orden);
		model.addAttribute("detalle", orden.getDetalle());
		
		
		orden.setPatente("ABC123");
		orden.setFecha(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		orden.setPropietario(propietario);
		orden.setMarca("Peugeot");
		orden.setDetalle(detalle);
		
		
		daoOrden.save(orden);
		
		model.addAttribute("listaOrdenes", daoOrden.findAll());
		
		
		return "ordenes";
		
	
	}
	
	
	
	@RequestMapping(value = "/agregarRepOrden", method = RequestMethod.GET)
	public String agregarrepalaorden(Model model, @RequestParam long idorden) {
		
		Orden orden = daoOrden.findOne(idorden);
		model.addAttribute("orden", orden);
		
		daoOrden.save(orden);
		
		model.addAttribute("listaRepuestos", daoRepuesto.findAll());
		
		
		return "agregorepuestos";
	}
	
	@RequestMapping(value = "/agregarRepuesto", method = RequestMethod.POST)
	public String agregarrepuestos(Model model, @ModelAttribute Orden orden, @RequestParam long idrepuesto, 
			@RequestParam long idorden, @RequestParam int qty, @RequestParam int horas) {
		
		orden = daoOrden.findOne(orden.getIdorden());
		
		Repdetalle repd = new Repdetalle(orden, daoRepuesto.findOne(idrepuesto), qty, horas);
		daoRepdetalle.save(repd);
		
		model.addAttribute("orden", orden);
		model.addAttribute("idorden", orden.getIdorden());
		
		model.addAttribute("listaRepdetalles", daoRepdetalle.findByorden(orden));
		model.addAttribute("listaRepuestos", daoRepuesto.findAll());
		
		
		
		return "agregorepuestos";
	}
	
	@RequestMapping (value = "/imprimirOrden", method = RequestMethod.GET)
	public String imprimeorden(Model model, @ModelAttribute Orden orden, @RequestParam long idorden) {
		
		orden = daoOrden.findOne(idorden);
		
		model.addAttribute("orden", orden);
		model.addAttribute("listaRepdetalles", daoRepdetalle.findByorden(orden));
		
		float total = 0;
		
		for(Repdetalle rde: daoRepdetalle.findByorden(orden)) {
			
			total = total + ((rde.getHoras()*350) + (rde.getQty() * rde.getRepuesto().getCosto()));
			
		}
		
		model.addAttribute("total", total);
		
		
		
		return "ordenimpresa";
	}
	
	
}
