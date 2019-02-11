package com.mkyong;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "lolVista", eager = true)
@SessionScoped
public class LoLVista implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoL lol;

	public LoL getLol() {
		return lol;
	}

	public void setLol(LoL lol) {
		this.lol = lol;
	}

	public LoLVista() {
		this.lol = new LoL();
	}

	public void validarLOL(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String nombre = lol.getNombre();
		String campeon = lol.getCampeon();
		String posicion = lol.getPosicion();
		Integer elo = lol.getElo();
		String liga = lol.getLiga();
		String promocion = lol.getPromocion();
		String modalidad = value.toString();

		if (promocion.equals("hola")) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "pruebaaaa.", null));
		}
	}
}
