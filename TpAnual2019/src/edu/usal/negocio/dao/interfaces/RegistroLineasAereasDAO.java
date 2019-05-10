package edu.usal.negocio.dao.interfaces;

import java.util.ArrayList;

import edu.usal.negocio.dominio.LineasAereas;

public interface RegistroLineasAereasDAO {
	public void guardarListado(ArrayList<LineasAereas>listra);
	public ArrayList<LineasAereas> cargarListado();
}
