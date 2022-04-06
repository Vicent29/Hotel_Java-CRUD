package Hotel.Modules.Rooms.utils_arrays;

import javax.swing.JOptionPane;
import Hotel.Modules.Rooms.Classes.*;
import Hotel.Utils.function_menu;


public class read_arrays {
	
	//SINGLE
	public static void read_single() {
		int menu = 0, pos = -1;
		String[] opc_leer = { "ALL ROOMS SINGLE", "ONE ROOM SINGLE" };

		if (Singleton.a_Single.isEmpty()) {
			JOptionPane.showMessageDialog(null,"You must create a room single first!", "There isn't room Single" , JOptionPane.ERROR_MESSAGE);
		} else {
			menu = function_menu.menubotons(opc_leer, "What do you want to read", "READ SINGLE");
			switch (menu) {
			case 0:
				
				for (int i = 0; i < Singleton.a_Single.size(); i++) {
					String cad = "";
					JOptionPane.showMessageDialog(null,(Singleton.a_Single.get(i).getId() + ":") , "READ SINGLE", JOptionPane.INFORMATION_MESSAGE);
					cad = cad +(Singleton.a_Single.get(i).toString());
					if (cad!=null) {
						JOptionPane.showMessageDialog(null, cad);
					}
					
				}
				break;
			case 1:
				pos = -1;
				Single s1 = ask_IDS.ask_id_single();
				pos = find.find_Single_id(s1);
				if (pos != -1) {
					s1 = Singleton.a_Single.get(pos);
					JOptionPane.showMessageDialog(null, s1.toString());
				}else {
					JOptionPane.showMessageDialog(null,"There isn't single room","ERROR" , JOptionPane.ERROR_MESSAGE);
				}
				break;
			}//FIN_SWITCH
		}
	}//read_single
	
	//DOUBLES
	public static void read_doubles() {
		int menu = 0, pos = -1;
		String[] opc_leer = { "ALL ROOMS DOUBLES", "ONE ROOM DOUBLE" };

		if (Singleton.a_Doubles.isEmpty()) {
			JOptionPane.showMessageDialog(null,"You must create a room double first!", "There isn't room Single" , JOptionPane.ERROR_MESSAGE);
		} else {
			menu = function_menu.menubotons(opc_leer, "What do you want to read?", "READ DOUBLE");
			switch (menu) {
			case 0:
				
				for (int i = 0; i < Singleton.a_Doubles.size(); i++) {
					String cad = "";
					cad = cad + (Singleton.a_Doubles.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				pos = -1;
				Doubles d1 = ask_IDS.ask_id_doubles();
				pos = find.find_Double_id(d1);
				if (pos != -1) {
					d1 = Singleton.a_Doubles.get(pos);
					JOptionPane.showMessageDialog(null, d1.toString());
				}else {
					JOptionPane.showMessageDialog(null,"There isn't double room","ERROR" , JOptionPane.ERROR_MESSAGE);
				}
				break;
			}//FIN_SWITCH
		}
	}//read_double
	
	
	//SUIT
	public static void read_suite() {
		int menu = 0, pos = -1;
		String[] opc_leer = { "ALL ROOMS SUITES", "ONE ROOM SUITE" };

		if (Singleton.a_Suite.isEmpty()) {
			JOptionPane.showMessageDialog(null,"You must create a room suite first!", "There isn't room Suite" , JOptionPane.ERROR_MESSAGE);
		} else {
			menu = function_menu.menubotons(opc_leer, "What do you want to read?", "READ SUITE");
			switch (menu) {
			case 0:
				
				for (int i = 0; i < Singleton.a_Suite.size(); i++) {
					String cad = "";
					cad = cad + (Singleton.a_Suite.get(i).toString());
					JOptionPane.showMessageDialog(null, cad);
				}
				break;
			case 1:
				pos = -1;
				Suite su1 = ask_IDS.ask_id_suite();
				pos = find.find_Suite_id(su1);
				if (pos != -1) {
					su1 = Singleton.a_Suite.get(pos);
					JOptionPane.showMessageDialog(null, su1.toString());
				}else {
					JOptionPane.showMessageDialog(null,"There isn't suite room","ERROR" , JOptionPane.ERROR_MESSAGE);
				}
				break;
			}//FIN_SWITCH
		}
	}//read_suite
	

}// READ_ARRAYS.java
