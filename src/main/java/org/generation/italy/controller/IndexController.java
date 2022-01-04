package org.generation.italy.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// GRUPPO: LUCA VIGENTINI, SAVIO D'AMBROSIO, GIANMARCO BOSETTI, ALESSANDRO BOZZOLI

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("nome", "Gianmarco");
		return "index";
	}
	
	@GetMapping("/songs")
	public String songs(Model model) {

		model.addAttribute("titolo", "canzoni");
		model.addAttribute("list", Arrays.asList("Chic - Izi", "La canzone nostra - Blanco ft Salmo", "Hallucination - Mace", "Mentre dormi - Irbis37", "Cosplayer - Marracash"));
		return "list";
	}
	
	@GetMapping("/movies")
	public String movies(Model model) {
		
		model.addAttribute("titolo", "film");
		model.addAttribute("list", Arrays.asList("Don't look up", "Squid Games", "Bohemian Rhapsody", "Joker", "Old"));
		return "list";
	}
	
}
