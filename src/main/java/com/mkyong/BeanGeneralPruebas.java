package com.mkyong;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean(name = "beanGeneralPruebas")
@ViewScoped
public class BeanGeneralPruebas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private Integer edad;

	@NotNull(message = "No puede ser nulo")
	private String renombre;

	@Size(min = 0, max = 100, message = "Debe estar comprendido entre 0 y 100")
	private Integer reedad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRenombre() {
		return renombre;
	}

	public void setRenombre(String renombre) {
		this.renombre = renombre;
	}

	public Integer getReedad() {
		return reedad;
	}

	public void setReedad(Integer reedad) {
		this.reedad = reedad;
	}

}
