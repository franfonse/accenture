package com.example.ejercicioSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ejercicioSpring.model.Book;
import com.example.ejercicioSpring.model.BookDetails;
import com.example.ejercicioSpring.model.DaoBook;


@Controller
public class MainController {
	
	@Autowired
	private DaoBook daoBook;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
	
	System.out.println("Estoy probando la pagina, paso por aca.");
	
	Book libro = new Book();
	model.addAttribute("libro", libro);
	
	return "homepage";
	
	}
	
	@RequestMapping(value="/createBook", method = RequestMethod.POST)
	public String AgregarLibro(Model model, @ModelAttribute Book libro, @RequestParam String auto, @RequestParam String edit) {
		
		model.addAttribute("name", libro.getName());
		
		BookDetails details = new BookDetails();
		details.setAutor(auto);
		details.setEditoral(edit);
		
		libro.setDetails(details);
		details.setLibro(libro);
		
		daoBook.save(libro);
		
		model.addAttribute("listaBook", daoBook.findAll());
		
		
		
		return "agregado";
	}
	
	@RequestMapping(value="/deleteLibro", method = RequestMethod.GET)
	public String DeleteBook(Model model, @RequestParam Long id) {
	
		daoBook.delete(id);
		
		model.addAttribute("listaBook", daoBook.findOne(id));
		
		model.addAttribute("listaBook", daoBook.findAll());
		
		return "agregado";
		
	}
	
	@RequestMapping(value = "/editLibro", method = RequestMethod.GET)
	public String EditLibro(Model model, @ModelAttribute Book libro, @RequestParam long id) {
		
		model.addAttribute("libro", daoBook.findOne(id));
		
		
		return "modificar";
	}
	
	@RequestMapping(value = "/editedLibro", method = RequestMethod.POST)
	public String EditedLibro(Model model, @ModelAttribute Book libro, @RequestParam Long id) {
		
		Book newBook = daoBook.findOne(id);
		
		newBook.setName(libro.getName());
		newBook.getDetails().setAutor(libro.getDetails().getAutor());;
		newBook.getDetails().setEditoral(libro.getDetails().getEditoral());
		
		daoBook.save(newBook);
		
		model.addAttribute("listaBook", daoBook.findAll());
		
		return "agregado";
	}
	
	
}