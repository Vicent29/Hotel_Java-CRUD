package Hotel.Modules.Users.Utils;

import javax.swing.JOptionPane;
import Hotel.Modules.Rooms.utils_arrays.*;
import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Utils_arrays.update_profiles;
import Hotel.Utils.*;

public class Room_operations_functions_users {

	// MENU_ADMIN
	public static void MENU_Admin() {
		int menuPrincipal = 0;
		int menuCRUD = 0;
		String[] opc_menu_principal = { "SINGLE", "DOUBLE", "SUITE", "PROFILE", "LOG OUT", "Exit" };
		String[] opc_menu_CRUD = { "Create", "Read", "Update", "Delete", "Order", "Go Back", "Exit" };

		do {

			menuPrincipal = function_menu.menubotons(opc_menu_principal, "What room do you want to reserve?",
					"CHOOSE ROOM");
			switch (menuPrincipal) {

			// SINGLE
			case 0:

				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION SINGLE");
					switch (menuCRUD) {

					case 0: // CREATED
						created_arrays.create_SINGLE();
						break;
					case 1: // READ
						read_arrays.read_single();
						break;
					case 2: // UPDATE
						update_arrays.update_single();
						break;
					case 3: // DELETE
						delete_arrays.delete_single();
						break;
					case 4: // ORDER
						order_arrays.change_order_single();
						break;
					case 5: // Go Back
						menuCRUD = 5;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch
				} while (menuCRUD != 5);
				break;

			// DOUBLE
			case 1:
				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION DOUBLE");
					switch (menuCRUD) {

					case 0: // CREATED
						created_arrays.create_DOUBLES();
						break;
					case 1: // READ
						read_arrays.read_doubles();
						break;
					case 2: // UPDATE
						update_arrays.update_doubles();
						break;
					case 3: // DELETE
						delete_arrays.delete_doubles();
						break;
					case 4: // ORDER
						order_arrays.change_order_doubles();
						break;
					case 5: // Go Back
						menuCRUD = 5;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch
				} while (menuCRUD != 5);
				break;

			// SUITE
			case 2:
				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION SUITE");
					switch (menuCRUD) {

					case 0: // CREATED
						created_arrays.create_SUITE();
						break;
					case 1: // READ
						read_arrays.read_suite();
						break;
					case 2: // UPDATE
						update_arrays.update_suite();
						break;
					case 3: // DELETE
						delete_arrays.delete_suite();
						break;
					case 4: // ORDER
						order_arrays.change_order_suite();
						break;
					case 5: // Go Back
						menuCRUD = 5;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch

				} while (menuCRUD != 5);
				break;

			// PROFILE
			case 3:
				int menuProfile = 0;
				String[] opc_profile = { "Read", "Update", "Go Back" };
				do {
					menuProfile = function_menu.menubotons(opc_profile, "What do you want to do with the profile?",
							"OPTION PROFILE");

					switch (menuProfile) {
					// READ
					case 0:
						JOptionPane.showMessageDialog(null, Singleton_user.loged_user.toString(), "READ ALL DATES",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					// UPDATE
					case 1:
						update_profiles.up_profile_users(Singleton_user.loged_user);
						break;
					// GO BACK
					case 2:
						menuCRUD = 2;
						break;
					}
				} while (menuProfile != 2);
				break;
			// LOG OUT
			case 4:
				JOptionPane.showMessageDialog(null,"Closing user session the user: " + Singleton_user.loged_user.getUsername(),"LOG OUT",JOptionPane.INFORMATION_MESSAGE);
				break;

			// DEFAULT
			default:
				JOptionPane.showMessageDialog(null, "Thank you for using our application!", "SEE YOU",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			}// switch
		} while (menuPrincipal != 4);

	}

	// MENU PREMIUM
	public static void MENU_Premium() {
		int menuPrincipal = 0;
		int menuCRUD = 0;
		String[] opc_menu_principal = { "SINGLE", "DOUBLE", "SUITE", "PROFILE", "LOG OUT", "Exit" };
		String[] opc_menu_CRUD = { "Read", "Update","Order", "Go Back", "Exit" };

		do {

			menuPrincipal = function_menu.menubotons(opc_menu_principal, "What room do you want to reserve?",
					"CHOOSE ROOM");
			switch (menuPrincipal) {

			// SINGLE
			case 0:

				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION SINGLE");
					switch (menuCRUD) {

					case 0: // READ
						read_arrays.read_single();
						break;
					case 1: // UPDATE
						update_arrays.update_single();
						break;
					case 2: // ORDER
						order_arrays.change_order_single();
						break;
					case 3: // Go Back
						menuCRUD = 3;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch
				} while (menuCRUD != 3);
				break;

			// DOUBLE
			case 1:
				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION DOUBLE");
					switch (menuCRUD) {

					case 0: // READ
						read_arrays.read_doubles();
						break;
					case 1: // UPDATE
						update_arrays.update_doubles();
						break;
					case 2: // ORDER
						order_arrays.change_order_doubles();
						break;
					case 3: // Go Back
						menuCRUD = 3;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch
				} while (menuCRUD != 3);
				break;

			// SUITE
			case 2:
				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION SUITE");
					switch (menuCRUD) {

					case 0: // READ
						read_arrays.read_suite();
						break;
					case 1: // UPDATE
						update_arrays.update_suite();
						break;
					case 2: // ORDER
						order_arrays.change_order_suite();
						break;
					case 3: // Go Back
						menuCRUD = 3;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch

				} while (menuCRUD != 3);
				break;

			// PROFILE
			case 3:
				int menuProfile = 0;
				String[] opc_profile = { "Read", "Update", "Go Back" };
				do {
					menuProfile = function_menu.menubotons(opc_profile, "What do you want to do with the profile?",
							"OPTION PROFILE");

					switch (menuProfile) {
					// READ
					case 0:
						JOptionPane.showMessageDialog(null, Singleton_user.loged_user.toString(), "READ ALL DATES",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					// UPDATE
					case 1:
						update_profiles.up_profile_users(Singleton_user.loged_user);
						break;
					// GO BACK
					case 2:
						menuProfile = 2;
						break;
					}
				} while (menuProfile != 2);
				break;
			// LOG OUT
			case 4:
				JOptionPane.showMessageDialog(null,
						"Closing user session the user: " + Singleton_user.loged_user.getUsername(),"LOG OUT",JOptionPane.INFORMATION_MESSAGE);
				break;

			// DEFAULT
			default:
				JOptionPane.showMessageDialog(null, "Thank you for using our application!", "SEE YOU",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			}// switch
		} while (menuPrincipal != 4);

	}

	// MENU CLIENT
	public static void MENU_Client() {
		int menuPrincipal = 0;
		int menuCRUD = 0;
		String[] opc_menu_principal = { "SINGLE", "DOUBLE", "SUITE", "PROFILE", "LOG OUT", "Exit" };
		String[] opc_menu_CRUD = { "Read","Order", "Go Back", "Exit" };

		do {

			menuPrincipal = function_menu.menubotons(opc_menu_principal, "What room do you want to reserve?",
					"CHOOSE ROOM");
			switch (menuPrincipal) {

			// SINGLE
			case 0:

				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION SINGLE");
					switch (menuCRUD) {

					case 0: // READ
						read_arrays.read_single();
						break;
					case 1: // ORDER
						order_arrays.change_order_single();
						break;
					case 2: // Go Back
						menuCRUD = 2;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch
				} while (menuCRUD != 2);
				break;

			// DOUBLE
			case 1:
				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION DOUBLE");
					switch (menuCRUD) {

					case 0: // READ
						read_arrays.read_doubles();
						break;
					case 1: // ORDER
						order_arrays.change_order_doubles();
						break;
					case 2: // Go Back
						menuCRUD = 2;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch
				} while (menuCRUD != 2);
				break;

			// SUITE
			case 2:
				do {

					menuCRUD = function_menu.menubotons(opc_menu_CRUD, "What option do you want to do?",
							"Choose OPTION SUITE");
					switch (menuCRUD) {

					case 0: // READ
						read_arrays.read_suite();
						break;
					case 1: // ORDER
						order_arrays.change_order_suite();
						break;
					case 2: // Go Back
						menuCRUD = 2;
						break;
					default: // Default/Exit
						JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
								JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
						break;
					}// switch

				} while (menuCRUD != 2);
				break;

			// PROFILE
			case 3:
				int menuProfile = 0;
				String[] opc_profile = { "Read", "Update", "Go Back" };
				do {
					menuProfile = function_menu.menubotons(opc_profile, "What do you want to do with the profile?",
							"OPTION PROFILE");

					switch (menuProfile) {
					// READ
					case 0:
						JOptionPane.showMessageDialog(null, Singleton_user.loged_user.toString(), "READ ALL DATES",
								JOptionPane.INFORMATION_MESSAGE);
						break;
					// UPDATE
					case 1:
						update_profiles.up_profile_users(Singleton_user.loged_user);
						break;
					// GO BACK
					case 2:
						menuProfile = 2;
						break;
					}
				} while (menuProfile != 2);
				break;
			// LOG OUT
			case 4:
				JOptionPane.showMessageDialog(null,"Closing user session the user: " + Singleton_user.loged_user.getUsername(),"LOG OUT",JOptionPane.INFORMATION_MESSAGE);
				break;

			// DEFAULT
			default:
				JOptionPane.showMessageDialog(null, "Thank you for using our application!", "SEE YOU",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			}// switch
		} while (menuPrincipal != 4);
	}

}
