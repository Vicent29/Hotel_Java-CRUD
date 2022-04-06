package Hotel.Modules.Rooms.Classes;

import Hotel.Classes.Fecha;
import Hotel.Utils.*;
import javax.swing.JOptionPane;

public class Suite extends Room {

	// ATRIBUTS
	private Fecha f_entrada_jacuzzi;
	private Fecha f_salida_jacuzzi;
	private float precio_jacuzzi;
	private boolean masaje;
	private boolean pension_completa;
	private int suplemento;

//	CONSTRUCTOR
	public Suite(String id, String m2, String capacitat, boolean disponible, boolean wifi, Fecha f_entra, Fecha f_fin,
			Fecha f_entrada_jacuzzi, Fecha f_salida_jacuzzi, float precio_jacuzzi, boolean masaje,
			boolean pension_completa) {

		super(id, m2, capacitat, disponible, wifi, f_entra, f_fin);
		this.masaje = masaje;
		this.pension_completa = pension_completa;
		this.f_entrada_jacuzzi = f_entrada_jacuzzi;
		this.f_salida_jacuzzi = f_salida_jacuzzi;
		this.precio_jacuzzi = precio_jacuzzi;

		super.setPrecio(this.calcular_precio());
		super.setDescuento(this.calcular_descuento());
		this.setPrecio_jacuzzi(calcular_precio_jacuzzi());
	}

	// CONSTRICTOR DE LA CLAU PRIAMRIA DEL ID
	public Suite(String id) {
		super(id);
	}

//	 FUNCIONES CALCULAR PRECIO

	// SI CAMBAI F_ENTRADA (RECALCULA)
	public void setF_entra(Fecha f_entra) {
		super.setF_entra(f_entra);
		super.setPrecio(this.calcular_precio());
		super.setDescuento(this.calcular_descuento());
	}

	// SI CAMBIA F_FIN (RECALCULA)
	public void setF_fin(Fecha f_fin) {
		super.setF_fin(f_fin);
		super.setPrecio(this.calcular_precio());
		super.setDescuento(this.calcular_descuento());
	}

	// CALCULA NUMERO DIES (INSTANCIA)
	public int numdies() {
		return super.getF_entra().restar2Fechas(super.getF_fin());
	}

	// CALCULAR SUPLEMENTOS
	public void suplemento() {

		if (this.pension_completa == true) {
			setsuplemento(suplemento + 22);
		}
		if (super.getWifi() == true) {
			setsuplemento(suplemento + 10);
		}
		if (this.masaje == true) {
			setsuplemento(suplemento + 25);
		}
	}

	// CALCULAR PRECIO Suite *300
	public float calcular_precio() {
		suplemento = 0;
		suplemento(); // Calcula Suplemento
		return (300 * numdies()) + this.suplemento;
	}

	// CALCULAR DESCUENTO DEPENDIENDO DE LA ESTANCIA
	public float calcular_descuento() {
		if ((this.numdies() >= 2) && (this.numdies() <= 4)) {
			return (float) (super.getPrecio() * 0);
		} else if ((this.numdies() >= 5) && (this.numdies() <= 7)) {
			return (float) (super.getPrecio() * 0.2);
		} else if ((this.numdies() >= 8) && (this.numdies() <= 10)) {
			return (float) (super.getPrecio() * 0.3);
		}
		return (super.getPrecio());
	}

	// JACUZZI
	// CALCULA NUMERO DIES JACUZZI
	public int numdies_jacuzzi() {
		return this.getF_entrada_jacuzzi().restar2Fechas(this.getF_salida_jacuzzi());
	}

	// CALCULAR PRECIO JACUZZI *20
	public float calcular_precio_jacuzzi() {
		return 20 * numdies_jacuzzi();
	}

//  GETTERS

	public Fecha getF_entrada_jacuzzi() {
		return f_entrada_jacuzzi;
	}

	public Fecha getF_salida_jacuzzi() {
		return f_salida_jacuzzi;
	}

	public float getPrecio_jacuzzi() {
		return precio_jacuzzi;
	}

