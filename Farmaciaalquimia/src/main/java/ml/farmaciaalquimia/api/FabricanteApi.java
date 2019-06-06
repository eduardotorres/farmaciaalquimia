package ml.farmaciaalquimia.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ml.farmaciaalquimia.service.FabricanteService;
import ml.farmaciaalquimia.model.Fabricante;

@RestController("/fabricantes/api")
public class FabricanteApi {

	@Autowired
	private FabricanteService fabricanteService;
	
	@GetMapping("/list")
	public List<Fabricante> listar(){
		return fabricanteService.findAll();
	}
}
