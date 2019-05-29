package ml.farmaciaalquimia.dao;

import java.util.ArrayList;
import java.util.List;

import ml.farmaciaalquimia.model.Fabricante;

public class FabricanteDAO {
	
	private static List<Fabricante> fabricantes;
	
	
	public FabricanteDAO(){
		fabricantes=new ArrayList<>();
		fabricantes.add(new Fabricante(1L, "Morumba"));
		fabricantes.add(new Fabricante(2L, "Vitta"));
		fabricantes.add(new Fabricante(3L, "Samanbaiana"));
	}

	public List<Fabricante> listar(){
		return fabricantes;
	}
}
