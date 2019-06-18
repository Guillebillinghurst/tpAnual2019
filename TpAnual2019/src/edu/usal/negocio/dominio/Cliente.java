package edu.usal.negocio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Cliente implements Serializable{
	
	int id;
	String Nombre, Apellido, dni, cuit, cuil, email;
	Date fechaNacimiento;
	Pasaporte pasaporte = new Pasaporte();
	Telefono telefono = new Telefono();
	NroPasajeroFrecuente nroPasajeroFrecuente = new NroPasajeroFrecuente();
	DireccionCompleta direccionCompleta = new DireccionCompleta();
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getcuit() {
		return cuit;
	}
	public void setcuit(String cuit) {
		this.cuit = cuit;
	}
	public String getcuil() {
		return cuil;
	}
	public void setcuil(String cuil) {
		this.cuil = cuil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Pasaporte getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
		
	}
	public NroPasajeroFrecuente getNroPasajeroFrecuente() {
		return nroPasajeroFrecuente;
	}
	public void setNroPasajeroFrecuente(NroPasajeroFrecuente nroPasajeroFrecuente) {
		this.nroPasajeroFrecuente = nroPasajeroFrecuente;
	}
	public DireccionCompleta getDireccionCompleta() {
		return direccionCompleta;
	}
	public void setDireccionCompleta(DireccionCompleta direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}
	public Cliente(String nombre, String apellido, String dni, String cuit, String cuil, String email,
			Date fechaNacimiento, Pasaporte pasaporte, Telefono telefono, 
			NroPasajeroFrecuente nroPasajeroFrecuente, DireccionCompleta direccionCompleta) 
	{
		super();
		Nombre = nombre;
		Apellido = apellido;
		this.dni = dni;
		this.cuit = cuit;
		this.cuil = cuil;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.pasaporte = pasaporte;
		this.telefono = telefono;
		this.nroPasajeroFrecuente = nroPasajeroFrecuente;
		this.direccionCompleta = direccionCompleta;
	}
	
	public Cliente() {
		
	}
	public ArrayList<Cliente> getVuelos() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Cliente getAlianza() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAlianza(CargablesSimples mostrar) {
		// TODO Auto-generated method stub
		
	}	
	
}
