package com.mkyong;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "persona", eager = true)
@SessionScoped
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private Integer edad;
	private String sexo;
	private String aficion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAficion() {
		return aficion;
	}

	public void setAficion(String aficion) {
		this.aficion = aficion;
	}

	public Persona(String nombre, String apellido1, String apellido2, Integer edad, String sexo, String aficion) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.sexo = sexo;
		this.aficion = aficion;
	}

	public Persona() {
		super();
	}

	public void validarAficion(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		if (value == null || value == "") {
			throw new ValidatorException(
					new FacesMessage(FacesMessage.SEVERITY_WARN, "La afición no puede ser nula.", null));
		}
	}
}