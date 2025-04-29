package com.example.demoSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoSpring.model.Alumno;
import com.example.demoSpring.model.DaoAlumno;
import com.example.demoSpring.model.Direccion;

@Controller
public class MainController {

	@Autowired
	private DaoAlumno daoAlumno;
	
	Alumno alumno = new Alumno();
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model, @ModelAttribute Alumno alum) {
		
		System.out.println("Paso por aca");
		
		String men = "Hola mundo!";
		model.addAttribute("mensaje", men);
		
		model.addAttribute("alum", alumno);
		
		
		
		
		return "homepage";
	}
	
	
	@RequestMapping(value="/createAlumno", method = RequestMethod.POST)
	public String CrearAlumno(Model model, @ModelAttribute Alumno alum, @RequestParam String comentario, @ModelAttribute Direccion dire) {
		
		System.out.println(alum.getNombre() + " " + alum.getApellido() + " " + alum.getEdad());
		System.out.println(comentario);
		
		model.addAttribute("nombre", alum.getNombre());
		model.addAttribute("apellido", alum.getApellido());
		
		
		
		 alum.setDireccion(dire);
		 dire.setAlumno(alum);
		 daoAlumno.save(alum);

		
		return "agregado";
	}
	
}