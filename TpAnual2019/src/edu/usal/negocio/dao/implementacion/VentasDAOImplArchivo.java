package edu.usal.negocio.dao.implementacion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Aeropuerto;
import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;

public class VentasDAOImplArchivo implements VuelosDAO{

	public void AgregarVuelo() throws IOException {

		File archivo = new File("Ventas.txt");
		FileWriter w = new FileWriter(archivo,true);
		BufferedWriter bw = new BufferedWriter(w);
		PrintWriter wr = new PrintWriter(bw);				

	String Ventas = pideVenta();
	System.out.println(Venta);
	wr.write(Venta);
	wr.close();

	}

	public void EliminarVuelo() throws FileNotFoundException, IOException {
		
	}

	public void ModificarVuelo() throws IOException {
		
	}

	public List<Vuelos> GetAll() throws IOException, ClassNotFoundException {
	
		return null;
	}

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

	
	
}
