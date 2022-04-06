package Hotel.Modules.Rooms.utils_arrays;

import javax.swing.JOptionPane;
import Hotel.Modules.Rooms.Classes.*;
import Hotel.Modules.Rooms.Utils.CRUD;


public class created_arrays {

	// SINGLE
	public static void create_SINGLE() { // null
		
		int pos = -1;

		Single s1 = ask_IDS.ask_id_single(); // Single -> ID
		pos = find.find_Single_id(s1);
	
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "This Single room already exists", "ROOM EXISTS",
					JOptionPane.ERROR_MESSAGE);
		} else {
			s1 = (Single) CRUD.created_room(0); // CRERA LA HABITACION
			Singleton.a_Single.add(s1);
		}
	}

	// DOUBLES
	public static void create_DOUBLES() {
		int pos = -1;

		Doubles d1 = ask_IDS.ask_id_doubles();
		pos = find.find_Double_id(d1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "This Double room already exists", "ROOM EXISTS",
					JOptionPane.ERROR_MESSAGE);
		} else {
			d1 = (Doubles) CRUD.created_room(1); // CREAR LA HABITACION
			Singleton.a_Doubles.add(d1);
		}
	}

	// SUIT
	public static void create_SUITE() {
		int pos = -1;

		Suite su1 = ask_IDS.ask_id_suite();
		pos = find.find_Suite_id(su1);
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "This Single room already exists", "ROOM EXISTS",
					JOptionPane.ERROR_MESSAGE);
		} else {
			su1 = (Suite) CRUD.created_room(2); // CRERA LA HABITACION
			Singleton.a_Suite.add(su1);
		}
	}

}// CREATED.java
