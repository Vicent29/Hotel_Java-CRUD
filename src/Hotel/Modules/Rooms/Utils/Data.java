package Hotel.Modules.Rooms.Utils;

import Hotel.Utils.*;



import javax.swing.JOptionPane;

public class Data {

	// ASK_ID
	public static String ask_id(String message, String title) {
		boolean resultado = false;
		String id = "";

		do {
			id = validators.valida_String(message, title);
			resultado = Regex.regex_id(id);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide ID ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return id;
	}// ID

	// ASK_M2
	public static String ask_m2(String message, String title) {
		boolean resultado = false;
		String m2 = "";

		do {
			m2 = validators.valida_String(message, title);
			resultado = Regex.regex_m2(m2);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide M2 ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return m2;
	}// M2

	// ASK_CAPACITY
	public static String ask_capacity(String message, String title) {
		boolean resultado = false;
		String capacitat = "";

		do {
			capacitat = validators.valida_String(message, title);
			resultado = Regex.regex_capacitat(capacitat);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide capacity ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
			}
		} while (resultado == false);
		return capacitat;
	}// CAPACITY

	
	// ASK_BOOLEAN
	public static Boolean ask_yes_no(String message, String title) {
		boolean option = function_menu.YES_NO(message, title);
		return option;
	}

} // DATA.java
