package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.usal.negocio.dao.factory.ClienteFactory;
import edu.usal.negocio.dao.factory.LineasAereasFactory;
import edu.usal.negocio.dao.factory.VuelosFactory;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dao.interfaces.LineasAereasDAO;
import edu.usal.negocio.dao.interfaces.VentasDAO;
import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Aeropuerto;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;

public class VentasDAOImplArchivo implements VentasDAO{

	public void AgregarVenta(Ventas venta) throws IOException {

		File archivo = new File("Ventas.txt");
		FileWriter w = new FileWriter(archivo,true);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr = new PrintWriter(bw);				

	String Ventas = venta.getId()+ ";" + venta.getCliente().getId()+ ";" + venta.getFormaPago()+ ";" + venta.getFechaVenta()+ ";" + venta.getHoraVenta()+ ";" + venta.getLineaaerea().getId()+ ";" + venta.getVuelo().getId();
	
	wr.write(Ventas);
	wr.close();
	}

	public void EliminarVenta(int id) throws ParseException, IOException {
		File archivo = new File("Ventas.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Ventas> ventas = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Ventas venta = new Ventas();
			String[] atrib = lineas1[i].split(";");
			
			VuelosDAO vuelos = VuelosFactory.GetImplementation("archivo");
			LineasAereasDAO lineasaereas = LineasAereasFactory.getDAO("archivo");
			ClienteDAO cliente = ClienteFactory.GetImplementation("archivo");
			
			venta.setId(Integer.parseInt(atrib[0]));	
			//FALTA METODO QUE DEVUELVE CLIENTE venta.setCliente(cliente.BUSCAR(atrib[1]));
			venta.setFormaPago(atrib[2]);
			venta.setFechaVenta(new SimpleDateFormat("dd/MM/yyyy").parse(atrib[3]));
			venta.setHoraVenta(new SimpleDateFormat("dd/MM/yyyy").parse(atrib[3]));;
			venta.setLineaaerea(lineasaereas.consulta(Integer.parseInt(atrib[5])));
			venta.setVuelo(vuelos.BuscarVuelo(Integer.parseInt(atrib[6])));
	        
		if (venta.getId()!=id) {
	        	ventas.add(venta);
		    }
		}
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);						
			
			for(int x=0;x<ventas.size();x++) {
				wr.write(ventas.get(x).getId()+ ";" + ventas.get(x).getCliente().getId()+ ";" + ventas.get(x).getFormaPago()+ ";" + ventas.get(x).getFechaVenta()+ ";" + ventas.get(x).getHoraVenta()+ ";" + ventas.get(x).getLineaaerea().getId()+ ";" + ventas.get(x).getVuelo().getId() );
			}
	wr.close();	
	}

	public void ModificarVenta(int id , Ventas ventaupd) throws IOException, ParseException {
		File archivo = new File("Ventas.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Ventas> ventas = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Ventas venta = new Ventas();
			String[] atrib = lineas1[i].split(";");
			
			VuelosDAO vuelos = VuelosFactory.GetImplementation("archivo");
			LineasAereasDAO lineasaereas = LineasAereasFactory.getDAO("archivo");
			ClienteDAO cliente = ClienteFactory.GetImplementation("archivo");
			
			venta.setId(Integer.parseInt(atrib[0]));	
			//FALTA METODO QUE DEVUELVE CLIENTE venta.setCliente(cliente.BUSCAR(atrib[1]));
			venta.setFormaPago(atrib[2]);
			venta.setFechaVenta(new SimpleDateFormat("dd/MM/yyyy").parse(atrib[3]));
			venta.setHoraVenta(new SimpleDateFormat("dd/MM/yyyy").parse(atrib[3]));;
			venta.setLineaaerea(lineasaereas.consulta(Integer.parseInt(atrib[5])));
			venta.setVuelo(vuelos.BuscarVuelo(Integer.parseInt(atrib[6])));
	        
		if (venta.getId()==id) {
	        	ventas.add(ventaupd);
		    }else{
		    	ventas.add(venta);
		    }
		}
			FileWriter w = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);						
			
			for(int x=0;x<ventas.size();x++) {
				wr.write(ventas.get(x).getId()+ ";" + ventas.get(x).getCliente().getId()+ ";" + ventas.get(x).getFormaPago()+ ";" + ventas.get(x).getFechaVenta()+ ";" + ventas.get(x).getHoraVenta()+ ";" + ventas.get(x).getLineaaerea().getId()+ ";" + ventas.get(x).getVuelo().getId() );
			}
	wr.close();	
		
	}

	public List<Ventas> GetAll() throws ParseException, IOException {
		File archivo = new File("Ventas.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
			}
		
		String[] lineas1 = lineas.split("_");

		ArrayList<Ventas> ventas = new ArrayList();
		
		for(int i = 0; i < lineas1.length; i++) {
			Ventas venta = new Ventas();
			String[] atrib = lineas1[i].split(";");
			
			VuelosDAO vuelos = VuelosFactory.GetImplementation("archivo");
			LineasAereasDAO lineasaereas = LineasAereasFactory.getDAO("archivo");
			ClienteDAO cliente = ClienteFactory.GetImplementation("archivo");
			
			venta.setId(Integer.parseInt(atrib[0]));	
			//FALTA METODO QUE DEVUELVE CLIENTE venta.setCliente(cliente.BUSCAR(atrib[1]));
			venta.setFormaPago(atrib[2]);
			venta.setFechaVenta(new SimpleDateFormat("dd/MM/yyyy").parse(atrib[3]));
			venta.setHoraVenta(new SimpleDateFormat("dd/MM/yyyy").parse(atrib[3]));;
			venta.setLineaaerea(lineasaereas.consulta(Integer.parseInt(atrib[5])));
			venta.setVuelo(vuelos.BuscarVuelo(Integer.parseInt(atrib[6])));
	        
	   	ventas.add(venta);
		}		
		return ventas;
	}

}




/*
 ATRIB 0* 	 venta.getId()+ ";" 
 ATRIB 1* + venta.getCliente().getId()+ ";" 
 ATRIB 2* + venta.getFormaPago()+ ";" 
 ATRIB 3* + venta.getFechaVenta()+ ";" 
 ATRIB 4* + venta.getHoraVenta()+ ";" 
 ATRIB 5* + venta.getLineaaerea().getId()+ ";" 
 ATRIB 6* + venta.getVuelo().getId();
	
 * 
 * 
 * 
private String pideVenta(){
	 
    Scanner scn = new Scanner (System.in);
    Ventas venta = new Ventas(); 
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
