package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import edu.usal.negocio.dominio.Ventas;

	public interface VentasDAO {
		
		public void AgregarVenta(Ventas venta) throws IOException;
		public void EliminarVenta(int id) throws ParseException, IOException;
		public void ModificarVenta(int id , Ventas ventaupd) throws IOException, ParseException;
		public List<Ventas> GetAll() throws ParseException, FileNotFoundException, IOException; 

	}
	


