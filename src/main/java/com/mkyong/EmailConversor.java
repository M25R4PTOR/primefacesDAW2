package com.mkyong;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.mkyong.EmailConversor")
public class EmailConversor implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Map<String, Object> attributes = component.getAttributes();
		String formato = (String) attributes.get("separador");
		char aux = formato.charAt(0);

		if (value == null) {
			return null;
		}
		if (value.length() < 1) {
			throw new ConverterException(new FacesMessage("Email vacío"));
		}
		if (value.charAt(value.length() - 1) == aux) {
			throw new ConverterException(new FacesMessage("Un email no debe terminar en " + aux));
		}
		String[] trozos = value.split(Character.toString(aux));
		if (trozos.length == 2) {
			return new Email(trozos[0], trozos[1]);
		} else {
			throw new ConverterException(new FacesMessage("Error de usuario o dominio"));
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}
		if (value instanceof Email) {
			return value.toString();
		}

		throw new ConverterException("No es un objeto de tipo Email");
	}
}
