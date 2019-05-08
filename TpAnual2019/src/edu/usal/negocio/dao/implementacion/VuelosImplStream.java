package edu.usal.negocio.dao.implementacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.usal.negocio.dao.interfaces.VuelosDAO;
import edu.usal.negocio.dominio.Vuelo;

public class VuelosImplStream implements VuelosDAO{

	@Override
	public void AgregarVuelo() throws IOException {

		Vuelo vuelo = new Vuelo();
		vuelo = addVuelo();
		FileOutputStream archSalida = new FileOutputStream(new File("Vuelos2.dat"),true);
		ObjectOutputStream ouStream = new ObjectOutputStream(archSalida);
		ouStream.writeObject(vuelo);
		ouStream.flush();
		ouStream.close();		
	}

private Vuelo addVuelo(){
	Vuelo vuelos = new Vuelo();

    Scanner scn = new Scanner (System.in);
    System.out.println("Nro Vuelo:");
    vuelos.setNumVuelo(scn.nextInt());
    System.out.println("Cant Asientos:");
    vuelos.setCantAsientos(scn.nextInt());
    System.out.println("Aer Llegada:");
    vuelos.setAeropuertoLlegada(scn.nextInt());
    System.out.println("Aer Salida:");
    vuelos.setAeropuertoSalida(scn.nextInt());
    System.out.println("FechaHora Llegada:");
//    vuelos.setFechaHoraLlegada(scn.());
    System.out.println("FechaHora Salida:");
//    vuelos.setFechaHoraSalida(scn.);
    scn.nextLine();
    System.out.println("Tiempo Vuelo:");
    vuelos.setTiempoVuelo(scn.nextLine());
    System.out.println("ID Aereolinea:");
    vuelos.setIdAerolinea(scn.nextInt());
    scn.close();
	return vuelos;
	
}
	
	public void EliminarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModificarVuelo(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vuelo> GetAll() throws IOException, ClassNotFoundException {
		
		FileInputStream fileIS = new FileInputStream(new File("Vuelos2.dat"));
		ObjectInputStream oiStream = new ObjectInputStream(fileIS);
		
		/*
		Object aux= oiStream.readObject();
		while (aux!=null)
		{
		    if (aux instanceof Vuelo)
		        System.out.println(aux);  // Se escribe en pantalla el objeto
		    aux = oiStream.readObject();
		}
		*/
		List<Vuelo> listadoVuelos = new ArrayList<Vuelo>();
		
		try {
			listadoVuelos = (List<Vuelo>) oiStream.readObject();
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			oiStream.close();	
		}
		
		return listadoVuelos;
	}

}
