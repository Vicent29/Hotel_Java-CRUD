package Hotel.Modules.Users.Utils;

import javax.swing.JOptionPane;

import Hotel.Classes.Fecha;
import Hotel.Utils.validators;

public class Dates_user {
	// En este archivo deberemos de podner todas funciones de pedir fecha
	// f_alta_sistema
	// f_alta_web
	// f_nacimiento

//pedir_f_alta_sistema
	public static Fecha pedir_f_alta_sistema() {
		boolean resultado = false;
		String fecha_pedida = "";
		Fecha f_alta_sistema = null; // CREAR EL OBJETO
		do {
			fecha_pedida = validators.valida_String("Enter a High date system:" + '\n' + "Example 'dd/mm/yyyy'",
					"HIGH DATE SYSTEM");
			resultado = Regex_user.regex_fecha(fecha_pedida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide High data systeam", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
				f_alta_sistema = new Fecha(fecha_pedida);
				resultado = f_alta_sistema.validaFecha();
			}
		} while (resultado == false);
		return f_alta_sistema;
	}

// pedir_f_alta_web
	public static Fecha pedir_f_alta_web() {
		boolean resultado = false;
		String fecha_pedida = "";
		Fecha f_alta_web = null; // CREAR EL OBJETO
		do {
			fecha_pedida = validators.valida_String(
					"Enter a Website registration date:" + '\n' + "Example 'dd/mm/yyyy'", "WEBSITE REGISTARTION DATE");
			resultado = Regex_user.regex_fecha(fecha_pedida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide Registration data ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
				f_alta_web = new Fecha(fecha_pedida);
				resultado = f_alta_web.validaFecha();
			}
		} while (resultado == false);
		return f_alta_web;
	}

// pedir_f_nacimiento
	public static Fecha pedir_f_nacimiento() {
		boolean resultado = false;
		String fecha_pedida = "";
		Fecha f_nacimiento = null; // CREAR EL OBJETO
		do {
			fecha_pedida = validators.valida_String("Enter a Birth Date:" + '\n' + "Example 'dd/mm/yyyy'", "BIRTH DAY");
			resultado = Regex_user.regex_fecha(fecha_pedida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide Birth data ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
				f_nacimiento = new Fecha(fecha_pedida);
				resultado = f_nacimiento.validaFecha();
			}
		} while (resultado == false);
		return f_nacimiento;
	}

}// DATES_USER.java
