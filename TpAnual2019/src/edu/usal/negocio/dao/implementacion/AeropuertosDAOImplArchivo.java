package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.usal.negocio.dao.interfaces.AeropuertosDAO;
import edu.usal.negocio.dominio.Aeropuerto;

public  class AeropuertosDAOImplArchivo implements AeropuertosDAO{

	public Aeropuerto BuscarAeropuerto(String id) throws IOException {
		File archivo = new File("aeropuertos.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea = "";
		String lineas = "";
        
		while((linea= br.readLine()) != null) {
			lineas = lineas + linea + "_";
		}
		
		String[] lineas2 = lineas.split("_");
		ArrayList<Aeropuerto> listaaeropuerto = new ArrayList();

		for(int i = 0; i < lineas2.length;i++) {
			Aeropuerto aeropuerto = new Aeropuerto();
			String[] atrib = lineas2[i].split(";");
			aeropuerto.setIdAeropuerto(atrib[0]);
			aeropuerto.setCuidad(atrib[1]);
			aeropuerto.setProvincia(atrib[2]);
			aeropuerto.setPais(atrib[3]);
			listaaeropuerto.add(aeropuerto);	
		}
		for (int x=0;x<listaaeropuerto.size();x++){
			if (listaaeropuerto.get(x).getIdAeropuerto().equals(id)==true) {
	    		return listaaeropuerto.get(x);
	        }	
		}
		return null;
	}
}
