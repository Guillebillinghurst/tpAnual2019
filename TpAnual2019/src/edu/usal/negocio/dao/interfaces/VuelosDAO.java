package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.Vuelos;

public interface VuelosDAO {
	
	public void AgregarVuelo() throws IOException;
	public void EliminarVuelo()throws FileNotFoundException, IOException;
	public void ModificarVuelo() throws IOException;
	public List<Vuelos> GetAll() throws IOException, ClassNotFoundException; 
}
