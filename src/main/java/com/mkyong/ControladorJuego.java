package com.mkyong;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

@ManagedBean(name="controladorJuego")
@ViewScoped
public class ControladorJuego implements Serializable{

	private List<Juego> juegos;
	private List<String> generos;
	
	private Juego nuevo;
	
	private Juego juegoElegido;
	
	@PostConstruct
    public void init() {
		generos = new ArrayList<String>();
		generos.add("Acción");
		generos.add("Horror");
		generos.add("Survival");
		generos.add("RPG");
		generos.add("Simulación");
		generos.add("Deportes");
		generos.add("Shooter");
		
        juegos = new ArrayList<Juego>();
 
		nuevo = new Juego();
    }

	public void añadirJuego() {
		juegos.add(this.nuevo);
		nuevo = new Juego();
	}
	
	public void editarJuego() {
		for(Juego game : juegos) {
			if(game.equals(juegoElegido)) {
				Integer aux = juegos.indexOf(game);
				juegos.get(aux).setNombre(juegoElegido.getNombre());
				juegos.get(aux).setGenero(juegoElegido.getGenero());
				juegos.get(aux).setComentario(juegoElegido.getComentario());
				juegos.get(aux).setPuntuacion(juegoElegido.getPuntuacion());
				juegos.get(aux).setPrecio(juegoElegido.getPrecio());
			}
		}
	}
	
	public List<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	public Juego getNuevo() {
		return nuevo;
	}

	public void setNuevo(Juego nuevo) {
		this.nuevo = nuevo;
	}
	
	public Juego getJuegoElegido() {
		return juegoElegido;
	}

	public void setJuegoElegido(Juego juegoElegido) {
		this.juegoElegido = juegoElegido;
	}

	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Juego editado", ((Juego) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edición cancelada", ((Juego) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
