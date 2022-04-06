package Hotel.Modules.Rooms.Utils;


import javax.swing.JOptionPane;
import Hotel.Classes.Fecha;
import Hotel.Utils.validators;

public class Dates {
	// En este archivo deberemos de podner todas funciones de pedir fecha
	// fechaInicio_est
	// fechaFin_est
	// fechaInicio_jacuzzi
	// fechaFin_jacuzzi

//  pedir_fechaIni
	public static Fecha pedir_fechaIni() {
		boolean resultado = false;
		String fecha_pedida = "";
		Fecha fechaInicio_est = null; // CREAR EL OBJETO
		do {
			fecha_pedida = validators.valida_String("Give me Enter Date" +'\n'+ "Example 'dd/mm/yyyy'", "DATE ENTER");
			resultado = Regex.regex_fecha(fecha_pedida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide data ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
				fechaInicio_est = new Fecha(fecha_pedida);				
				resultado = fechaInicio_est.validaFecha();
			}
		} while (resultado == false);
		return fechaInicio_est;
	}// pedir_fechaIni	
	
	
//  pedir_fechaFin
	public static Fecha pedir_fechaFin(Fecha fechaInicio_est) {
		boolean resultado = false;
		int resta = 0;
		String fecha_pedida = "";
		Fecha fechaFin_est = null;

		do {
			fecha_pedida = validators.valida_String("Give me Finish Date" +'\n'+ "Example 'dd/mm/yyyy'", "DATE FINIH");
			resultado = Regex.regex_fecha(fecha_pedida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide data ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
				fechaFin_est = new Fecha(fecha_pedida);
				resultado = fechaFin_est.validaFecha();
				if (fechaFin_est.CompararDates(fechaInicio_est) == 1|| (fechaFin_est.CompararDates(fechaInicio_est) == 3)) {
					JOptionPane.showMessageDialog(null, " La fecha de Fin es igual o menor a la inicial ", "Error", JOptionPane.ERROR_MESSAGE);
					resultado = false;
				} else {
					resta = fechaInicio_est.restar2Fechas(fechaFin_est);
					if (resta >= 2) {
						JOptionPane.showMessageDialog(null, " The instance is: " +resta, "INSTANCE", JOptionPane.INFORMATION_MESSAGE);
						resultado = true;
					} else {
						JOptionPane.showMessageDialog(null, " The instance is INCORRECT: ", "INSTANCE INCORRECT", JOptionPane.INFORMATION_MESSAGE);
						resultado = false;
					} // resta error
				} // else >=2
			}
		} while (resultado == false);
		return fechaFin_est;
	}// pedir_fechaFin

//	pedir_fechaIni_jacuzzi	
	public static Fecha pedir_fechaIni_jacuzzi(Fecha fechaInicio_est, Fecha fechaFin_est ) {
		boolean resultado = false;
		String fecha_pedida = "";
		Fecha fechaInicio_jacuzzi = null; // CREAR EL OBJETO
		do {
			fecha_pedida = validators.valida_String("Give me Enter date jacuzzi:" +'\n'+"  Entry Date: "+fechaInicio_est+'\n'+"  Finish Date: "+fechaFin_est+'\n'+"  Example 'dd/mm/yyyy'", "ENTER DATE JACUZZI");
			resultado = Regex.regex_fecha(fecha_pedida);
			if (resultado == false) {
				JOptionPane.showMessageDialog(null, "You entered a invalide data ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				resultado = true;
				fechaInicio_jacuzzi = new Fecha(fecha_pedida);
				resultado = fechaInicio_jacuzzi.validaFecha();
				if (fechaInicio_jacuzzi.CompararDates(fechaInicio_est) == 1 || fechaInicio_jacuzzi.CompararDates(fechaFin_est) == 2) {
					JOptionPane.showMessageDialog(null, "You entered a invalide  jacuzzi entry date","ERROR ",JOptionPane.ERROR_MESSAGE);	
					resultado = false;
				} else {
					resultado = true;
				}
			} // else 
		} while (resultado == false);
		return fechaInicio_jacuzzi;
	}//pedir_fechaIni_jacuzzi
	
	
//	pedir_fechaFin_jacuzzi
		public static Fecha pedir_fechaFin_jacuzzi(Fecha fechaFin_est, Fecha fechaIni_jacuzzi) {
			boolean resultado = false;
			String fecha_pedida = "";
			Fecha fechaFin_jacuzzi = null; // CREAR EL OBJETO
			do {
				fecha_pedida = validators.valida_String("Give me Finish date jacuzzi:"+'\n'+"  Entry Date Jacuzzi: "+ fechaIni_jacuzzi +'\n'+"  Finish Date: "+fechaFin_est +'\n'+ "  Example 'dd/mm/yyyy'", "FINISH DATE JACUZZI");
				resultado = Regex.regex_fecha(fecha_pedida);
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "You entered a invalide data ", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = true;
					fechaFin_jacuzzi = new Fecha(fecha_pedida);
					resultado = fechaFin_jacuzzi.validaFecha();
					if (fechaFin_jacuzzi.CompararDates(fechaIni_jacuzzi) == 1 || fechaFin_jacuzzi.CompararDates(fechaFin_est) == 2) {
						JOptionPane.showMessageDialog(null, "You entered a invalide  jacuzzi entry date","ERROR ",JOptionPane.ERROR_MESSAGE);	
						resultado = false;
					} else {
						resultado = true;
					}
				} // else 
			} while (resultado == false);
			return fechaFin_jacuzzi;
		}//pedir_fechaFin_jacuzzi
		
		
//		pedir_fechaIni_update
		public static Fecha pedir_fechaIni_update(Fecha fechaFin_est) {
			boolean resultado = false;
			int resta = 0;
			String fecha_pedida = "";
			Fecha fechaIni_update = null;

			do {
				fecha_pedida = validators.valida_String("Give me Enter Date update" +'\n'+ "Example 'dd/mm/yyyy'", "DATE ENTER UPDATE");
				resultado = Regex.regex_fecha(fecha_pedida);
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "You entered a invalide data ", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = true;
					fechaIni_update = new Fecha(fecha_pedida);
					resultado = fechaIni_update.validaFecha();
					if (fechaIni_update.CompararDates(fechaFin_est) == 2 || fechaIni_update.CompararDates(fechaFin_est) == 3) {
						System.out.println("La fecha de INICIO es MAYOR o IGUAL  a fecha_FIN");
						JOptionPane.showMessageDialog(null, "The date is wrong, try another date ", "Error", JOptionPane.ERROR_MESSAGE);
						resultado = false;
					} else {
						System.out.println("F_INI_UPDATE: " + fechaIni_update.getFecha() + " < " + "F_FIN " + fechaFin_est.getFecha());
						resta = fechaIni_update.restar2Fechas(fechaFin_est);
						if (resta >= 2) {
							resultado = true;
						} else {
							JOptionPane.showMessageDialog(null, "Instance is less than 2 ", "Error", JOptionPane.ERROR_MESSAGE);
							resultado = false;
						} // resta error
					} // else >=2
				}
			} while (resultado == false);
			return fechaIni_update;
		}// pedir_fechaFin
		
		
		
