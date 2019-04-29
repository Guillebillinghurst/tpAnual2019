package edu.usal.negocio.negocio.dto;

import java.util.Date;

public class Cliente {


	private String Nombre;
	private String Apellido;
	private String DNI;
	private Pasaporte Pasap;
	private Date FechaNacimiento;
	private PasajeroFrecuente PasajFrec;
	private String Pais;
	private String Provincia;
	private String Ciudad;

	
	public Cliente(){
		Pasap = new Pasaporte();
		PasajFrec = new PasajeroFrecuente();
	/*	Date d = new Date();
		d.getTime();
		Nombre="ag";
		Apellido="san";
		DNI="1";
		FechaNacimiento=d;
		Pais="arg";
		Provincia="ba";
		Ciudad="bas";
		Pasap.setFechaEmision(d);
		Pasap.setFechaVencimiento(d);
		Pasap.setNumPasaporte("43");
		Pasap.setPaisEmision("arg");
		PasajFrec.setAerolinea("fsdf");
		PasajFrec.setNumero("4345");*/
	}
	
	public Cliente(String nombre, String apellido, String dNI, Date fechaNacimiento, String pais, String provincia, String ciudad) {
	//	super()
		Pasap = new Pasaporte();
		PasajFrec = new PasajeroFrecuente();
		Nombre = nombre;
		Apellido = apellido;
		DNI = dNI;
		FechaNacimiento = fechaNacimiento;
		Pais = pais;
		Provincia = provincia;
		Ciudad = ciudad;
	}
	
	
	
	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Pasaporte getPasap() {
		return Pasap;
	}
	public void setPasap(Pasaporte pasap) {
		Pasap = pasap;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public PasajeroFrecuente getPasajFrec() {
		return PasajFrec;
	}
	public void setPasajFrec(PasajeroFrecuente pasajFrec) {
		PasajFrec = pasajFrec;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
}
