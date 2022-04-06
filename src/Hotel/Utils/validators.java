package Hotel.Utils;

import javax.swing.JOptionPane;

public class validators {

	
// INT
	public static int valida_int(String title, String message) {
		String cad1 = "";
		int n = 0;
		Boolean correcto = true;

		do {
			try {
				cad1 = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (cad1 == null) {
					JOptionPane.showMessageDialog(null, "Exiting the application", "Exit",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				} else {
					n = Integer.parseInt(cad1);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't entered an int num", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);

		return n;
	}// valida_int

	

// VALIDA CHAR
	public static char valida_char(String message, String title) {
		String str_cad2;
		boolean correct = true;
		int check_l = 0;
		char chr = 0;

		do {
			try {
				str_cad2 = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (str_cad2 == null) {
					JOptionPane.showMessageDialog(null, "Exiting the program", "Coming Out",
							JOptionPane.WARNING_MESSAGE);
					System.exit(0);

				} else {
					check_l = str_cad2.length();

					System.out.println("User has entered: " + str_cad2 + " with " + check_l + " characters.");
					if (check_l == 1) {
						chr = str_cad2.charAt(0);
						correct = true;

					} else {
						JOptionPane.showMessageDialog(null, "You have entered more than one character", "Error",
								JOptionPane.ERROR_MESSAGE);
						correct = false;
					}

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You have not entered a character", "Error",
						JOptionPane.ERROR_MESSAGE);
				correct = false;
			}
		} while (correct == false);
		return chr;
	}// END_VALIDACHAR
	


////VALIDA LLETRA
	public static char valida_letra(String message, String title) {
		char letra;
		String str_cad2;
		boolean result = false;
		do {
			letra = validators.valida_char(message, title);
			str_cad2 = String.valueOf(letra);

			try {
				Integer.parseInt(str_cad2);
				result = true;
			} catch (NumberFormatException excepcion) {
				result = false;
			}
			if (result == true) {
				JOptionPane.showMessageDialog(null, "You don't have entered a letter", "Error",
						JOptionPane.ERROR_MESSAGE);

			}
		} while (result == true);
		return letra;
	}// END_VALIDALLETRA



//// VALIDA FLOAT
	public static float valida_float(String message, String title) {
		String cad = "";
		float num = 0.0f;
		boolean correct = false;

		do {
			try {
				cad = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);

				if (cad == null) {
					JOptionPane.showMessageDialog(null, "Exiting the program", "Coming Out",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				} else {
					num = Float.parseFloat(cad);
					correct = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't entered the number", "Error",
						JOptionPane.ERROR_MESSAGE);
				correct = false;
			}
		} while (correct == false);

		return num;
	}//valida_float
	
	
////VALIDA_DOUBLE
	public static double valida_double(String title, String message) {
        String cad = "";
        double precio = 0;
        boolean correct = false;

        do {
            try {
                cad = JOptionPane.showInputDialog(null, title, message, JOptionPane.QUESTION_MESSAGE);
                if (cad == null) {
                    JOptionPane.showMessageDialog(null, "Exiting from the programm", "Exiting",
                            JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    precio = Double.parseDouble(cad);
                    correct = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "You have not introduced a int number.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                correct = false;
            }

        } while (correct == false);

        return precio;
    }//VALIDA_DOUBLE


///VALIDA TO STRING
	public static String valida_String(String message, String title) {
		String string = "";
		boolean correct = false;

		do {
			try {
				string = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				correct = true;
				if (string.equals("")) {
					JOptionPane.showMessageDialog(null, "Error de introduccion de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
					correct = false;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error",
						JOptionPane.ERROR_MESSAGE);
				correct = false;
			}
		} while (correct == false);

		return string;

	}//valida_string
	

}// END_validators