	public boolean getMasaje() {
		return masaje;
	}

	public boolean getPension_completa() {
		return pension_completa;
	}

	public int getsuplemento() {
		return suplemento;
	}

//	SETTERS

	public void setF_entrada_jacuzzi(Fecha f_entrada_jacuzzi) {
		this.f_entrada_jacuzzi = f_entrada_jacuzzi;
		this.setPrecio_jacuzzi(this.calcular_precio_jacuzzi());

	}

	public void setF_salida_jacuzzi(Fecha f_salida_jacuzzi) {
		this.f_salida_jacuzzi = f_salida_jacuzzi;
		this.setPrecio_jacuzzi(this.calcular_precio_jacuzzi());

	}

	public void setPrecio_jacuzzi(float precio_jacuzzi) {
		this.precio_jacuzzi = precio_jacuzzi;

	}

	public void setMasaje(boolean masaje) {
		this.masaje = masaje;
		super.setPrecio(this.calcular_precio());

	}

	public void setPension_completa(boolean pension_completa) {
		this.pension_completa = pension_completa;
		super.setPrecio(this.calcular_precio());
	}

	public void setsuplemento(int suplemento) {
		this.suplemento = suplemento;
	}
	
	
	//COMPARETO
		@Override
		public int compareTo(Room comp_Room) {
			return 0;
		}

//	toString

	public String toString() {
		String menuOptions = null;
		String cad = "";
		String[] opc_menu_read = { "ALL DATES", "Id", "M2", "Capcity", "Available", "WIFI", "Entry Date", "Finish Date",
				"Price", "Descount", "Entry Date Jacuzzi", "Finish Date Jacuzzi", "Price Jacuzzi", "Massage",
				"Full board", "Price Suplements", "Go Back" };
		do {
			menuOptions = function_menu.combo_String(opc_menu_read, "What do you want to read", "READ ROOMS SUITE");
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
				cad = cad + (" Entry Date Jacuzzi: " + this.getF_entrada_jacuzzi() + "\n");
				cad = cad + (" Finish Date Jacuzzi: " + this.getF_salida_jacuzzi() + " \n");
				cad = cad + (" Price Jacuzzi: " + Format.FormatEuro(getPrecio_jacuzzi()) + " \n");
				cad = cad + (" Price Suplement: " + Format.FormatEuro(suplemento) + " \n");
				cad = cad + (" Massage: " + this.getMasaje() + " \n");
				cad = cad + (" Full board: " + this.getPension_completa() + " \n");
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
				cad = cad + ("Price: " + Format.FormatEuro(super.getPrecio()) + " + "
						+ Format.FormatEuro(this.precio_jacuzzi) + " - " + Format.FormatEuro(super.getDescuento())
						+ " = " + Format.FormatEuro(super.getPrecio() + 35 - super.getDescuento()) + "\n");
				break;
			case "Descount":
				cad = cad + ("Descount: " + Format.FormatEuro(super.getDescuento()) + "\n");
				break;
			case "Entry Date Jacuzzi":
				cad = cad + ("Entry Date Jacuzzi: " + this.getF_entrada_jacuzzi() + "\n");
				break;
			case "Finish Date Jacuzzi":
				cad = cad + ("Finish Date Jacuzzi: " + this.getF_salida_jacuzzi() + " \n");
				break;
			case "Price Jacuzzi":
				cad = cad + ("Price Jacuzzi: " + Format.FormatEuro(getPrecio_jacuzzi()) + " \n");
				break;
			case "Massage":
				cad = cad + ("Massage: " + this.getMasaje() + " \n");
				break;
			case "Full board":
				cad = cad + ("Full board: " + this.getPension_completa() + " \n");
				break;
			case "Price Suplements":
				cad = cad + ("Price Suplements: " + Format.FormatEuro(suplemento) + " \n");
				break;
			case "Go Back":
				cad="Exiting the menu read";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			}// SWITCH_menuOptions
			return cad;
		} while (menuOptions != "Go Back");
	}// to.String


}// SUITE
