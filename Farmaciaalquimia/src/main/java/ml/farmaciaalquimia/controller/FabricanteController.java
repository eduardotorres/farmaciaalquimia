package ml.farmaciaalquimia.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ml.farmaciaalquimia.model.Fabricante;
import ml.farmaciaalquimia.service.FabricanteService;
import ml.farmaciaalquimia.validator.FabricanteValidator;


@Controller
public class FabricanteController {
	@Autowired
	private FabricanteService fabricanteService;
	@Autowired
	private FabricanteValidator fabricanteValidator;
	
	
	
	@GetMapping("/fabricantes")
	public String listaFabricantes(Model model){
		List<Fabricante> listaFabricantes = fabricanteService.findAll();
		model.addAttribute("listaFabricantes", listaFabricantes);
		return "module/fabricantes/index";
	}
	
	@PostMapping("/fabricantes")
	public String save(@ModelAttribute("fabricanteForm") Fabricante fabricante, BindingResult bindingResult){
		 if (bindingResult.hasErrors()) {
	            return "module/fabricante/formFabricante";
		 }
		 fabricanteService.save(fabricante);
		 
		 return "module/fabricantes/index";
	}
	
	@PostMapping("/fabricantes/update")
	public String update(@ModelAttribute("fabricanteUpdate") Fabricante fabricante, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
            return "module/fabricantes/formFabricante";
		}
		fabricanteService.update(fabricante);
		
		return "module/fabricantes/index";
	}
	
	@GetMapping("/fabricantes/update/{id}")
	public String update(@PathVariable("id") Long id, Model model){
		Fabricante fabricante = fabricanteService.findById(id);
		model.addAttribute("fabricanteUpdate", fabricante);
		return "module/fabricantes/formUpdateFabricante";
}
	
	@GetMapping("/fabricantes/delete/{id}")
	public String delete(@PathVariable("id") Long id){
		fabricanteService.delete(id);
		return "redirect:/fabricantes";
	}
	
	@GetMapping("fabricantes/form")
	public String prepareFabricanteForm(Model model){
		Fabricante fabricante= new Fabricante();
		model.addAttribute("fabricanteForm", fabricante);
		return "module/fabricantes/formFabricante";
	}
}
