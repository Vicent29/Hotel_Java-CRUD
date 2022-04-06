package Hotel.Utils;

import javax.swing.JOptionPane;

public class function_menu {

// BOTONS
	public static int menubotons(String[] options, String message, String title) {
		int menu1 = 0;

		menu1 = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		return menu1;
	}

// COMBOS OBJECT
	public static Object menucombo(String[] options, String message, String title) {
		Object menu = 0;
		menu = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, null);
		if (menu == null) {
			JOptionPane.showMessageDialog(null, "Exit...");
			System.exit(0);
		}
		return menu;
	}

//SI O NO
	public static boolean YES_NO(String message, String title) {
		String[] yes_no = { "YES", "NO" };
		boolean valor = false;
		int option = 0;

		option = function_menu.menubotons(yes_no, message, title);
		if (option == 0) {
			valor = true;
		}
		if (option == 1) {
			valor = false;
		}

		return valor;

	}

// COMBO CAMBIAR ROOM o EN STRING
	public static String combo_String(String[] options, String message, String title) {
		Object elegir = null;

		elegir = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options,
				options[0]);
		if (elegir == null) {
			JOptionPane.showMessageDialog(null, "Exiting...");
			System.exit(0);
		}
		return elegir.toString();
	}

	
//COMBO VOLVER ATRAS (YES/NO)

	public static void combo_si_no(String[] options, String message, String title) {
		
		Object elegir = null;
//		System.out.println("options" + options);
//		System.out.println("mesage" + message);
//		System.out.println("title" + title);

		elegir = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options,
				options[0]);
		if (elegir == "No") {
			JOptionPane.showMessageDialog(null, "Exiting...");
			System.exit(0);
		}//if
	}//combo_si/no
	
	
	//COMBO VOLVER ATRAS (YES/NO)
		public static void botons_si_no(String[] options, String message, String title) {
			
			int elegir = 0;

			elegir = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if (elegir == 1) {
				JOptionPane.showMessageDialog(null, "Exiting...");
				System.exit(0);
			}//if
		}//combo_si/no

}// fuction_menu
