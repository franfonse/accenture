package com.example.demoSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoSpring.model.Alumno;
/*import com.example.demoSpring.model.DaoAlumno;
import com.example.demoSpring.model.Direccion;*/

@Controller
public class MainController {
	
	@Autowired
	//private DaoAlumno daoAlumno;

	public MainController() {
		
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		String men = "Hola mundo!";
		System.out.println("Paso por aca");
		
		model.addAttribute("mensaje", men);
		
		Alumno alumno = new Alumno();
		
		model.addAttribute("alum", alumno);
		
		return "homepage";
	}
	
	/*@RequestMapping(value="/createAlumno", method = RequestMethod.POST)
	public String crearAlumno(Model model, @ModelAttribute Alumno alum, @RequestParam String comentario, @ModelAttribute Direccion dire) {
		
		System.out.println(alum.getNombre() + " " + alum.getApellido() + " " + alum.getEdad());
		System.out.println(comentario);
		
		model.addAttribute("nombre", alum.getNombre());
		model.addAttribute("apellido", alum.getApellido());
		
		daoAlumno.save(alum);
		
		Iterable<Alumno> listaAlumnos = daoAlumno.findAll();
		model.addAttribute("listaalum", listaAlumnos);
		
		Iterable<Alumno> listaPorNombre = daoAlumno.findBynombre("asd");
		model.addAttribute("listaPorNom", listaPorNombre);
		
		
		 alum.setDireccion(dire);

		 dire.setAlumno(alum);

		 daoAlumno.save(alum);
		
		return "agregado";
	}
	
	@RequestMapping(value="/deletealumno", method = RequestMethod.GET)
	public String deleteAlumno(Model model, @RequestParam long id) {
		
		
		
		return "agregado";
	}*/
	
}