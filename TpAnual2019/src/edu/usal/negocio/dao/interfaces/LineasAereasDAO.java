package edu.usal.negocio.dao.interfaces;

import java.util.ArrayList;

import edu.usal.negocio.dominio.LineasAereas;

public interface LineasAereasDAO {
	public void add(ArrayList<LineasAereas> lista,LineasAereas LineaAerea);
	public void remove(ArrayList<LineasAereas> lista, String id);
	public void mod(ArrayList<LineasAereas> lista, String id);
	public void mostrar(String id, ArrayList<LineasAereas> lista);
	public void mostrar(ArrayList<LineasAereas> lista);
	public LineasAereas create();
	public void addVuelo(String id, ArrayList<LineasAereas> lista);
}
