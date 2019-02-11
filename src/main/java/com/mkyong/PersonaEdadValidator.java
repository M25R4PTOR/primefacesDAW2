package com.mkyong;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.mkyong.PersonaEdadValidator")
public class PersonaEdadValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_WARN, "La edad no puede ser nula.", null));
		}

		Integer valor = (Integer) value;

		if (valor < 1 || valor > 100) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"La edad debe estar comprendida entre 1 y 100 años.", null));
		}
	}
}
