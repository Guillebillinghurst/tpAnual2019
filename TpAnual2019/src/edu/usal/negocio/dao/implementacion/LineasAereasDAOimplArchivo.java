package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import edu.usal.negocio.dao.factory.CargablesSimplesFactory;
import edu.usal.negocio.dao.factory.VuelosFactory;
import edu.usal.negocio.dao.interfaces.CargablesSiemplesDAO;
import edu.usal.negocio.dao.interfaces.LineasAereasDAO;
import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.CargablesSimples;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.negocio.dominio.Vuelos;

public class LineasAereasDAOimplArchivo implements LineasAereasDAO{

	
	public boolean alta(LineasAereas lineaaerea) {
		ArrayList<LineasAereas> la = new ArrayList();
		File file = new File("lineasaereas.txt");
		boolean ok = false;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String lineas = "";
			
			while((linea = br.readLine()) != null) {
				lineas = lineas + linea + "_";
			}
			
			String[] lineas1 = lineas.split("_");
			
			for(int i = 0; i < lineas1.length; i++) {
				LineasAereas lna = new LineasAereas();
				
				String[] aux = lineas1[i].split(";");
				if(aux.length > 2) {
					ArrayList<Vuelos> vuelos = new ArrayList();
					
					lna.setNombre(aux[0]);
					lna.setId(aux[1]);
					
					String[] vuelosid = aux[2].split("-");
					for(int j = 0; j < vuelosid.length; j++) {
						VuelosDAO vd = VuelosFactory.GetImplementation("archivo");
						vuelos.add(vd.mostrar(vuelosid[j]));
					}
					
					lna.setVuelos(vuelos);
					
					int id = Integer.parseInt(aux[3]);
					CargablesSiemplesDAO csd = CargablesSimplesFactory.getDAOCS("archivo");
					
					
					lna.setAlianza(csd.mostrar("alianzas.txt", id));
					
					
					la.add(lna);
				}	
			}
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//lo anterior carga el archivo y me da una lista a la cual dar de alta 
		
		la.add(lineaaerea);
		
		// en la linea doy de alta en la lista que recupére del archivo
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < la.size();i++ ) {
				String vuelos = "";
				for(int j = 0; j < la.get(i).getVuelos().size(); j++ ) {
					vuelos = vuelos + la.get(i).getVuelos().get(j).getId() + "-";
				}
				
				bw.write(la.get(i).getNombre()+";"+la.get(i).getId()+";"
						+vuelos+";"+la.get(i).getAlianza().getId()+"\n");
			}
		ok = true;
	
		}catch(IOException  e) {
			e.printStackTrace();
		}
		// aca vuelvo a guardar la lista pero con la linea aerea agregada 
		
		return ok;
	}

	
	public boolean baja(int id) {
		ArrayList<LineasAereas> la = new ArrayList();
		File file = new File("lineasaereas.txt");
		boolean ok = false;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String lineas = "";
			
			while((linea = br.readLine()) != null) {
				lineas = lineas + linea + "_";
			}
			
			String[] lineas1 = lineas.split("_");
			
			for(int i = 0; i < lineas1.length; i++) {
				LineasAereas lna = new LineasAereas();
				
				String[] aux = lineas1[i].split(";");
				if(aux.length > 2) {
					ArrayList<Vuelos> vuelos = new ArrayList();
					
					lna.setNombre(aux[0]);
					lna.setId(aux[1]);
					
					String[] vuelosid = aux[2].split("-");
					for(int j = 0; j < vuelosid.length; j++) {
						VuelosDAO vd = VuelosFactory.GetImplementation("archivo");
						vuelos.add(vd.mostrar(vuelosid[j]));
					}
					
					lna.setVuelos(vuelos);
					
					int idd = Integer.parseInt(aux[3]);
					CargablesSiemplesDAO csd = CargablesSimplesFactory.getDAOCS("archivo");
					
					
					lna.setAlianza(csd.mostrar("alianzas.txt", idd));
					
					
					la.add(lna);
				}	
			}
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < la.size();i++) {
			if((la.get(i).getId().equals(id)) == true) {
				la.remove(i);
				ok = true;
			}
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < la.size();i++ ) {
				String vuelos = "";
				for(int j = 0; j < la.get(i).getVuelos().size(); j++ ) {
					vuelos = vuelos + la.get(i).getVuelos().get(j).getId() + "-";
				}
				
				bw.write(la.get(i).getNombre()+";"+la.get(i).getId()+";"
						+vuelos+";"+la.get(i).getAlianza().getId()+"\n");
			}
	
		}catch(IOException  e) {
			e.printStackTrace();
		}
		return ok;
	}

	public boolean modificacion(int id, LineasAereas lineaaerea) {
		ArrayList<LineasAereas> la = new ArrayList();
		File file = new File("lineasaereas.txt");
		boolean ok = false;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String lineas = "";
			
			while((linea = br.readLine()) != null) {
				lineas = lineas + linea + "_";
			}
			
			String[] lineas1 = lineas.split("_");
			
			for(int i = 0; i < lineas1.length; i++) {
				LineasAereas lna = new LineasAereas();
				
				String[] aux = lineas1[i].split(";");
				if(aux.length > 2) {
					ArrayList<Vuelos> vuelos = new ArrayList();
					
					lna.setNombre(aux[0]);
					lna.setId(aux[1]);
					
					String[] vuelosid = aux[2].split("-");
					for(int j = 0; j < vuelosid.length; j++) {
						VuelosDAO vd = VuelosFactory.GetImplementation("archivo");
						vuelos.add(vd.mostrar(vuelosid[j]));
					}
					
					lna.setVuelos(vuelos);
					
					int idd = Integer.parseInt(aux[3]);
					CargablesSiemplesDAO csd = CargablesSimplesFactory.getDAOCS("archivo");
					
					
					lna.setAlianza(csd.mostrar("alianzas.txt", idd));
					
					
					la.add(lna);
				}	
			}
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < la.size(); i++) {
			if((la.get(i).getId().equals(id)) == true ) {
				la.set(i, lineaaerea);
			}
			ok = true;
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < la.size();i++ ) {
				String vuelos = "";
				for(int j = 0; j < la.get(i).getVuelos().size(); j++ ) {
					vuelos = vuelos + la.get(i).getVuelos().get(j).getId() + "-";
				}
				
				bw.write(la.get(i).getNombre()+";"+la.get(i).getId()+";"
						+vuelos+";"+la.get(i).getAlianza().getId()+"\n");
			}
	
		}catch(IOException  e) {
			e.printStackTrace();
		}
		
		return ok;
	}

	
	public LineasAereas consulta(int id) {
		ArrayList<LineasAereas> la = new ArrayList();
		File file = new File("lineasaereas.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String lineas = "";
			
			while((linea = br.readLine()) != null) {
				lineas = lineas + linea + "_";
			}
			
			String[] lineas1 = lineas.split("_");
			
			for(int i = 0; i < lineas1.length; i++) {
				LineasAereas lna = new LineasAereas();
				
				String[] aux = lineas1[i].split(";");
				if(aux.length > 2) {
					ArrayList<Vuelos> vuelos = new ArrayList();
					
					lna.setNombre(aux[0]);
					lna.setId(aux[1]);
					
					String[] vuelosid = aux[2].split("-");
					for(int j = 0; j < vuelosid.length; j++) {
						VuelosDAO vd = VuelosFactory.GetImplementation("archivo");
						vuelos.add(vd.mostrar(vuelosid[j]));
					}
					
					lna.setVuelos(vuelos);
					
					int idd = Integer.parseInt(aux[3]);
					CargablesSiemplesDAO csd = CargablesSimplesFactory.getDAOCS("archivo");
					
					
					lna.setAlianza(csd.mostrar("alianzas.txt", idd));
					
					
					la.add(lna);
				}	
			}
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		int posicion = la.size() + 2;
		
		for(int i = 0; i < la.size(); i++) {
			if((la.get(i).getId().equals(id)) == true) {
				posicion = i;
			}
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < la.size();i++ ) {
				String vuelos = "";
				for(int j = 0; j < la.get(i).getVuelos().size(); j++ ) {
					vuelos = vuelos + la.get(i).getVuelos().get(j).getId() + "-";
				}
				
				bw.write(la.get(i).getNombre()+";"+la.get(i).getId()+";"
						+vuelos+";"+la.get(i).getAlianza().getId()+"\n");
			}
	
		}catch(IOException  e) {
			e.printStackTrace();
		}  
		
		return la.get(posicion);
	}
}
