package edu.usal.negocio.dao.interfaces;

import java.io.IOException;

import edu.usal.negocio.dominio.Aeropuerto;

public interface AeropuertosDAO {
	public Aeropuerto BuscarAeropuerto(String id) throws IOException ;
}
