package Hotel.Modules.Users.Utils;

import Hotel.Utils.*;

import javax.swing.JOptionPane;

public class Data_user {

	// ASK_USERNAME
	public static String ask_username(String message, String title) {
		boolean resultado = false;
		String username = "";

		do {
			username = validators.valida_String(message, title);
			resultado = Regex_user.regex_username(username);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide USERNAME ", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return username;
	}// USERNAME

	// ASK_PASSWORD
	public static String ask_password() {
		boolean resultado = false;
		String password = "";

		do {
			password = validators.valida_String("Enter a password: " +'\n'+ "Must contain:" +'\n'+ "( 1 capital letter" +'\n'+ "  1 lowercase letter" +'\n'+ "  1 special character" +'\n'+ "  1 number" +'\n'+ "  1 number" +'\n'+ "  The 8-20 characters )", "PASSWORD");
			resultado = Regex_user.regex_password(password);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide PASSWORD ", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return password;
	}// PASSWORD

	// ASK_GMAIL
	public static String ask_gmail() {
		boolean resultado = false;
		String gmail = "";

		do {
			gmail = validators.valida_String("Enter a gmail" +'\n'+ "Example: Vicent@gmail.com","GMAIL");
			resultado = Regex_user.regex_gmail(gmail);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide GMAIL", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return gmail;
	}// GMAIL

	// ASK_DATE
	public static String ask_date(String message, String title) {
		boolean resultado = false;
		String fecha = null;

		do {
			fecha = validators.valida_String(message, title);
			resultado = Regex_user.regex_fecha(fecha);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide DATE ", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return fecha;
	}//DATE

	
	// ASK_BOOLEAN
	public static Boolean ask_yes_no(String message, String title) {
		boolean option = function_menu.YES_NO(message, title);
		return option;
	}

} // DATA.java
