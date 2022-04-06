package Hotel.Modules.Users.Classes;

import javax.swing.JOptionPane;

import Hotel.Classes.Fecha;
import Hotel.Utils.function_menu;

public class Client extends User {

	// ATRIBUTS
	private Fecha f_alta_web;
	private String nacionalidad;
	private Fecha f_nacimiento;
	private String Genero;

	// CONSTRUCTOR
	public Client(String username, String password, String gmail, Fecha f_alta_web, String nacionalidad, Fecha f_nacimiento, String Genero) {

		super(username, password, gmail);
		this.f_alta_web = f_alta_web;
		this.nacionalidad = nacionalidad;
		this.f_nacimiento = f_nacimiento;
		this.Genero = Genero;
	}

	// CONSTRUCTOR DE LA CLAVE PRIAMRIA
	public Client(String username) {
		super(username);
	}
	
	//GETERS Y SETTERS
	public Fecha getF_alta_web() {
		return f_alta_web;
	}
	public void setF_alta_web(Fecha f_alta_web) {
		this.f_alta_web = f_alta_web;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Fecha getf_nacimiento() {
		return f_nacimiento;
	}
	public void setf_nacimiento(Fecha f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String Genero) {
		this.Genero = Genero;
	}

	//TOSTRING
	public String toString() {
		String menuOptions = null;
		String cad = "";
		String[] opc_menu_read = { "ALL DATES",  "Username", "Password", "Gmail","Website registration date", "Nationality", "Date of birth", "Gender", "Go Back" };
		
		do {
			menuOptions = function_menu.combo_String(opc_menu_read, "What do you want to read:", "READ USER CLIENT");
			switch (menuOptions) {
			case "ALL DATES":
				cad = cad + (" Username: " + super.getUsername() + "\n");
				cad = cad + (" Password: " + super.getPassword() + "\n");
				cad = cad + (" Gmail: " + super.getGmail() + "\n");
				cad = cad + (" Website registration date: " + this.getF_alta_web() + " \n");
				cad = cad + (" Nationality: " + this.getNacionalidad() + " \n");
				cad = cad + (" Date of birth: " + this.getf_nacimiento() + " \n");
				cad = cad + (" Gender: " + this.getGenero() + " \n");
			case "Username":
				cad = cad + ("Username: " + super.getUsername() + "\n");
				break;
			case "Password":
				cad = cad + ("Password: " + super.getPassword() + "\n");
				break;
			case "Gmail":
				cad = cad + ("Gmail: " + super.getGmail() + "\n");
				break;
			case "Website registration date":
				cad = cad + ("Website registration date: " + this.getF_alta_web() + "\n");
				break;
			case "Nationality":
				cad = cad + ("Nationality: " + this.getNacionalidad() + "\n");
				break;
			case "Date of birth":
				cad = cad + ("Date of birth: " + this.getf_nacimiento() + "\n");
				break;
			case "Gender":
				cad = cad + ("Gender: " + this.getGenero() + "\n");
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

	}
	
	

}// CLIENT
