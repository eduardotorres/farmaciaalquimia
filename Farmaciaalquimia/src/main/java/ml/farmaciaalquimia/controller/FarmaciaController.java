package ml.farmaciaalquimia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmaciaalquimia")
public class FarmaciaController {
	
	@RequestMapping("/teste")
	public String teste() {
		return "rodando";
	}

}
