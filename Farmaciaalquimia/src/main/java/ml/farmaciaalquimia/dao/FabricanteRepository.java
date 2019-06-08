package ml.farmaciaalquimia.dao;

import ml.farmaciaalquimia.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {


	Fabricante findByName(String name);

}
