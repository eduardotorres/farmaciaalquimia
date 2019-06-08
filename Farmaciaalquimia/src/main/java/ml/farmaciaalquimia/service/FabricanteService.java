package ml.farmaciaalquimia.service;

import java.util.List;

import ml.farmaciaalquimia.model.Fabricante;

public interface FabricanteService {
	
	Fabricante save(Fabricante fabricante);
	Fabricante findByName(String name);
	Fabricante findById(Long id);
	List<Fabricante> findAll();
	void update (Fabricante fabricante);
	void delete (Long id);
}
