package com.mkyong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
@ViewScoped
public class Login {

	private String usuario;
	
	private String pass;
	
	private String coche;  
    private List<SelectItem> coches;
	
	private String ciudad;  
    private Map<String,String> ciudades = new HashMap<String, String>();

	public Login() {
		
	}
	
	@PostConstruct
    public void init() {
		//Coches
        SelectItemGroup c1 = new SelectItemGroup("Coches reales");
        c1.setSelectItems(new SelectItem[] {new SelectItem("Ford", "Ford"), new SelectItem("Mercedes", "Mercedes"), new SelectItem("Renault", "Renault")});
         
        SelectItemGroup c2 = new SelectItemGroup("Coches fantásticos");
        c2.setSelectItems(new SelectItem[] {new SelectItem("Batmóvil", "Batmóvil"), new SelectItem("Halcón Milenario", "Halcón Milenario"), new SelectItem("Algo", "Algo")});
         
        coches = new ArrayList<SelectItem>();
        coches.add(c1);
        coches.add(c2);
		
		//Ciudades
		ciudades = new HashMap<String, String>();
		ciudades.put("Sevilla", "Sevilla");
		ciudades.put("Córdoba","Córdoba");
		ciudades.put("Granada","Granada");
		ciudades.put("Málaga","Málaga");
		ciudades.put("Cádiz","Cádiz");
		ciudades.put("Jaén","Jaén");
    }
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Map<String, String> getCiudades() {
		return ciudades;
	}

	public String getCoche() {
		return coche;
	}

	public void setCoche(String coche) {
		this.coche = coche;
	}

	public List<SelectItem> getCoches() {
		return coches;
	}
	
	
}