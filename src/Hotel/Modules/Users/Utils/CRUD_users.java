package Hotel.Modules.Users.Utils;

import Hotel.Classes.Fecha;
import Hotel.Modules.Users.Classes.*;
import Hotel.Utils.*;
import javax.swing.JOptionPane;

public class CRUD_users {
	public static User register_user(int optionsUser) {

		String username = "";
		String password = "";
		String gmail = "";

		// ADMIN
		Fecha f_alta_sistema = null;
		// PREMIUM AND CLIENT
		Fecha f_alta_web = null;
		String nacionalidad = "";
		Fecha f_nacimiento = null;
		String Genero = "";
		int Num_reservas = 0;

		User userType = null;

		username = Singleton_user.USERNAME;
		password = Data_user.ask_password();
		gmail = Data_user.ask_gmail();

		switch (optionsUser) {
		case 0: // ADMIN
			f_alta_sistema = Dates_user.pedir_f_alta_sistema();
			userType = new Admin(username, password, gmail, f_alta_sistema);
			break;

		case 1: // PREMIUM
			f_alta_web = Dates_user.pedir_f_alta_web();
			nacionalidad = validators.valida_String("Enter your nationality:", "NATIONALITY");
			f_nacimiento = Dates_user.pedir_f_nacimiento();
			Genero = validators.valida_String("Enter your gender:", "GENDER");
			Num_reservas = validators.valida_int("Enter the number of times you have been to the hotel: ",
					"NUMBER OF RESERVATIONS");
			userType = new Premium(username, password, gmail, f_alta_web, nacionalidad, f_nacimiento, Genero,
					Num_reservas);
			break;

		case 2: // CLIENT
			f_alta_web = Dates_user.pedir_f_alta_web();
			nacionalidad = validators.valida_String("Enter your nationality:", "NATIONALITY");
			f_nacimiento = Dates_user.pedir_f_nacimiento();
			Genero = validators.valida_String("Enter your gender:", "GENDER");
			userType = new Client(username, password, gmail, f_alta_web, nacionalidad, f_nacimiento, Genero);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Thank you for using our application!", "SEE YOU",
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		}// switch

		return userType;
	}//register

	// UPDATE
	public static User update_user(User usertype) {

		String elegir_cambiar = "";
		// ADMIN
		if (usertype instanceof Admin) {

			do {
				String[] cambiar_user = { "Password", "Gmail", "High date system", "Go Back" };
				elegir_cambiar = function_menu.combo_String(cambiar_user, "Choose the option the profile to upgrade?",
						"UPDATE PROFILE ADMIN");
				switch (elegir_cambiar) {

				case "Password":
					usertype.setPassword(Data_user.ask_password());
					JOptionPane.showMessageDialog(null, "Password: " + usertype.getPassword());
					break;
				case "Gmail":
					usertype.setGmail(Data_user.ask_gmail());
					JOptionPane.showMessageDialog(null, "Gmail: " + usertype.getGmail());
					break;
				case "High date system":
					((Admin) usertype).setF_alta_sistema(Dates_user.pedir_f_alta_sistema());
					JOptionPane.showMessageDialog(null, "High date system: " + ((Admin) usertype).getF_alta_sistema());
					break;
				case "Go Back":
					elegir_cambiar = "Exit";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
				}// SWITCH_menuOptions

			} while (elegir_cambiar != "Exit");
		} // IF_ADMIN

		// PREMIUM
		if (usertype instanceof Client) {

			do {
				String[] cambiar_user = { "Password", "Gmail", "Website registration date", "Nationality",
						"Date of birth", "Gender", "Number of reservations", "Go Back" };
				elegir_cambiar = function_menu.combo_String(cambiar_user, "Choose the option the profile to upgrade?",
						"UPDATE PROFILE PREMIUM");
				switch (elegir_cambiar) {

				case "Password":
					usertype.setPassword(Data_user.ask_password());
					JOptionPane.showMessageDialog(null, "Password: " + usertype.getPassword());
					break;
				case "Gmail":
					usertype.setGmail(Data_user.ask_gmail());
					JOptionPane.showMessageDialog(null, "Gmail: " + usertype.getGmail());
					break;
				case "Website registration date":
					((Premium) usertype).setF_alta_web(Dates_user.pedir_f_alta_web());
					JOptionPane.showMessageDialog(null,
							"Website registration date: " + ((Premium) usertype).getF_alta_web());
					break;
				case "Nationality":
					((Premium) usertype)
							.setNacionalidad(validators.valida_String("Enter your nationality:", "NATIONALITY"));
					JOptionPane.showMessageDialog(null, "Nationality: " + ((Premium) usertype).getNacionalidad());
					break;
				case "Date of birth":
					((Premium) usertype).setf_nacimiento(Dates_user.pedir_f_nacimiento());
					JOptionPane.showMessageDialog(null, "Date of birth: " + ((Premium) usertype).getf_nacimiento());
					break;
				case "Gender":
					((Premium) usertype).setGenero(validators.valida_String("Enter your gender:", "GENDER"));
					JOptionPane.showMessageDialog(null, "Gender: " + ((Premium) usertype).getGenero());
					break;
				case "Number of reservations":
					((Premium) usertype).setNum_reservas(validators.valida_int(
							"Enter the number of times you have been to the hotel: ", "NUMBER OF RESERVATIONS"));
					JOptionPane.showMessageDialog(null,
							"Number of reservations: " + ((Premium) usertype).getNum_reservas());
					break;
				case "Go Back":
					elegir_cambiar = "Exit";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
				}// SWITCH_menuOptions

			} while (elegir_cambiar != "Exit");
		} // IF_PREMIUM

		// CLIENT
		if (usertype instanceof Client) {

			do {
				String[] cambiar_user = { "Password", "Gmail", "Website registration date", "Nationality",
						"Date of birth", "Gender", "Go Back" };
				elegir_cambiar = function_menu.combo_String(cambiar_user, "Choose the option the profile to upgrade?",
						"UPDATE PROFILE CLIENT");
				switch (elegir_cambiar) {

				case "Password":
					usertype.setPassword(Data_user.ask_password());
					JOptionPane.showMessageDialog(null, "Password: " + usertype.getPassword());
					break;
				case "Gmail":
					usertype.setGmail(Data_user.ask_gmail());
					JOptionPane.showMessageDialog(null, "Gmail: " + usertype.getGmail());
					break;
				case "Website registration date":
					((Client) usertype).setF_alta_web(Dates_user.pedir_f_alta_web());
					JOptionPane.showMessageDialog(null,
							"Website registration date: " + ((Client) usertype).getF_alta_web());
					break;
				case "Nationality":
					((Client) usertype)
							.setNacionalidad(validators.valida_String("Enter your nationality:", "NATIONALITY"));
					JOptionPane.showMessageDialog(null, "Nationality: " + ((Client) usertype).getNacionalidad());
					break;
				case "Date of birth":
					((Client) usertype).setf_nacimiento(Dates_user.pedir_f_nacimiento());
					JOptionPane.showMessageDialog(null, "Date of birth: " + ((Client) usertype).getf_nacimiento());
					break;
				case "Gender":
					((Client) usertype).setGenero(validators.valida_String("Enter your gender:", "GENDER"));
					JOptionPane.showMessageDialog(null, "Gender: " + ((Client) usertype).getGenero());
					break;
				case "Go Back":
					elegir_cambiar = "Exit";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
				}// SWITCH_menuOptions

			} while (elegir_cambiar != "Exit");
		} // IF_CLIENT
		return usertype;
	}

}// functions_CRUD_Room
