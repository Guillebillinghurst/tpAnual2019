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

import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Aeropuerto;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Vuelos;


public class VuelosDAOImplArchivo implements VuelosDAO{
	
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
	        
	        aeropLlegada.setIdAeropuerto(scn.nextLine());
	        vuelos.setAeropuertoLlegada(aeropLlegada);
	     
	        aeropSalida.setIdAeropuerto(scn.nextLine());
	        vuelos.setAeropuertoSalida(aeropSalida);
	        vuelos.setTiempoVuelo(scn.nextLine());
	        vuelos.setIdAereolinea(scn.nextInt());
	        scn.close();
	        return vuelos.getNroVuelo() + ";" + vuelos.getCantAsientos()+ ";" + aeropLlegada.getIdAeropuerto() + ";" + aeropSalida.getIdAeropuerto() + ";" +vuelos.getTiempoVuelo() + ";" + vuelos.getIdAereolinea()+";\n" ;

	}
	public void EliminarVuelo() throws IOException {
		
		File archivo = new File("Vuelos1.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        Scanner scn = new Scanner (System.in);
        int NroVueloBorrar;
        NroVueloBorrar=scn.nextInt();
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Vuelos> vuelos = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Vuelos vuelo1 = new Vuelos();
			String[] atrib = lineas1[i].split(";");
			//System.out.println(atrib[0]);
				
			vuelo1.setNroVuelo(Integer.parseInt(atrib[0]));
			vuelo1.setCantAsientos(Integer.parseInt(atrib[1]));
			
	        Aeropuerto aeropLlegada = new Aeropuerto();
	        Aeropuerto aeropSalida = new Aeropuerto();
	        
	        aeropLlegada.setIdAeropuerto(atrib[2]);
	        vuelo1.setAeropuertoLlegada(aeropLlegada);
	        aeropSalida.setIdAeropuerto(atrib[3]);
	        vuelo1.setAeropuertoSalida(aeropSalida);
	        vuelo1.setTiempoVuelo(atrib[4]);
	        vuelo1.setIdAereolinea(Integer.parseInt(atrib[5]));
	        if (vuelo1.getNroVuelo()!=NroVueloBorrar) {
	        	vuelos.add(vuelo1);
		    }
			
		
		}
			
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);						
			
			for(int x=0;x<vuelos.size();x++) {
				wr.write(vuelos.get(x).getNroVuelo() + ";" + vuelos.get(x).getCantAsientos()+ ";" + vuelos.get(x).getAeropuertoLlegada().getIdAeropuerto() + ";" + vuelos.get(x).getAeropuertoSalida().getIdAeropuerto()+ ";" +vuelos.get(x).getTiempoVuelo() + ";" + vuelos.get(x).getIdAereolinea()+";\n" );
				
			}
		
			
			
	wr.close();	
	}
	public List<Vuelos> GetAll() throws IOException {
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
	        vuelo1.setIdAereolinea(Integer.parseInt(atrib[5]));
	        vuelos.add(vuelo1);
		}	
		
		for(int x=0;x<vuelos.size();x++) {
			System.out.println (vuelos.get(x).getNroVuelo() + ";" + vuelos.get(x).getCantAsientos()+ ";" + vuelos.get(x).getAeropuertoLlegada().getIdAeropuerto() + ";" + vuelos.get(x).getAeropuertoSalida().getIdAeropuerto()+ ";" +vuelos.get(x).getTiempoVuelo() + ";" + vuelos.get(x).getIdAereolinea()+";\n" );
		}	
		return null;
	}
	public void ModificarVuelo() throws IOException {		
		File archivo = new File("Vuelos1.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        Scanner scn = new Scanner (System.in);
        int NroVueloModificar;
        System.out.println("Vuelo a modificar");
        NroVueloModificar = scn.nextInt();
        
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
	        vuelo1.setIdAereolinea(Integer.parseInt(atrib[5]));
	        
	        if (vuelo1.getNroVuelo()!=NroVueloModificar) {
	        	vuelos.add(vuelo1);
	        	System.out.println(vuelo1.getNroVuelo());
		    }else{
		    	System.out.println("Entro");
		    	vuelo1=pideVueloModificado(NroVueloModificar);
		    	vuelos.add(vuelo1);
		    }
		}
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);						
			
			for(int x=0;x<vuelos.size();x++) {
				wr.write(vuelos.get(x).getNroVuelo() + ";" + vuelos.get(x).getCantAsientos()+ ";" + vuelos.get(x).getAeropuertoLlegada().getIdAeropuerto() + ";" + vuelos.get(x).getAeropuertoSalida().getIdAeropuerto()+ ";" +vuelos.get(x).getTiempoVuelo() + ";" + vuelos.get(x).getIdAereolinea()+";\n" );		
			}
			scn.close();
	wr.close();	
	
	}
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

}
