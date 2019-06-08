package ml.farmaciaalquimia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ml.farmaciaalquimia.dao.FabricanteRepository;
import ml.farmaciaalquimia.model.Fabricante;

@Service
public class FabricanteServiceImpl implements FabricanteService {
	
	@Autowired
	private FabricanteRepository fabricanteRepository;

	@Override
	public Fabricante save(Fabricante fabricante) {
		return fabricanteRepository.save(fabricante);
	}


	@Override
	public Fabricante findById(Long id) {
		return fabricanteRepository.findById(id).get();
	}

	@Override
	public List<Fabricante> findAll() {
		return fabricanteRepository.findAll();
	}

	@Override
	public void update(Fabricante fabricante) {
		fabricanteRepository.save(fabricante);
	}

	@Override
	public void delete(Long id) {
		fabricanteRepository.deleteById(id);
	}


	@Override
	public Fabricante findByName(String name) {
		return fabricanteRepository.findByName(name);
	}
	
	

}
