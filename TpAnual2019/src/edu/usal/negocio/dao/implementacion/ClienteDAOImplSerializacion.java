package edu.usal.negocio.dao.implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.util.PropertiesUtil;


public class ClienteDAOImplSerializacion implements ClienteDAO {

	@Override
	public void AgregarCliente(Cliente cliente) throws IOException {
		// TODO Auto-generated method stub
		
		List<Cliente> clientes = new ArrayList(); /*= GetAll();*/
		clientes.add(cliente);
		String pathClie = PropertiesUtil.getInstance().getPropertyCliente();
		
		FileOutputStream archSalida = new FileOutputStream(new File("Cliente.txt"));
		ObjectOutputStream ouStream = new ObjectOutputStream(archSalida);
		ouStream.writeObject(clientes);
		ouStream.close();
		
	}

	@Override
	public void EliminarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> GetAll() throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fileIS = new FileInputStream(new File ("Cliente.txt"));
		ObjectInputStream oiStream = new ObjectInputStream (fileIS);
		List <Cliente> listadoClientes = new ArrayList<Cliente>();
		try {
			listadoClientes = (List<Cliente>) oiStream.readObject();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			oiStream.close();
		}
		return listadoClientes;
	}
}
