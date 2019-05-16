package edu.usal.negocio.dao.implementacion;

import java.util.ArrayList;

import edu.usal.negocio.dao.factory.CargablesSimplesFactory;
import edu.usal.negocio.dao.interfaces.CargablesSiemplesDAO;
import edu.usal.negocio.dao.interfaces.LineasAereasDAO;
import edu.usal.negocio.dominio.CargablesSimples;
import edu.usal.negocio.dominio.LineasAereas;
import edu.usal.util.IOGeneral;

public class LineasAereasDAOimpl implements LineasAereasDAO{


	public void add(ArrayList<LineasAereas> lista, LineasAereas LineaAerea) {
		lista.add(LineaAerea);
		
	}


	public void remove(ArrayList<LineasAereas> lista, String id) {
		for(int i = 0; i < lista.size();i++) {
			if(id.equals(lista.get(i).getId()) == true) {
				lista.remove(i);
			}
		}
		
	}


	public void mod(ArrayList<LineasAereas> lista, String id) {
		for(int i = 0; i < lista.size();i++) {
			if(id.equals(lista.get(i).getId()) == true) {
				lista.set(i, create());
			}
		}
		
	}

	public void mostrar(String id, ArrayList<LineasAereas> lista) {
		for(int i = 0; i < lista.size();i++) {
			if(id.equals(lista.get(i).getId()) == true) {
				IOManager
			}
		}
		
	}

	@Override
	public void mostrar(ArrayList<LineasAereas> lista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LineasAereas create() {
		LineasAereas la = new LineasAereas();
		CargablesSiemplesDAO csd = CargablesSimplesFactory.getDAOCS("archivo");
		ArrayList<CargablesSimples> cargables = csd.cargar("alianzas.tat");
		int op = 0;
		
		la.setNombre(IOGeneral.leerFrase("ingresar nombre lineaAerea: "));
		for(int i = 0; i < cargables.size(); i++) {
			IOGeneral.pritln(i+") "+ cargables.get(i).getNombre());
		}
		op = IOGeneral.leerInt("elegir opcion", "ingresar valor valido");
		la.setAlianza(cargables.get(op));
		String id = la.calcularId(la.getNombre(), la.getAlianza().getNombre());
		la.setId(id);
		la.setVuelos(null);
		
		return la;
	}


	@Override
	public void addVuelo(String id, ArrayList<LineasAereas> lista) {
		// TODO Auto-generated method stub
		
	}

}
