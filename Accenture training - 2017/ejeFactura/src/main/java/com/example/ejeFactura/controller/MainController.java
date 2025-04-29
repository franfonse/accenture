package com.example.ejeFactura.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.ejeFactura.model.Cliente;
import com.example.ejeFactura.model.DaoCliente;
import com.example.ejeFactura.model.DaoFactura;
import com.example.ejeFactura.model.DaoItem;
import com.example.ejeFactura.model.DaoProducto;
import com.example.ejeFactura.model.DaoUsuario;
import com.example.ejeFactura.model.Factura;
import com.example.ejeFactura.model.Item;
import com.example.ejeFactura.model.Usuario;

@Controller
@SessionAttributes("usuariologueado")
public class MainController {
	
	@Autowired
	DaoCliente daoCliente;
	
	@Autowired
	DaoProducto daoProducto;
	
	@Autowired
	DaoFactura daoFactura;
	
	@Autowired
	DaoItem daoItem;
	
	@Autowired
	DaoUsuario daoUsuario;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		Factura factura = new Factura();
		model.addAttribute("factura", factura);
		
		return "homepage";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		
		
		return "login";
	}
	
	
	@RequestMapping(value="/accederLogin", method = RequestMethod.POST)
	public String acceder(Model model, @RequestParam String nombre, @RequestParam String password) {
		
		String site = "login";
		
		if (daoUsuario.findBynombre(nombre).size() > 0) {
			
			Factura factura = new Factura();
			model.addAttribute("factura",factura);
			model.addAttribute("usuariologueado",daoUsuario.findBynombre(nombre).get(0));
			site = "homepage";
		}
		
		return site;
	}
	
	
	
	@RequestMapping (value = "/nuevaFactura", method = RequestMethod.POST)
	public String accederFactura(Model model, @ModelAttribute("usuariologueado") Usuario usuario, @ModelAttribute Factura factura, @RequestParam long clienteid) {
		
		Cliente cliente = daoCliente.findOne(clienteid);
		
		model.addAttribute("factura", factura);
		factura.setCliente(cliente);
		
		factura.setFecha(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		
		model.addAttribute("listaFacturas", daoFactura.findAll());
		
		daoFactura.save(factura);
		
		
		return "facturas";
	}
	
	@RequestMapping (value = "/agregarItems", method = RequestMethod.GET)
	public String agregaItem(Model model, @RequestParam long idfactura) {
		
		Factura factura = daoFactura.findOne(idfactura);
		
		model.addAttribute("factura", factura);
		model.addAttribute("listaProductos", daoProducto.findAll());
		
		daoFactura.save(factura);
		
		
		return "agregarproductos";
	}
	
	@RequestMapping(value="/agregarProductos", method = RequestMethod.POST)
	public String agregaProducto(Model model, @ModelAttribute Factura factura, @RequestParam long idproducto, 
			@RequestParam int qty) {
		
		factura = daoFactura.findOne(factura.getIdfactura());
		
        
		Item item = new Item (factura, daoProducto.findOne(idproducto), qty);
		
		
		daoItem.save(item);
		
		model.addAttribute("factura", factura);
		model.addAttribute("listaProductos", daoProducto.findAll());
		model.addAttribute("listaItem", daoItem.findByfactura(factura));
		
		return "agregarproductos";
	}
	
	@RequestMapping(value="/imprimirFactura", method = RequestMethod.GET)
	public String imprimeFactura(Model model, @ModelAttribute Factura factura, @RequestParam long idfactura) {
		
		float total = 0;
		factura = daoFactura.findOne(idfactura);
		
		model.addAttribute("factura", factura);
		model.addAttribute("listaItem", daoItem.findByfactura(factura));
		
		for(Item ite: daoItem.findByfactura(factura)) {
			 total = total + (ite.getQty() * ite.getProducto().getPrecio());
		 }
		
		model.addAttribute("total", total);
		
		return "facturaimpresa";
	}
	
	
	
}