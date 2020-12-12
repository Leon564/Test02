package com.leon564.test.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.leon564.test.entidades.Productos;

import com.leon564.test.repositorios.RepoProductos;


@Controller
public class ProductosController {

	
	@Autowired
	RepoProductos Repo;
	
	@GetMapping("/registerPr")
	public String nuevo() {
		return "Producto/RegisterProducto";
	}
	
	@PostMapping("/registrarP")
	public String registrar( 
			//@Valid
			@ModelAttribute("producto")Productos producto,
			BindingResult result ) {
		
		Repo.save(producto);
		
	
		return "redirect:/";
		
		
	}
	
	@GetMapping("/productos")
	public String list(Model model) {
		model.addAttribute("producto", Repo.findAll());
		return "Producto/Productos";
	}
	
	
}
