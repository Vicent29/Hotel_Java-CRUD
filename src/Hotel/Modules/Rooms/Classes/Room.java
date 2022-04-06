package Hotel.Modules.Rooms.Classes;


import Hotel.Classes.Fecha;

public abstract class Room implements Comparable<Room> {
	
	
//	ATRIBUTS
	private String id;
	private String m2;
	private String capacidad;
	private boolean disponible;
	private boolean wifi;
	private Fecha f_entra;
	private Fecha f_fin;
	private float precio;
	private float descuento;
	
//	CONSTRUCTOR
		public Room(String id, String m2, String capacitat, boolean disponible, boolean wifi, Fecha f_entra,
				Fecha f_fin) {

		this.id = id;
		this.m2 = m2;
		this.capacidad = capacitat;
		this.disponible = disponible;
		this.wifi = wifi;
		this.f_entra = f_entra;
		this.f_fin = f_fin;	
		}
		//constructor de clau primaria del ID
		public Room(String id) {
			this.id= id;	
		}
		
//  GETTERS 
	public String getId() {
		return id;
	}
	public String getM2() {
		return m2;
	}
	public String getCapacitat() {
		return capacidad;
	}
	public boolean getDisponible() {
		return disponible;
	}
	public boolean getWifi() {
		return wifi;
	}
	public Fecha getF_entra() {
		return this.f_entra;
	}
	public Fecha getF_fin() {
		return this.f_fin;
	}
	public float getPrecio() {
		return precio;
	}
	public float getDescuento() {
		return descuento;
	}
	
// SETTERS
	
	public void setId(String id) {
		this.id = id;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	public void setCapacitat(String capacitat) {
		this.capacidad = capacitat;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public void setF_entra(Fecha f_entra) {
		this.f_entra = f_entra;
		
	}
	public void setF_fin(Fecha f_fin) {
		this.f_fin = f_fin;
		
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

//	toString
	public abstract String toString(); 
	
	
	
}// ROOM
	
	
	
	
	
	
	