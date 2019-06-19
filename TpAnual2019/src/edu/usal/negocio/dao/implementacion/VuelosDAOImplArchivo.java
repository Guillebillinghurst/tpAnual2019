package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Line;

import edu.usal.negocio.dao.factory.AeropuertosFactory;
import edu.usal.negocio.dao.factory.LineasAereasFactory;
import edu.usal.negocio.dao.factory.VuelosFactory;
import edu.usal.negocio.dao.interfaces.AeropuertosDAO;
import edu.usal.negocio.dao.interfaces.LineasAereasDAO;
import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Aeropuerto;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Vuelos;


public class VuelosDAOImplArchivo implements VuelosDAO{
	
	public void AgregarVuelo(Vuelos vuelo) throws IOException {

			File archivo = new File("Vuelos1.txt");
			FileWriter w = new FileWriter(archivo,true);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);				
	
		String Vuelo = vuelo.getNroVuelo() + ";" + vuelo.getCantAsientos()+ ";" + vuelo.getAeropuertoLlegada().getIdAeropuerto() + ";" + vuelo.getAeropuertoSalida().getIdAeropuerto() + ";" +vuelo.getTiempoVuelo() + ";" + vuelo.getAerolinea().getId()+";\n" ;

		wr.write(Vuelo);
		wr.close();
	
	}
	public void EliminarVuelo(int id) throws IOException {
		
		File archivo = new File("Vuelos1.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Vuelos> vuelos = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Vuelos vuelo1 = new Vuelos();
			String[] atrib = lineas1[i].split(";");
				
			vuelo1.setNroVuelo(Integer.parseInt(atrib[0]));
			vuelo1.setCantAsientos(Integer.parseInt(atrib[1]));
			
	        Aeropuerto aeropLlegada = new Aeropuerto();
	        Aeropuerto aeropSalida = new Aeropuerto();
	        
	        aeropLlegada.setIdAeropuerto(atrib[2]);
	        vuelo1.setAeropuertoLlegada(aeropLlegada);
	        aeropSalida.setIdAeropuerto(atrib[3]);
	        vuelo1.setAeropuertoSalida(aeropSalida);
	        vuelo1.setTiempoVuelo(atrib[4]);
	        LineasAereas aerolinea = new LineasAereas();
	        aerolinea.setId(atrib[5]);
	        
	        if (vuelo1.getId()!=id) {
	        	vuelos.add(vuelo1);
		    }
		}
			
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);						
			
			for(int x=0;x<vuelos.size();x++) {
				wr.write(vuelos.get(x).getNroVuelo() + ";" + vuelos.get(x).getCantAsientos()+ ";" + vuelos.get(x).getAeropuertoLlegada().getIdAeropuerto() + ";" + vuelos.get(x).getAeropuertoSalida().getIdAeropuerto()+ ";" +vuelos.get(x).getTiempoVuelo() + ";" + vuelos.get(x).getAerolinea().getId()+";\n" );
			}
	wr.close();	
	}
	public void ModificarVuelo(int id, Vuelos vuelo) throws IOException {		
		File archivo = new File("Vuelos1.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        Scanner scn = new Scanner (System.in);
        
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Vuelos> vuelos = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Vuelos vuelo1 = new Vuelos();
			String[] atrib = lineas1[i].split(";");
	
			vuelo1.setNroVuelo(Integer.parseInt(atrib[0]));
			vuelo1.setCantAsientos(Integer.parseInt(atrib[1]));
			
	        Aeropuerto aeropLlegada = new Aeropuerto();
	        Aeropuerto aeropSalida = new Aeropuerto();
	        
	        aeropLlegada.setIdAeropuerto(atrib[2]);
	        vuelo1.setAeropuertoLlegada(aeropLlegada);
	        aeropSalida.setIdAeropuerto(atrib[3]);
	        vuelo1.setAeropuertoSalida(aeropSalida);
	        vuelo1.setTiempoVuelo(atrib[4]);
	        LineasAereas aerolinea = new LineasAereas();
	        aerolinea.setId((atrib[5]));
	        
	        if (vuelo1.getNroVuelo()!=id) {
	        	vuelos.add(vuelo1);
	        	System.out.println(vuelo1.getNroVuelo());
		    }else{
		    	vuelo1=vuelo;
		    	vuelos.add(vuelo1);
		    }
		}
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);						
			
			for(int x=0;x<vuelos.size();x++) {
				wr.write(vuelos.get(x).getNroVuelo() + ";" + vuelos.get(x).getCantAsientos()+ ";" + vuelos.get(x).getAeropuertoLlegada().getIdAeropuerto() + ";" + vuelos.get(x).getAeropuertoSalida().getIdAeropuerto()+ ";" +vuelos.get(x).getTiempoVuelo() + ";" + vuelos.get(x).getAerolinea().getId()+";\n" );		
			}
			scn.close();
	wr.close();	
	
	}
	public List<Vuelos> GetAll() throws IOException {
		File archivo = new File("Vuelos1.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
    
        while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Vuelos> vuelos = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Vuelos vuelo1 = new Vuelos();
			String[] atrib = lineas1[i].split(";");
				
			vuelo1.setNroVuelo(Integer.parseInt(atrib[0]));
			vuelo1.setCantAsientos(Integer.parseInt(atrib[1]));
			
			AeropuertosDAO aeropuerto = AeropuertosFactory.GetImplementation("archivo");
			LineasAereasDAO lineasaereas = LineasAereasFactory.getDAO("archivo");
	           
	        vuelo1.setAeropuertoLlegada(aeropuerto.BuscarAeropuerto(atrib[2]));
	        vuelo1.setAeropuertoSalida(aeropuerto.BuscarAeropuerto(atrib[3]));
	        vuelo1.setTiempoVuelo(atrib[4]);
	        vuelo1.setAerolinea(lineasaereas.consulta(Integer.parseInt(atrib[5])));
			vuelos.add(vuelo1);
		}	
		return vuelos;
	}
	
	public Vuelos BuscarVuelo(int id) throws IOException {
			File archivo = new File("Vuelos1.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String lineas = "";
	        
			while((linea= br.readLine()) != null) {
				lineas = lineas + linea + "_";
			}
			
			String[] lineas1 = lineas.split("_");
			ArrayList<Vuelos> vuelos = new ArrayList();

			for(int i = 0; i < lineas1.length; i++) {
				Vuelos vuelo1 = new Vuelos();
				String[] atrib = lineas1[i].split(";");
					
				vuelo1.setNroVuelo(Integer.parseInt(atrib[0]));
				vuelo1.setCantAsientos(Integer.parseInt(atrib[1]));
				
		        AeropuertosDAO aeropuerto = AeropuertosFactory.GetImplementation("archivo");
		        LineasAereasDAO lineasaereas = LineasAereasFactory.getDAO("archivo");
		        
		        vuelo1.setAeropuertoLlegada(aeropuerto.BuscarAeropuerto(atrib[2]));
		        vuelo1.setAeropuertoSalida(aeropuerto.BuscarAeropuerto(atrib[3]));
		        vuelo1.setTiempoVuelo(atrib[4]);
		        vuelo1.setAerolinea(lineasaereas.consulta(Integer.parseInt(atrib[5])));
		        vuelos.add(vuelo1);
			}
			for (int x = 0; x < vuelos.size(); x++){
				if (vuelos.get(x).getId()==id) {
			        	return vuelos.get(x);
			        }
			}
			return null;
	}

	/*
	private Vuelos pideVueloModificado(int vueloamodifcar){
		 
        Scanner scn1 = new Scanner (System.in);
        Vuelos vuelos = new Vuelos(); 
        vuelos.setNroVuelo(vueloamodifcar);
        vuelos.setCantAsientos(scn1.nextInt());
        scn1.nextLine();
        
        Aeropuerto aeropLlegada = new Aeropuerto();
        Aeropuerto aeropSalida = new Aeropuerto();
        
        aeropLlegada.setIdAeropuerto(scn1.nextLine());
        vuelos.setAeropuertoLlegada(aeropLlegada);
        aeropSalida.setIdAeropuerto(scn1.nextLine());
        vuelos.setAeropuertoSalida(aeropSalida);
        vuelos.setTiempoVuelo(scn1.nextLine());
        vuelos.setIdAereolinea(scn1.nextInt());
        scn1.close();
        return vuelos;
        }
	*/
	/*private String pideVuelo(){
		 
        Scanner scn = new Scanner (System.in);
        Vuelos vuelos = new Vuelos(); 
        vuelos.setNroVuelo(scn.nextInt());
        vuelos.setCantAsientos(scn.nextInt());
        scn.nextLine();
        
        Aeropuerto aeropLlegada = new Aeropuerto();
        Aeropuerto aeropSalida = new Aeropuerto();
        
        aeropLlegada.setIdAeropuerto(scn.nextLine());
        vuelos.setAeropuertoLlegada(aeropLlegada);
     
        aeropSalida.setIdAeropuerto(scn.nextLine());
        vuelos.setAeropuertoSalida(aeropSalida);
        vuelos.setTiempoVuelo(scn.nextLine());
        vuelos.setIdAereolinea(scn.nextInt());
        scn.close();
        return vuelos.getNroVuelo() + ";" + vuelos.getCantAsientos()+ ";" + aeropLlegada.getIdAeropuerto() + ";" + aeropSalida.getIdAeropuerto() + ";" +vuelos.getTiempoVuelo() + ";" + vuelos.getIdAereolinea()+";\n" ;

}
*/
	
}
