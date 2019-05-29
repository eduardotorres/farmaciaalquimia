package ml.farmaciaalquimia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ml.farmaciaalquimia.dao.FabricanteDAO;
import ml.farmaciaalquimia.model.Fabricante;


@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Fabricante> listar(){
		FabricanteDAO dao = new FabricanteDAO();
		List<Fabricante> resultado = dao.listar();
		return resultado;
	}
	
	
 
}
