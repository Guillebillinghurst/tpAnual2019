package edu.usal.negocio.dao.implementacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.usal.negocio.dao.factory.CargablesSimplesFactory;
import edu.usal.negocio.dao.interfaces.CargablesSiemplesDAO;
import edu.usal.negocio.dominio.CargablesSimples;

public class CargablesSimplesDAOimplArchivo implements CargablesSiemplesDAO{

	
	public ArrayList<CargablesSimples> cargar(String path) {
		ArrayList<CargablesSimples> lista = new ArrayList();
		File file = new File(path);
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String lineas;
			String lineas1 = "";
			
			while((lineas = br.readLine()) != null) {
				lineas1 = lineas1 + lineas + "-";
			}
			
			String[] lineastotales = lineas1.split("-"); 
			
			for(int i = 0; i < lineastotales.length;i++) {
				String[] aux = lineastotales[i].split(";");
				CargablesSimples cs = new CargablesSimples();
				
				cs.setNombre(aux[0]);
				int id = Integer.parseInt(aux[1]);
				cs.setId(id);
				lista.add(cs);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public CargablesSimples mostrar(int id,String path) {
		CargablesSiemplesDAO cd = CargablesSimplesFactory.getDAOCS("archivo");
		ArrayList<CargablesSimples> lista = cd.cargar(path);
		CargablesSimples cs = new CargablesSimples();
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id){
				cs.setNombre(lista.get(i).getNombre());
				cs.setId(lista.get(i).getId());
			}
		}
		
		return cs;
	}

}
