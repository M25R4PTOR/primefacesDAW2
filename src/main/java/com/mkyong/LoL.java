package com.mkyong;

public class LoL {

	private String nombre;
	private String campeon;
	private String posicion;
	private Integer elo;
	private String liga;
	private String promocion;
	private String modalidad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCampeon() {
		return campeon;
	}

	public void setCampeon(String campeon) {
		this.campeon = campeon;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Integer getElo() {
		return elo;
	}

	public void setElo(Integer elo) {
		this.elo = elo;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}

	public String getPromocion() {
		return promocion;
	}

	public void setPromocion(String promocion) {
		this.promocion = promocion;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public LoL(String nombre, String campeon, String posicion, Integer elo, String liga, String promocion,
			String modalidad) {
		super();
		this.nombre = nombre;
		this.campeon = campeon;
		this.posicion = posicion;
		this.elo = elo;
		this.liga = liga;
		this.promocion = promocion;
		this.modalidad = modalidad;
	}

	public LoL() {
		super();
	}
}
