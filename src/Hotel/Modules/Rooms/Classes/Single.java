package Hotel.Modules.Rooms.Classes;

import javax.swing.JOptionPane;

import Hotel.Classes.Fecha;
import Hotel.Utils.*;

public class Single extends Room {

	// ATRIBUTS
	private boolean desayuno;
	private boolean excursion;

//		CONSTRUCTOR

	public Single(String id, String m2, String capacitat, boolean disponible, boolean wifi, Fecha f_entra, Fecha f_fin,
			boolean desayuno, boolean excursion) {

		super(id, m2, capacitat, disponible, wifi, f_entra, f_fin);
		this.desayuno = desayuno;
		this.excursion = excursion;
		super.setPrecio(calcular_precio());
		super.setDescuento(calcular_descuento());
	}

	// CONSTRUCTOR DE CLAU PRIMARIA DE LA ID
	public Single(String id) {
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

	// CALCULAR PRECIO SINGLE *80
	public float calcular_precio() {
		return 80 * numdies();
	}

	// CALCULAR DESCUENTO DEPENDIENDO DE LA ESTANCIA
	public float calcular_descuento() {

		if ((this.numdies() >= 2) && (this.numdies() <= 4)) {
			return (float) (super.getPrecio() * 0);
		} else if ((this.numdies() >= 5) && (this.numdies() <= 7)) {
			return (float) (super.getPrecio() * 0.05);
		} else if ((this.numdies() >= 8) && (this.numdies() <= 10)) {
			return (float) (super.getPrecio() * 0.15);
		}
		return (super.getPrecio());
	}

	// GETTERS
	public boolean getDesayuno() {
		return desayuno;
	}

	public boolean getExcurison() {
		return excursion;
	}

//		SETTERS

	public void setDesayuno(boolean desayuno) {
		this.desayuno = desayuno;
	}

	public void setExcurison(boolean excurison) {
		this.excursion = excurison;
	}
	
	//COMPARETO
	@Override
	public int compareTo(Room comp_Room) {
		return 0;
	}


//ToSTRING
	public String toString() {
		String menuOptions = null;
		String cad = "";
		String[] opc_menu_read = { "ALL DATES", "Id", "M2", "Capcity", "Available", "WIFI", "Entry Date", "Finish Date",
				"Price", "Descount", "Breakfast", "Excursion", "Go Back" };
		do {
			menuOptions = function_menu.combo_String(opc_menu_read, "What do you want to read:", "READ ROOM SINGLE");
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
				cad = cad + (" Breakfast: " + this.getDesayuno() + "\n");
				cad = cad + (" Excurison: " + this.getExcurison() + " \n");
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
			case "Breakfast":
				cad = cad + ("Breakfast: " + this.getDesayuno() + "\n");
				break;
			case "Excursion":
				cad = cad + ("Excurison: " + this.getExcurison() + " \n");
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



}// SINGLE
