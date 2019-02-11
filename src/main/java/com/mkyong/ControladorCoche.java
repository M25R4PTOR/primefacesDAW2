package com.mkyong;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dtCoche")
@ViewScoped
public class ControladorCoche implements Serializable{

	private List<Coche> coches;
	private List<Coche> cochesFiltrados;
	private List<String> colores;
	
	@PostConstruct
    public void init() {
		//Coches
        Coche c1 = new Coche("1","A","Rojo");
        Coche c2 = new Coche("2","B","Negro");
        Coche c3 = new Coche("3","C","Azul");
        Coche c4 = new Coche("4","D","Blanco");
		
        coches = new ArrayList<Coche>();
        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);
        
        colores = new ArrayList<String>();
        colores.add("Rojo");
        colores.add("Negro");
        colores.add("Azul");
        colores.add("Blanco");
    }


	public List<Coche> getCoches() {
		return coches;
	}

	public List<Coche> getCochesFiltrados() {
		return cochesFiltrados;
	}

	public void setCochesFiltrados(List<Coche> cochesFiltrados) {
		this.cochesFiltrados = cochesFiltrados;
	}

	public List<String> getColores() {
		return colores;
	}

	public void setColores(List<String> colores) {
		this.colores = colores;
	}


	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	
	
}