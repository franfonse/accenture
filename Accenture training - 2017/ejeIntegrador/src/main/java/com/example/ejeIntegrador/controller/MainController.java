package com.example.ejeIntegrador.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ejeIntegrador.model.DaoOrden;
import com.example.ejeIntegrador.model.DaoPropietario;
import com.example.ejeIntegrador.model.DaoRepdetalle;
import com.example.ejeIntegrador.model.DaoRepuesto;
import com.example.ejeIntegrador.model.Orden;
import com.example.ejeIntegrador.model.Propietario;
import com.example.ejeIntegrador.model.Repdetalle;

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
	
	@RequestMapping (value="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "homepage";
	}
	
	@RequestMapping (value="/crearOrden", method = RequestMethod.POST)
	public String accede(Model model, @ModelAttribute Orden orden, @RequestParam long idpropietario) {
		
		//model.addAttribute("idpropietario", idpropietario);
		
		Propietario propietario = daoPropietario.findOne(idpropietario);
		
		if (idpropietario > daoPropietario.count()) {
			
			return "nuevopropietario";
			
		}
		else {
			
			orden = new Orden("ABC 123", new java.sql.Date(Calendar.getInstance().getTimeInMillis()), propietario, "Peugeot", "Necesito nuevo motor y cambio de gomas.");
			
//			orden.setPatente("ABC 123");
//			orden.setFecha(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
//			orden.setPropietario(daoPropietario.findOne(idpropietario));
//			orden.setMarca("Peugeot");
//			orden.setDetalle("Necesito nuevo motor y cambio de gomas.");
			
			daoOrden.save(orden);
			
			model.addAttribute("listaOrdenes", daoOrden.findAll());
			
			return "listaordenes";
		}
	}
	
	@RequestMapping (value="/nuevoPropietario", method = RequestMethod.POST)
	public String crearpropietario(Model model, @ModelAttribute Propietario prop, @RequestParam int dni, @RequestParam String nombre, 
			@RequestParam String apellido, @RequestParam String direccion, @RequestParam int tel) {
		
		//prop = new Propietario(dni, nombre, apellido, direccion, tel);
		
		model.addAttribute("prop", prop);
		
		daoPropietario.save(prop);
		
		return "homepage";
	}
	
	
	@RequestMapping (value="/agregarRepOrden", method = RequestMethod.GET)
	public String agregareporden(Model model, @RequestParam long idorden) {
		
		Orden orden = daoOrden.findOne(idorden);
		
		daoOrden.save(orden);
		
		model.addAttribute("orden", orden);
		model.addAttribute("listaRepdetalles", daoRepdetalle.findByorden(orden));
		model.addAttribute("listaRepuestos", daoRepuesto.findAll());
		
		return "agregarepuestos";
	}
	
	@RequestMapping (value="/agregarRepuestos", method = RequestMethod.POST)
	public String agregarepuestos(Model model, @ModelAttribute Orden orden, @RequestParam long idorden, @RequestParam long idrepuesto, @RequestParam int qty, @RequestParam int horas) {
		
		orden = daoOrden.findOne(orden.getIdorden());
		
		Repdetalle rde = new Repdetalle(orden, daoRepuesto.findOne(idrepuesto), qty, horas);
		
		model.addAttribute("orden", orden);
		model.addAttribute("idorden", orden.getIdorden());
		
		daoRepdetalle.save(rde);
		
		model.addAttribute("listaRepdetalles", daoRepdetalle.findByorden(orden));
		model.addAttribute("listaRepuestos", daoRepuesto.findAll());
		
		return "agregarepuestos";
	}
	
	@RequestMapping (value="/imprimirOrden", method = RequestMethod.GET)
	public String imprime(Model model, @ModelAttribute Orden orden, @RequestParam long idorden) {
		
		orden = daoOrden.findOne(idorden);
		
		model.addAttribute("orden", orden);
		model.addAttribute("listaRepdetalles", daoRepdetalle.findByorden(orden));
		
		float total = 0;
		
		for(Repdetalle rde: daoRepdetalle.findByorden(orden)) {
			total = total + (rde.getQty() * rde.getRepuesto().getCosto()) + (rde.getHoras()*350);
		}
		
		
		model.addAttribute("total", total);
		
		return "ordenimpresa";
	}
}