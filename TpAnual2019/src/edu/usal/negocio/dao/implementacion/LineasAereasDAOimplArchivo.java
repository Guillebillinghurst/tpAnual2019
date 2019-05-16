package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
					
					CargablesSiemplesDAO cd = CargablesSimplesFactory.getDAOCS("archivo");
					
				}
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean baja(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificacion(int id, LineasAereas lineaaerea) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LineasAereas consulta(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
