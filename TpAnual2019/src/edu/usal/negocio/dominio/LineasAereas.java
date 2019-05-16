package edu.usal.negocio.dominio;

import java.util.ArrayList;

public class LineasAereas {
	
	private int id;
	private String Nombre;
	private ArrayList<Vuelos> vuelos;
	private CargablesSimples alianza;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Vuelos> getVuelos() {
		return vuelos;
	}
	public void setVuelos(ArrayList<Vuelos> vuelos) {
		this.vuelos = vuelos;
	}
	public CargablesSimples getAlianza() {
		return alianza;
	}
	public void setAlianza(CargablesSimples alianza) {
		this.alianza = alianza;
	}
	
	public LineasAereas() {
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((alianza == null) ? 0 : alianza.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vuelos == null) ? 0 : vuelos.hashCode());
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
		LineasAereas other = (LineasAereas) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (alianza == null) {
			if (other.alianza != null)
				return false;
		} else if (!alianza.equals(other.alianza))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (vuelos == null) {
			if (other.vuelos != null)
				return false;
		} else if (!vuelos.equals(other.vuelos))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LineasAereas [Nombre=" + Nombre + ", id=" + id + ", vuelos=" + vuelos + ", alianza=" + alianza + "]";
	}

	public String calcularId(String nombre, String alianza) {
		String id = "";
		id = nombre +"_"+ alianza;
		return id;
	}
}
