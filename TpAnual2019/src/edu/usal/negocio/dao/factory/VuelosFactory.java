package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.VuelosDAOImplArchivo;
import edu.usal.negocio.dao.implementacion.VuelosDAOimplBD;
import edu.usal.negocio.dao.interfaces.VuelosDAO;

public class VuelosFactory {
	public static VuelosDAO GetImplementation(String source){
		if (source.equals("archivo")){
			return new VuelosDAOImplArchivo();
		}else if (source.equals("Serializacion")){
			return new VuelosDAOimplBD();
		}
		else {
			return null;
		}
	}
}