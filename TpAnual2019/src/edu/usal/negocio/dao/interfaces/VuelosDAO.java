package edu.usal.negocio.dao.interfaces;

import java.io.IOException;
import java.util.List;
import edu.usal.negocio.dominio.Vuelo;

public interface VuelosDAO {
	
	public void AgregarVuelo() throws IOException;
	public void EliminarVuelo(Vuelo vuelo);
	public void ModificarVuelo(Vuelo vuelo);
	public List<Vuelo> GetAll() throws IOException, ClassNotFoundException; 
	
}
