package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementacion.CArgablesSimplesDAOimplBD;
import edu.usal.negocio.dao.implementacion.CargablesSimplesDAOimplArchivo;
import edu.usal.negocio.dao.interfaces.CargablesSiemplesDAO;

public class CargablesSimplesFactory {
	public static CargablesSiemplesDAO getDAOCS(String source){
		if(source.equals("archivo"))
		{
			return new CargablesSimplesDAOimplArchivo();
		}
		if(source.equals("basedatos")) {
			return new CArgablesSimplesDAOimplBD();
		}
		return null;
		}
}
