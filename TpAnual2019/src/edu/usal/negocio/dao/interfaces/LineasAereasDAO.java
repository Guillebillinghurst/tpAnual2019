package edu.usal.negocio.dao.interfaces;

import java.util.ArrayList;

import edu.usal.negocio.dominio.LineasAereas;

public interface LineasAereasDAO {
	public boolean alta(LineasAereas lineaaerea);
	public boolean baja(int id);
	public boolean modificacion(int id, LineasAereas lineaaerea);
	public LineasAereas consulta(int id);
}
