package ml.farmaciaalquimia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ml.farmaciaalquimia.model.Produto;
import ml.farmaciaalquimia.service.ProdutoService;

@RestController("/produto/api")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/list")
	public List<Produto> listar(){
		return produtoService.findAll();
	}

}
