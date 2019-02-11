package com.mkyong;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.mkyong.PersonaApellido1Validator")
public class PersonaApellido1Validator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_WARN, "El apellido 1 no puede ser nulo.", null));
		}

		String valor = (String) value;

		if (valor.matches(".*[0-9].*")) {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El apellido 1 no puede contener números.", null));
		}
	}
}
