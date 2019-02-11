package com.mkyong;

import java.io.Serializable;

public class Juego implements Serializable{

	private String nombre;
	
	private String genero;
	
	private String comentario;
	
	private Integer puntuacion;
	
	private double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Juego(String nombre, String genero, String comentario, Integer puntuacion, double precio) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.comentario = comentario;
		this.puntuacion = puntuacion;
		this.precio = precio;
	}
	
	public Juego() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comentario == null) ? 0 : comentario.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((puntuacion == null) ? 0 : puntuacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		if (comentario == null) {
			if (other.comentario != null)
				return false;
		} else if (!comentario.equals(other.comentario))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (puntuacion == null) {
			if (other.puntuacion != null)
				return false;
		} else if (!puntuacion.equals(other.puntuacion))
			return false;
		return true;
	}
	
	
}
