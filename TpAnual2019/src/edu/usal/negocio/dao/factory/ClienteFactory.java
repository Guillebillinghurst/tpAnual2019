package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.ClienteDAOImplArchivo;
import edu.usal.negocio.dao.implementacion.ClienteDAOImplSerializacion;
import edu.usal.negocio.dao.interfaces.ClienteDAO;

public class ClienteFactory {
	
	public static ClienteDAO GetImplementation (String source) {
		if (source.equals("Archivo")) {
			return new ClienteDAOImplArchivo();
		}
		else if (source.equals("Serializacion")) {
			return new ClienteDAOImplSerializacion();
		}
		return null;
	}
}
