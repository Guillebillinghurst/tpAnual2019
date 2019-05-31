package edu.usal.negocio.dao.interfaces;

import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.Vuelos;

public interface VuelosDAO {
	
	public void AgregarVuelo() throws IOException;
	public void EliminarVuelo(Vuelos vuelo);
	public void ModificarVuelo(Vuelos vuelo);
	public List<Vuelos> GetAll() throws IOException, ClassNotFoundException; 
	
}
