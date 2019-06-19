package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.usal.negocio.dominio.Ventas;
import edu.usal.negocio.dominio.Vuelos;

public interface VuelosDAO {
	
	public void AgregarVuelo(Vuelos vuelo) throws IOException;
	public void EliminarVuelo(int id )throws FileNotFoundException, IOException;
	public void ModificarVuelo(int id, Vuelos vuelo ) throws IOException;
	public List<Vuelos> GetAll() throws IOException, ClassNotFoundException; 
	public Vuelos BuscarVuelo(int id) throws IOException ;
}
