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
import edu.usal.negocio.dominio.Vuelo;


public class VuelosImplArchivo implements VuelosDAO{

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
		//pideVuelo();
		//String Vuelo = vuelo.getNumVuelo() + ";" + vuelo.getCantAsientos();
		String Vuelo = pideVuelo();
		System.out.println(Vuelo);
		wr.write(Vuelo);
		wr.close();
		

	}
	private String pideVuelo(){
		 
	        Scanner scn = new Scanner (System.in);
	        Vuelo vuelos = new Vuelo(); 
	        System.out.println("Nro Vuelo:");
	        vuelos.setNumVuelo(scn.nextInt());
	        System.out.println("Cant Asientos:");
	        vuelos.setCantAsientos(scn.nextInt());
	        System.out.println("Aer Llegada:");
	        vuelos.setAeropuertoLlegada(scn.nextInt());
	        System.out.println("Aer Salida:");
	        vuelos.setAeropuertoSalida(scn.nextInt());
	        System.out.println("FechaHora Llegada:");
	        //    vuelos.setFechaHoraLlegada(scn.());
	        System.out.println("FechaHora Salida:");
	    //    vuelos.setFechaHoraSalida(scn.);
	        scn.nextLine();
	        System.out.println("Tiempo Vuelo:");
	        vuelos.setTiempoVuelo(scn.nextLine());
	        System.out.println("ID Aereolinea:");
	        vuelos.setIdAerolinea(scn.nextInt());

		return vuelos.getNumVuelo() + ";" + vuelos.getCantAsientos()+ ";" + vuelos.getAeropuertoLlegada()+ ";" + vuelos.getAeropuertoSalida() + ";" +vuelos.getTiempoVuelo() + ";" + vuelos.getIdAerolinea()+";\n" ;
		
		
	}

	public void EliminarVuelo(Vuelo vuelo) {
		
		
	}

	@Override
	public void ModificarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}

	public List<Vuelo> GetAll() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void AgregarVuelo(Vuelo vuelo) throws IOException {
		// TODO Auto-generated method stub
		
	}
	

}
