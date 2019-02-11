package com.mkyong;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.mkyong.PersonaApellido2Validator")
public class PersonaApellido2Validator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_WARN, "El apellido 2 no puede ser nulo.", null));
		}

		String valor = value.toString();

		if (valor.matches(".*[0-9].*")) {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El apellido 2 no puede contener números.", null));
		}
	}
}
