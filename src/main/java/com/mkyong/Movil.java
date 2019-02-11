package com.mkyong;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "movil", eager = true)
@SessionScoped
public class Movil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String marca;
	private String color;
	private String so;
	private Integer ram;
	private String version;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Movil(String marca, String color, String so, Integer ram, String version) {
		super();
		this.marca = marca;
		this.color = color;
		this.so = so;
		this.ram = ram;
		this.version = version;
	}

	public Movil() {
		super();
	}

	public void validarMarca(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "La marca no puede ser nula.", null));
		}

		String valor = value.toString();

		if (valor.matches(".*[0-9].*")) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "La marca no puede contener números.", null));
		}

		if (valor.length() < 2) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "La marca debe tener como mínimo 2 letras.", null));
		}
	}

	public void validarColor(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El color no puede ser nulo.", null));
		}

		String valor = value.toString();

		if (valor.matches(".*[0-9].*")) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_WARN, "El color no puede contener números.", null));
		}

		if (!valor.toUpperCase().matches("ROJO|PLATA|BLANCO|AZUL")) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "El color debe ser rojo, plata, blanco o azul", null));
		}
	}

	public void validarSO(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "El SO no puede ser nulo.", null));
		}

		String valor = value.toString();

		if (!valor.toUpperCase().matches("ANDROID|IOS")) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "El SO debe ser Android o IOS", null));
		}
	}

	public void validarRAM(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_WARN, "La RAM no puede ser nula.", null));
		}

		Integer valor = (Integer) value;

		if (valor < 4 || valor > 8) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "La RAM debe estar comprendida entre 4 y 8.", null));
		}
	}

	public void validarVersion(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "La versión no puede ser nula.", null));
		}

		String valor = value.toString();

		if (valor.toUpperCase().matches(".*[A-Z].*")) {
			context.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "La versión no puede contener letras.", null));
		}
	}
}
