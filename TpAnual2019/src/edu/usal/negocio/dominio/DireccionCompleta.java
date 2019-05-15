package edu.usal.negocio.dominio;

import java.io.Serializable;

public class DireccionCompleta implements Serializable {

	private int  id;
	private String calle, altura, ciudad, codigopostal;
	private CargablesSimples provincia ;
	private CargablesSimples pais; 
	
}