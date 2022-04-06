package Hotel.Modules.Users.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Esta_clase_sirve_para_validar_el_formato_de_los_datos.
public class Regex_user {

	private static final String plantilla_fecha ="(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]((175[7-9])|(17[6-9][0-9])|(1[8-9][0-9][0-9])|([2-9][0-9][0-9][0-9]))"; // 12/10/2021
	private static final String plantilla_username = "([0-9A-Za-z]{3,15})"; //other letter and numbers with 4 characters a 15 characters
	private static final String plantilla_password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";//OBLIGATORY: 1 letter MAYUS, 1 lowercase_letter, 1 special character and 1 number
	private static final String plantilla_gmail = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");//vicent@gmail.com

	// regex_fecha
	public static boolean regex_fecha(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha); // pilla plantilla
		Matcher matcher = pattern.matcher(fecha); // comprova que fecha siga igual que la plantilla
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// regex_username
	public static boolean regex_username(String username) {
		Pattern pattern = Pattern.compile(plantilla_username); // pilla plantilla
		Matcher matcher = pattern.matcher(username); // comprova que fecha siga igual que la plantilla
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// regex_password
	public static boolean regex_password(String password) {
		Pattern pattern = Pattern.compile(plantilla_password); // pilla plantilla
		Matcher matcher = pattern.matcher(password); // comprova que fecha siga igual que la plantilla
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	
	// regex_gmail
		public static boolean regex_gmail(String gmail) {
			Pattern pattern = Pattern.compile(plantilla_gmail); // pilla plantilla
			Matcher matcher = pattern.matcher(gmail); // comprova que fecha siga igual que la plantilla
			if (matcher.matches()) {
				return true;
			}
			return false;
		}

	
		
	

}// REGEX.java
