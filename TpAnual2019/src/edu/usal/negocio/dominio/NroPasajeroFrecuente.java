package edu.usal.negocio.dominio;

import java.io.Serializable;

public class NroPasajeroFrecuente implements Serializable {
	
	String Alianza, Aerolinea, Numero,Categoria;

	public String getAlianza() {
		return Alianza;
	}

	public void setAlianza(String alianza) {
		Alianza = alianza;
	}

	public String getAerolinea() {
		return Aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		Aerolinea = aerolinea;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public NroPasajeroFrecuente(String alianza, String aerolinea, String numero, 
			String categoria) {
		super();
		Alianza = alianza;
		Aerolinea = aerolinea;
		Numero = numero;
		Categoria = categoria;
	}
	
	public NroPasajeroFrecuente() {
		
	}

}
