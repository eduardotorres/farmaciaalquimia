package ml.farmaciaalquimia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ml.farmaciaalquimia.model.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Long> {
	
	Produto findByName(String name);

}
