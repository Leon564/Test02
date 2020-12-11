package com.leon564.test.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.leon564.test.entidades.Categoria;
import com.leon564.test.repositorios.RepoCategoria;


@Controller
public class CategoriaController {
	@Autowired
	RepoCategoria Repo;
	
	@GetMapping("/registercat")
	public String nuevo() {
		return "Categoria/RegisterCategoria";
	}
	
	@PostMapping("/registrarC")
	public String registrar( 
			//@Valid
			@ModelAttribute("categoria")Categoria categoria,
			BindingResult result ) {
		
		Repo.save(categoria);
		
	
		return "redirect:/";
		
		
	}
}
