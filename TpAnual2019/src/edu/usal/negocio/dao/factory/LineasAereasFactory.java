package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.LineasAereasDAOimplArchivo;
import edu.usal.negocio.dao.implementacion.LineasAereasDAOimplBD;
import edu.usal.negocio.dao.interfaces.LineasAereasDAO;

public class LineasAereasFactory {
	public static LineasAereasDAO getDAO(String source) {
		if(source.equals("archivo") == true) {
			return new LineasAereasDAOimplArchivo();
		}
		if(source.equals("basedatos") == true) {
			return new LineasAereasDAOimplBD();
		}
		return null;
	}
}
