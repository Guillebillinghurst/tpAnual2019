package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.AeropuertosDAOImplArchivo;
import edu.usal.negocio.dao.implementacion.AeropuertosDAOImplBD;
import edu.usal.negocio.dao.interfaces.AeropuertosDAO;

public class AeropuertosFactory {

	public static AeropuertosDAO GetImplementation(String source){
		if (source.equals("archivo")){
			return new AeropuertosDAOImplArchivo();
		}else if (source.equals("BD")){
			return new AeropuertosDAOImplBD();
		}
		else {
			return null;
		}
	}
}