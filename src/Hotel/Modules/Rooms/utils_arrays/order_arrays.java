package Hotel.Modules.Rooms.utils_arrays;

import java.util.Collections;

import javax.swing.JOptionPane;

import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.utils_arrays.Order.order_id;
import Hotel.Modules.Rooms.utils_arrays.Order.order_price;
import Hotel.Utils.function_menu;

public class order_arrays {

	public static void change_order_single() {
		String[] options = { "ID", "PRICE" };
		String menu_order;

		if (Singleton.a_Single.isEmpty()) {
			JOptionPane.showMessageDialog(null, "There isn't exist Single rooms", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			menu_order = function_menu.combo_String(options, "Choose why you want to order the Single rooms:",
					"ORDER SINGLE ROOMS");
			switch (menu_order) {
			case "ID":
				Collections.sort(Singleton.a_Single, new order_id());
				break;
			case "PRICE":
				Collections.sort(Singleton.a_Single, new order_price());
				break;
			}
		}
	}//change_order_single

	public static void change_order_doubles() {
		String[] options = { "ID", "PRICE" };
		String menu_order;

		if (Singleton.a_Doubles.isEmpty()) {
			JOptionPane.showMessageDialog(null, "There isn't exist Doubles rooms", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			menu_order = function_menu.combo_String(options, "Choose why you want to order the Doubles rooms:",
					"ORDER DOUBLES ROOMS");
			switch (menu_order) {
			case "ID":
				Collections.sort(Singleton.a_Doubles, new order_id());
				break;
			case "PRICE":
				Collections.sort(Singleton.a_Doubles, new order_price());
				break;

			default:
				break;
			}
		}
	}// change_order_doubles
	
	
	public static void change_order_suite() {
		String[] options = { "ID", "PRICE" };
		String menu_order;

		if (Singleton.a_Suite.isEmpty()) {
			JOptionPane.showMessageDialog(null, "There isn't exist Suite rooms", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			menu_order = function_menu.combo_String(options, "Choose why you want to order the Suite rooms:",
					"ORDER SUITE ROOMS");
			switch (menu_order) {
			case "ID":
				Collections.sort(Singleton.a_Suite, new order_id());
				break;
			case "PRICE":
				Collections.sort(Singleton.a_Suite, new order_price());
				break;

			default:
				break;
			}
		}
	}// change_order_doubles

}// ORDER_ARRAYS.JAVA
