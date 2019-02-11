package com.mkyong;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.mkyong.PersonaNombreValidator")
public class PersonaNombreValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			// throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_WARN, "El
			// nombre no puede ser nulo.", null));
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "El nombre no puede ser nulo.", null));
		}

		String valor = value.toString();

		if (valor.matches(".*[0-9].*")) {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El nombre no puede contener números.", null));
		}

		if (valor.length() < 3) {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El nombre debe tener como mínimo 3 letras.", null));
		}

		UIInput aux1 = (UIInput) component.getAttributes().get("apellido1");
		String ap1 = (String) aux1.getSubmittedValue();
		UIInput aux2 = (UIInput) component.getAttributes().get("apellido2");
		String ap2 = (String) aux2.getSubmittedValue();

		if (ap1 != null && ap2 != null) {
			if (ap1.equals(valor) || ap2.equals(valor)) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_INFO,
						"El nombre no debe ser igual que los apellidos.", null));
			}
		}
	}
}
