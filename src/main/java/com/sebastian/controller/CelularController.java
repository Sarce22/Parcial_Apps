package com.sebastian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sebastian.models.Celular;
import com.sebastian.repository.ICelularRepository;

@Controller
@RequestMapping("/celular")
public class CelularController {
	
	
	@Autowired
	private ICelularRepository celularRepository;
	
	@GetMapping("/celulares")
	public String listCelular(Model model) {
		
		List<Celular> celulares = celularRepository.findAll();
		model.addAttribute("celulares",celulares);
		return "celular";
	}
	
}
