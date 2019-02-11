package com.mkyong;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.mkyong.PersonaSexoValidator")
public class PersonaSexoValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_WARN, "El sexo no puede ser nulo.", null));
		}

		String valor = (String) value;

		if (!valor.toUpperCase().matches("M|F")) {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El sexo solo puede ser M o F", null));
		}
	}
}