//		pedir_fechaIni_jacuzzi_update
		public static Fecha pedir_fechaIni_jacuzzi_update(Fecha fechaInicio_est , Fecha fechaFin_jacuzzi) {
			boolean resultado = false;
			String fecha_pedida = "";
			Fecha fechaIni_jacuzzi_update = null;

			do {
				fecha_pedida = validators.valida_String("Give me Enter date jacuzzi:" +'\n'+"  Entry Date: "+fechaInicio_est +'\n'+"  Finish Date Jacuzzi: "+fechaFin_jacuzzi+'\n'+"  Example 'dd/mm/yyyy'", "ENTER DATE JACUZZI");
				resultado = Regex.regex_fecha(fecha_pedida);
				if (resultado == false) {
					JOptionPane.showMessageDialog(null, "You entered a invalide data ", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					resultado = true;
					fechaIni_jacuzzi_update = new Fecha(fecha_pedida);
					resultado = fechaIni_jacuzzi_update.validaFecha();
					if (fechaIni_jacuzzi_update.CompararDates(fechaInicio_est) == 1 || fechaIni_jacuzzi_update.CompararDates(fechaFin_jacuzzi) == 2) {
						JOptionPane.showMessageDialog(null, "The date is wrong, try another date ", "Error", JOptionPane.ERROR_MESSAGE);						
						resultado = false;
					} else {
						resultado = true;	
					} // else
				}
			} while (resultado == false);
			return fechaIni_jacuzzi_update;
		}// pedir_fechaFin		
		
}// dates.java
