package edu.usal.negocio.dao.interfaces;

import java.util.ArrayList;

import edu.usal.negocio.dominio.CargablesSimples;

public interface CargablesSiemplesDAO {
	public ArrayList<CargablesSimples> cargar(String path);
	public CargablesSimples mostrar(String path, int id);
}
