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
import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Vuelos;

public class ClienteDAOimplArchivo {
	
	public boolean alta (Cliente cliente) {
		ArrayList<Cliente> cl = new ArrayList();
		File file = new File ("cliente2.txt");
		boolean ok = false;
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			String lineas = "";
			
			while (linea = br.readLine()!= null) {
				lineas = lineas + linea + "-";
				
			}
			
			String[] lineas1 = lineas.split("_");
			
			for(int i = 0; i < lineas1.length; i++) {
				Cliente clt = new Cliente();
				
				String[] aux = lineas1[i].split(";");
				if(aux.length > 2) {
					ArrayList<Vuelos> vuelos = new ArrayList();
					
					clt.setNombre(aux[0]);
					clt.setId(aux[1]);
					
					String[] vuelosid = aux[2].split("-");
					for(int j = 0; j < vuelosid.length; j++) {
						VuelosDAO vd = VuelosFactory.GetImplementation("archivo");
						vuelos.add(vd.mostrar(vuelosid[j]));
					}
					
					lna.setVuelos(vuelos);
					
					int id = Integer.parseInt(aux[3]);
					CargablesSiemplesDAO csd = CargablesSimplesFactory.getDAOCS("archivo");
					
					
					clt.setAlianza(csd.mostrar("alianzas.txt", id));
					
					
					cl.add(clt);
				}	
			}
				
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		cl.add(cliente);
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < cl.size();i++ ) {
				String vuelos = "";
				for(int j = 0; j < cl.get(i).getVuelos().size(); j++ ) {
					vuelos = vuelos + cl.get(i).getVuelos().get(j).getId() + "-";
				}
				
				bw.write(cl.get(i).getNombre()+";"+cl.get(i).getId()+";"
						+vuelos+";"+cl.get(i).getAlianza().getId()+"\n");
			}
		ok = true;
	
		}catch(IOException  e) {
			e.printStackTrace();
		}
	}

}
