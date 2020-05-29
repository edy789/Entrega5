package Dominio;

import Persistencia.CamionDao;
import Persistencia.VehiculoDao;

public class Camion  extends Vehiculo{
	private double carga;
	
	private CamionDao cDao;
	
	public Camion(String matricula, String marca, String modelo, String color, double precio ,
			double carga, CamionDao cDao) {
		super(matricula, marca, modelo, color, precio);
		this.carga = carga;
		cDao = new CamionDao();
	}
	public Camion( ) {
		cDao = new CamionDao();
		
	
	

}
}