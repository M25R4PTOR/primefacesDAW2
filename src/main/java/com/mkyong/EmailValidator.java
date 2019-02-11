package com.mkyong;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.mkyong.EmailValidator")
public class EmailValidator implements Validator {

	private String patron = "^\\S+@\\S+\\.\\S+$";

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null) {
			return;
		}

		String valor = value.toString();

		/*
		 * String separador = getValorParametro(component, "separador"); patron =
		 * value.replace("@", separador);
		 */

		if (!valor.matches(patron)) {
			throw new ValidatorException(new FacesMessage("Formato del email incorrecto."));
		}
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}
}