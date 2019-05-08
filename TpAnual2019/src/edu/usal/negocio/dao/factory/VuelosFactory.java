package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.VuelosImplArchivo;
import edu.usal.negocio.dao.implementacion.VuelosImplStream;
import edu.usal.negocio.dao.interfaces.VuelosDAO;

public class VuelosFactory {
	public static VuelosDAO GetImplementation(String source){
		if (source.equals("archivo")){
			return new VuelosImplArchivo();
		}else if (source.equals("Serializacion")){
			return new VuelosImplStream();
		}
		else {
			return null;
		}
	}
}