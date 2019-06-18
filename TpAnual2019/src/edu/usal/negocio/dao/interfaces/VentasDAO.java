package edu.usal.negocio.dao.interfaces;

import java.util.List;

import edu.usal.negocio.dominio.Ventas;

	public interface VentasDAO {
		
		public void AgregarVenta();
		public void EliminarVenta();
		public void ModificarVenta();
		public List<Ventas> GetAll(); 

	}
	


