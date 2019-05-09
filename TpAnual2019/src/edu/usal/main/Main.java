package edu.usal.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import edu.usal.negocio.dao.factory.ClienteFactory;
import edu.usal.negocio.dao.factory.VuelosFactory;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Cliente;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		VuelosDAO vuelosDao = VuelosFactory.GetImplementation("Serializacion");
/*		
		Vuelo vuelos = new Vuelo();
		vuelos.setNumVuelo(1);
		vuelos.setCantAsientos(25);

		vuelosDao.AgregarVuelo(vuelos);
-Anda String-
vuelosDao.AgregarVuelo();
*/

		
		//vuelosDao.AgregarVuelo();
	//	vuelosDao.GetAll();
		
		
		/*Cliente cliente1 = new Cliente();
		cliente1.setApellido("Villanueva");
		cliente1.setNombre("Francisco");
		
		ClienteDAO impDAO = ClienteFactory.GetImplementation("Serializacion");
		try {
			impDAO.AgregarCliente(cliente1);
			cliente1.setApellido("Gimenez");
			cliente1.setNombre("Fernando");
			impDAO.AgregarCliente(cliente1);
			
			List <Cliente> listado = impDAO.GetAll();
			for (Cliente clien : listado) {
				System.out.println(clien.getApellido()+ "" + clien.getNombre());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		*/
		
	}
}



