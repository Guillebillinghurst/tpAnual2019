package edu.usal.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import edu.usal.negocio.dao.factory.VuelosFactory;
import edu.usal.negocio.dao.interfaces.VuelosDAO;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		VuelosDAO vuelosDao = VuelosFactory.GetImplementation("Serializacion");
/*		
		Vuelo vuelos = new Vuelo();
		vuelos.setNumVuelo(1);
		vuelos.setCantAsientos(25);

		vuelosDao.AgregarVuelo(vuelos);
-Anda String-
vuelosDao.AgregarVuelo();
*/

		
		vuelosDao.AgregarVuelo();
	//	vuelosDao.GetAll();
		
	}
}



