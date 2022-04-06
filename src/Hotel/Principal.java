
package Hotel;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import Hotel.Utils.*;
import Hotel.Modules.Rooms.Classes.Doubles;
import Hotel.Modules.Rooms.Classes.Single;
import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.Classes.Suite;
import Hotel.Modules.Rooms.Utils.Dummies_Rooms;
import Hotel.Modules.Users.Classes.Admin;
import Hotel.Modules.Users.Classes.Client;
import Hotel.Modules.Users.Classes.Premium;
import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Classes.User;
import Hotel.Modules.Users.Utils.Dummies_Users;
import Hotel.Modules.Users.Utils.Room_operations_functions_users;
import Hotel.Modules.Users.Utils_arrays.register_arrays_users;
import Hotel.Modules.Users.Utils_arrays.Login_arrays;

public class Principal {

	public static void main(String[] args) {

		int menuPrincipal = 0;
		int menuRegister = 0;
		
		String[] opc_menu_principal = { "REGISTER", "LOGIN", "Exit" };
		String[] opc_menu_register = { "Reg_ADMIN", "Reg_PREMIUM", "Reg_CLIENT", "Go Back" };
		
		Singleton.a_Single = new ArrayList<Single>();
		Singleton.a_Doubles = new ArrayList<Doubles>();
		Singleton.a_Suite = new ArrayList<Suite>();
		
		Singleton_user.a_Users = new ArrayList<User>();
		Dummies_Users.carregarDades_User();
	
		do {
			menuPrincipal = function_menu.menubotons(opc_menu_principal, "What room do you want to do?",
					"CHOOSE OPTION");
			switch (menuPrincipal) {

			case 0: // REGISTER
				do {
					menuRegister = function_menu.menubotons(opc_menu_register,"What type of user do you want to register?", "CHOOSE USER");
					switch (menuRegister) {
					case 0:
						register_arrays_users.create_ADMIN();
						break;
					case 1:	
						register_arrays_users.create_PREMIUM();
						break;
					case 2:
						register_arrays_users.create_CLIENT();
						break;
					default:
						break;
					}

				} while (menuRegister != 3);

				break;

			case 1: // LOGIN
				
				 Login_arrays.login_Users();
				 Dummies_Rooms.carregarDades_Rooms();
				
				if (Singleton_user.loged_user instanceof Admin) {
					Room_operations_functions_users.MENU_Admin();	
				}
				
				if (Singleton_user.loged_user instanceof Premium) {
					Room_operations_functions_users.MENU_Premium();
				}
				
				if (Singleton_user.loged_user instanceof Client) {
					Room_operations_functions_users.MENU_Client();
				}				
				break;

			default: // EXIT
				JOptionPane.showMessageDialog(null, "Thank you for using our application!", "SEE YOU",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;

			}// SWITCH PRINCIPAL

		} while (menuPrincipal != 3);

	}// MAIN

}
// PRINCIPAL.java
