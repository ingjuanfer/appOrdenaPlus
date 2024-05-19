package com.ordenaplus.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ordenaplus.interfaceService.IUsuarioService;
import com.ordenaplus.modelo.Usuario;
import javax.validation.Valid;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IUsuarioService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario>usuarios = service.listar();
		model.addAttribute("usuarios", usuarios);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Usuario u, Model model) {
		service.save(u);
		return "redirect:/listar";
	}
	
}
