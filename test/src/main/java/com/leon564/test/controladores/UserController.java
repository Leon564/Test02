package com.leon564.test.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.leon564.test.entidades.user;
import com.leon564.test.repositorios.RepoUser;





@Controller
public class UserController {

	@Autowired
	RepoUser Repo;
	
	@GetMapping("/Register")
	public String nuevo() {
		return "/User/Register";
	}
	
	@PostMapping("/Registrar")
	public String registrar( 
			//@Valid
			@ModelAttribute("user")user user,
			BindingResult result ) {
		
		Repo.save(user);
		
	
		return "redirect:/";
		
		
	}
	
	@GetMapping("/Users")
	public String Users(Model model) {
		model.addAttribute("user", Repo.findAll());
		return "/User/Users";
	}
	
	
	// Ruta get /eliminar/{id}
	@GetMapping("/DeleteUser/{id}")
	public String DeleteUser(@PathVariable("id")int id) {
		Repo.deleteById(id);
		return "redirect:/Users";
	}
	
}
