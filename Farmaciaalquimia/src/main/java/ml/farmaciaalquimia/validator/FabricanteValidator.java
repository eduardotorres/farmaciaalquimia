package ml.farmaciaalquimia.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ml.farmaciaalquimia.model.Fabricante;

@Component
public class FabricanteValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return Fabricante.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		Fabricante fabricante = (Fabricante) o;
	}
	
	

}
