package Hotel.Modules.Rooms.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Esta_clase_sirve_para_validar_el_formato_de_los_datos.
public class Regex {

	private static final String plantilla_fecha ="(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]((175[7-9])|(17[6-9][0-9])|(1[8-9][0-9][0-9])|([2-9][0-9][0-9][0-9]))"; // 12/10/2021
	private static final String plantilla_id = "([0-9]{1,3})-([A-Z]{1}[a-z]{0,1})"; //3numeros-1letra o 2 letra_opcional 
	private static final String plantilla_m2 = "([0-9]+)";//numeros_del_0_al_9_con_un_minimo_de_1_o_mas_numeros
	private static final String plantilla_capacitat = "([0-6]{1})";//de_0_a_6_personas_

	// regex_fecha
	public static boolean regex_fecha(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha); // pilla plantilla
		Matcher matcher = pattern.matcher(fecha); // comprova que fecha siga igual que la plantilla
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// regex_id
	public static boolean regex_id(String id) {
		Pattern pattern = Pattern.compile(plantilla_id); // pilla plantilla
		Matcher matcher = pattern.matcher(id); // comprova que fecha siga igual que la plantilla
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// regex_m2
	public static boolean regex_m2(String m2) {
		Pattern pattern = Pattern.compile(plantilla_m2); // pilla plantilla
		Matcher matcher = pattern.matcher(m2); // comprova que fecha siga igual que la plantilla
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	
	// regex_capacitat
		public static boolean regex_capacitat(String capacitat) {
			Pattern pattern = Pattern.compile(plantilla_capacitat); // pilla plantilla
			Matcher matcher = pattern.matcher(capacitat); // comprova que fecha siga igual que la plantilla
			if (matcher.matches()) {
				return true;
			}
			return false;
		}

	
		
	

}// REGEX.java
