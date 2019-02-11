package com.mkyong;

public class Coche {

	private String id;
	
	private String marca;
	
	private String color;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Coche(String id, String marca, String color) {
		super();
		this.id = id;
		this.marca = marca;
		this.color = color;
	}
	
	
}
