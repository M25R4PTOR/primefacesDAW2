package com.mkyong;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "validacion", eager = true)
@SessionScoped
public class Validacion implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre;

	private Integer edad;

	private Double salario;

	private String email;
	private String email2;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

}