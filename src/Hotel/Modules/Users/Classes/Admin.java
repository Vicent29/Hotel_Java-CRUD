package Hotel.Modules.Users.Classes;

import javax.swing.JOptionPane;

import Hotel.Classes.Fecha;
import Hotel.Utils.function_menu;

public class Admin extends User {

	// ATRIBUTS
	private Fecha f_alta_sistema;

	// CONSTRUCTOR
	public Admin(String username, String password, String gmail, Fecha f_alta_sistema) {
		super(username, password, gmail);
		this.f_alta_sistema = f_alta_sistema;
	}

	// CONSTRUCTOR DE CLAU PRIMARIA DE LA ID
	public Admin(String username) {
		super(username);
	}

	// GETERS Y SETTERS
	public Fecha getF_alta_sistema() {
		return f_alta_sistema;
	}

	public void setF_alta_sistema(Fecha f_alta_sistema) {
		this.f_alta_sistema = f_alta_sistema;
	}

	// TO STRING
	public String toString() {
		String menuOptions = null;
		String cad = "";
		String[] opc_menu_read = { "ALL DATES", "Username", "Password", "Gmail", "High date system", "Go Back" };

		do {
			menuOptions = function_menu.combo_String(opc_menu_read, "What do you want to read:", "READ USER ADMIN");
			switch (menuOptions) {
			case "ALL DATES":
				cad = cad + (" Username: " + super.getUsername() + "\n");
				cad = cad + (" Password: " + super.getPassword() + "\n");
				cad = cad + (" Gmail: " + super.getGmail() + "\n");
				cad = cad + (" High date system: " + this.getF_alta_sistema() + " \n");
				break;
			case "Username":
				cad = cad + ("Username: " + super.getUsername() + "\n");
				break;
			case "Password":
				cad = cad + ("Password: " + super.getPassword() + "\n");
				break;
			case "Gmail":
				cad = cad + ("Gmail: " + super.getGmail() + "\n");
				break;
			case "High date system":
				cad = cad + ("High date system: " + this.getF_alta_sistema() + "\n");
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
	
}// ADMIN
