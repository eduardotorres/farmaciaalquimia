package ml.farmaciaalquimia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ml.farmaciaalquimia.model.Produto;
import ml.farmaciaalquimia.service.ProdutoService;

@RestController("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/produto")
	public List<Produto>	 listar(){
		return produtoService.findAll();
	}
	
	@PostMapping("/produto")
	public String save(@ModelAttribute("productForm") Produto produto, BindingResult bindingResult) {
		 if (bindingResult.hasErrors()) {
	            return "module/produto/produtoForm";
	        }
		 produtoService.save(produto);

		 
		return "module/product/index";
	}
}
