package Hotel.Modules.Rooms.Classes;

import javax.swing.JOptionPane;

import Hotel.Classes.Fecha;
import Hotel.Utils.*;

public class Doubles extends Room {

//	ATRIBUTS
	private boolean ambiente_romantico;
	private boolean desayuno_doble;
	private boolean musica;

//	CONSTRUCTOR	
	public Doubles(String id, String m2, String capacitat, boolean disponible, boolean wifi, Fecha f_entra, Fecha f_fin,
			boolean ambiente_romantico, boolean desayuno_doble, boolean musica) {

		super(id, m2, capacitat, disponible, wifi, f_entra, f_fin);
		this.ambiente_romantico = ambiente_romantico;
		this.desayuno_doble = desayuno_doble;
		this.musica = musica;
		super.setPrecio(calcular_precio());
		super.setDescuento(calcular_descuento());
	}

	// CONSTRUCTOR DE LA CLAU PRIMARIA DE LA ID
	public Doubles(String id) {
		super(id);
	}

	// FUNCIONES RECALCULABLES AL PRECIO Y DESCUENTO

	// SI CAMBAI F_ENTRADA (RECALCULA)
	public void setF_entra(Fecha f_entra) {
		super.setF_entra(f_entra);
		super.setPrecio(this.calcular_precio());
		super.setDescuento(calcular_descuento());
	}

	// SI CAMBIA F_FIN (RECALCULA)
	public void setF_fin(Fecha f_fin) {
		super.setF_fin(f_fin);
		super.setPrecio(this.calcular_precio());
		super.setDescuento(calcular_descuento());
	}

	// CALCULA NUMERO DIES (INSTANCIA)
	public int numdies() {
		return super.getF_entra().restar2Fechas(super.getF_fin());
	}

	// CALCULAR PRECIO DOUBLE *120
	public float calcular_precio() {
		return 120 * numdies();
	}

	// CALCULAR DESCUENTO DEPENDIENDO DE LA INSTANCIA
	public float calcular_descuento() {
		if ((this.numdies() >= 2) && (this.numdies() <= 4)) {
			return (float) (super.getPrecio() * 0);
		} else if ((this.numdies() >= 5) && (this.numdies() <= 7)) {
			return (float) (super.getPrecio() * 0.15);
		} else if ((this.numdies() >= 8) && (this.numdies() <= 10)) {
			return (float) (super.getPrecio() * 0.2);
		}

		return (super.getPrecio());
	}

	// GETTERS
	public boolean getAmbiente_romantico() {
		return ambiente_romantico;
	}

	public boolean getDesayuno_doble() {
		return desayuno_doble;
	}

	public boolean getMusica() {
		return musica;
	}

	// SETTERS

	public void setAmbiente_amoroso(boolean ambiente_romantico) {
		this.ambiente_romantico = ambiente_romantico;
	}

	public void setDesayuno_doble(boolean desayuno_doble) {
		this.desayuno_doble = desayuno_doble;
	}

	public void setMusica(boolean musica) {
		this.musica = musica;
	}

	// COMPARETO
	@Override
	public int compareTo(Room comp_Room) {
		return 0;
	}

//ToSTRING
	public String toString() {
		String menuOptions = null;
		String cad = "";
		String[] opc_menu_read = { "ALL DATES", "Id", "M2", "Capcity", "Available", "WIFI", "Entry Date", "Finish Date",
				"Price", "Descount", "Romantic Them", "Breakfast", "Music", "Go Back" };
		do {
			menuOptions = function_menu.combo_String(opc_menu_read, "What do you want to read", "READ ROOM DOUBLE");
			switch (menuOptions) {
			case "ALL DATES":
				cad = cad + (" Id: " + super.getId() + "\n");
				cad = cad + (" M2: " + Format.FormatM2(super.getM2()) + "\n");
				cad = cad + (" Capacity: " + super.getCapacitat() + "\n");
				cad = cad + (" Avaiable: " + super.getDisponible() + "\n");
				cad = cad + (" Wifi: " + super.getWifi() + "\n");
				cad = cad + (" Entry Date: " + super.getF_entra() + "\n");
				cad = cad + (" Finish Date: " + super.getF_fin() + "\n");
				cad = cad + (" Price: " + Format.FormatEuro(super.getPrecio()) + "\n");
				cad = cad + (" Descount: " + Format.FormatEuro(super.getDescuento()) + "\n");
				cad = cad + (" Romantic Them: " + this.getAmbiente_romantico() + "\n");
				cad = cad + (" Breakfast: " + this.getDesayuno_doble() + " \n");
				cad = cad + (" Music: " + this.getMusica() + " \n");
				break;
			case "Id":
				cad = cad + ("Id: " + super.getId() + "\n");
				break;
			case "M2":
				cad = cad + ("M2: " + Format.FormatM2(super.getM2()) + "\n");
				break;
			case "Capcity":
				cad = cad + ("Capacity: " + super.getCapacitat() + "\n");
				break;
			case "Available":
				cad = cad + ("Avaiable: " + super.getDisponible() + "\n");
				break;
			case "WIFI":
				cad = cad + ("Wifi: " + super.getWifi() + "\n");
				break;
			case "Entry Date":
				cad = cad + ("Entry Date: " + super.getF_entra() + "\n");
				break;
			case "Finish Date":
				cad = cad + ("Finish Date: " + super.getF_fin() + "\n");
				break;
			case "Price":
				cad = cad + ("Price: " + Format.FormatEuro(super.getPrecio()) + " - "
						+ Format.FormatEuro(super.getDescuento()) + " = "
						+ Format.FormatEuro(super.getPrecio() - super.getDescuento()) + "\n");
				break;
			case "Descount":
				cad = cad + ("Descount: " + Format.FormatEuro(super.getDescuento()) + "\n");
				break;
			case "Romantic Them":
				cad = cad + ("Romantic Them: " + this.getAmbiente_romantico() + "\n");
				break;
			case "Breakfast":
				cad = cad + ("Excurison: " + this.getDesayuno_doble() + " \n");
				break;
			case "Music":
				cad = cad + ("Music: " + this.getMusica() + " \n");
				break;
			case "Go Back":
				cad = "Exiting the menu read";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			}// SWITCH_menuOptions
			return cad;
		} while (menuOptions != "Go Back");
	}// toString

}// DOUBLE
