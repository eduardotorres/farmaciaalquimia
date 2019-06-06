package ml.farmaciaalquimia.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ml.farmaciaalquimia.model.Fabricante;
import ml.farmaciaalquimia.service.FabricanteService;


@Controller
public class FabricanteController {
	
	private FabricanteService fabricanteService;
	
	
	
	@GetMapping("/fabricantes")
	public String listaFabricantes(Model model){
		List<Fabricante> listaFabricantes = fabricanteService.findAll();
		model.addAttribute("listaFabricantes", listaFabricantes);
		return "module/fabricante/index";
	}
	
	@PostMapping("/fabricantes")
	public String save(@ModelAttribute("fabricanteForm") Fabricante fabricante, BindingResult bindingResult){
		 if (bindingResult.hasErrors()) {
	            return "module/fabricante/fabricanteForm";
		 }
		 fabricanteService.save(fabricante);
		 
		 return "module/fabricante/index";
	}
	
	@PostMapping("/fabricantes/update")
	public String update(@ModelAttribute("fabricanteUpdate") Fabricante fabricante, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {
            return "module/fabricante/fabricanteForm";
		}
		fabricanteService.update(fabricante);
		
		return "module/fabricante/index";
	}
	
	@GetMapping("/fabricantes/update/{id}")
	public String update(@PathVariable("id") Long id, Model model){
		Fabricante fabricante = fabricanteService.findById(id);
		model.addAttribute("fabricanteUpdate", fabricante);
		return "module/fabricante/formUpdateFabricante";
}
	
	@GetMapping("/fabricantes/delete/{id}")
	public String delete(@PathVariable("id") Long id){
		fabricanteService.delete(id);
		return "redirect:/fabricante";
	}
	
	@GetMapping("fabricantes/form")
	public String prepareFabricanteForm(Model model){
		Fabricante fabricante= new Fabricante();
		model.addAttribute("fabricanteForm", fabricante);
		return "module/fabricante/formFabricante";
	}
}
