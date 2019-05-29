package ml.farmaciaalquimia.service;

import java.util.List;

import ml.farmaciaalquimia.model.Produto;

public interface ProdutoService {
	
	void save (Produto produto);
	Produto findByName(String name);
	Produto findById(Long id);
	List<Produto> findAll();

}
