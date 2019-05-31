package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Aeropuerto;
import edu.usal.negocio.dominio.Vuelos;


public class VuelosDAOImplArchivo implements VuelosDAO{

	private File archivo;
	private FileWriter archivoWritter;
	private FileReader archivoReader;
	private BufferedWriter archivoBufferWritter;
	private BufferedReader archivoBufferReader;
	
	
	public void AgregarVuelo() throws IOException {

			File archivo = new File("Vuelos1.txt");
			FileWriter w = new FileWriter(archivo,true);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);				
	
		String Vuelo = pideVuelo();
		System.out.println(Vuelo);
		wr.write(Vuelo);
		wr.close();
	
	}
	
	private String pideVuelo(){
		 
	        Scanner scn = new Scanner (System.in);
	        Vuelos vuelos = new Vuelos(); 
	        vuelos.setNroVuelo(scn.nextInt());
	        vuelos.setCantAsientos(scn.nextInt());
	        scn.nextLine();
	        
	        Aeropuerto aeropLlegada = new Aeropuerto();
	        Aeropuerto aeropSalida = new Aeropuerto();
	        
	        aeropSalida.setIdAeropuerto(scn.nextLine());
	        aeropLlegada.setIdAeropuerto(scn.nextLine());
	        
	        vuelos.setAeropuertoLlegada(aeropLlegada);
	        vuelos.setAeropuertoSalida(aeropSalida);
	        
	        scn.nextLine();
	        vuelos.setTiempoVuelo(scn.nextLine());
	        vuelos.setIdAereolinea(scn.nextInt());
		
	        return vuelos.getNroVuelo() + "NroVuelo;" + vuelos.getCantAsientos()+ "CantAsientos;" + aeropLlegada.getIdAeropuerto() + "aeropLlegada;" + aeropSalida.getIdAeropuerto() + "aeropSalida;" +vuelos.getTiempoVuelo() + "TiempoVuelo;" + vuelos.getIdAereolinea()+"IdAereolinea;\n" ;

		//return vuelos.getNroVuelo() + ";" + vuelos.getCantAsientos()+ ";" + aeropLlegada.getIdAeropuerto() + ";" + aeropSalida.getIdAeropuerto() + ";" +vuelos.getTiempoVuelo() + ";" + vuelos.getIdAereolinea()+";\n" ;

	}

	public void EliminarVuelo(Vuelos vuelo) {
		
	}

	@Override
	public void ModificarVuelo(Vuelos vuelo) {
		
	}

	public List<Vuelos> GetAll() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
