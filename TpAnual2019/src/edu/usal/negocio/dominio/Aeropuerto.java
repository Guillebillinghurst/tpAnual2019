package edu.usal.negocio.dominio;

public class Aeropuerto {
	
	String idAeropuerto, cuidad, provincia, pais;

	public String getIdAeropuerto() {
		return idAeropuerto;
	}

	public void setIdAeropuerto(String idAeropuerto) {
		this.idAeropuerto = idAeropuerto;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
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

	public Aeropuerto(String idAeropuerto, String cuidad, String provincia, String pais) {
		super();
		this.idAeropuerto = idAeropuerto;
		this.cuidad = cuidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	public Aeropuerto() {}
	

}
