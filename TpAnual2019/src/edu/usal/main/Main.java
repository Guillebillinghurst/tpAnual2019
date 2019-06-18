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
import edu.usal.negocio.dominio.Vuelos;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		VuelosDAO vuelosDao = VuelosFactory.GetImplementation("archivo");	
//		Vuelos vuelos = new Vuelos();
//		vuelos.setNroVuelo(1);
//		vuelos.setCantAsientos(25);

// -Anda String-
//vuelosDao.EliminarVuelo();
//vuelosDao.AgregarVuelo();
//vuelosDao.GetAll();
//vuelosDao.ModificarVuelo();
//vuelosDao.probado();

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
