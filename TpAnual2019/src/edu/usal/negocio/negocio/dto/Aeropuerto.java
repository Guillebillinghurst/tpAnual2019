package edu.usal.negocio.negocio.dto;

public class Aeropuerto {
	private int identificacionAero;
	private String ciudad;
	private String provincia;
	private String pais;
	
	public int getIdentificacionAero() {
		return identificacionAero;
	}
	public void setIdentificacionAero(int identificacionAero) {
		this.identificacionAero = identificacionAero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
