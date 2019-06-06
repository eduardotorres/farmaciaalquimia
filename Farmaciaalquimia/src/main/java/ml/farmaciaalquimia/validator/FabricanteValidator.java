package ml.farmaciaalquimia.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ml.farmaciaalquimia.model.Fabricante;
import ml.farmaciaalquimia.service.FabricanteService;

@Component
public class FabricanteValidator implements Validator {
	
	@Autowired
	private FabricanteService fabricanteService;

	@Override
	public boolean supports(Class<?> aClass) {
		return Fabricante.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Fabricante fabricante = (Fabricante) o;
	}
	
	

}
