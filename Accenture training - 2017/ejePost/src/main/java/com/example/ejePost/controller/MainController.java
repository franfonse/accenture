package com.example.ejePost.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ejePost.controller.model.DaoPost;
import com.example.ejePost.controller.model.DaoPostComment;
import com.example.ejePost.controller.model.DaoUser;
import com.example.ejePost.controller.model.Post;
import com.example.ejePost.controller.model.User;



@Controller
public class MainController {

	@Autowired
	DaoUser daoUser;
	
	@Autowired
	DaoPost daoPost;
	
	@Autowired
	DaoPostComment daoPostComment;
	
	java.sql.Date sqlDate = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		
		
		return "home";
	}
	
	@RequestMapping(value="/ingresarUsuario", method = RequestMethod.GET)
	public String ingresarUser(Model model) {
		
		User user = new User();
		
		model.addAttribute("usuario", user);
		
		
		return "home";
		
	}
	
	@RequestMapping(value="/acceder", method = RequestMethod.GET)
	public String crearpost(Model model, @ModelAttribute User user, @ModelAttribute Post post, 
			@RequestParam String username, @RequestParam String password, @RequestParam String titulo) {
		
		model.addAttribute("usuario", user);
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		
		List<User> buscaUsuarios = daoUser.findByusername(username);
		
		
		
		if (buscaUsuarios.get(1).getUsername().equals("username")) {
			
			
			System.out.println("Usted ha ingresado, postee un comentario.");
		}
		else {
			System.out.println("Usuario y/o contraseña equivocada.");
		}
		
		return "postcomment";
		
	}
	
	
	
}
