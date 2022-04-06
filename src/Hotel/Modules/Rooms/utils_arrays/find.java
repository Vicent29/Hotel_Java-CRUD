package Hotel.Modules.Rooms.utils_arrays;

import Hotel.Modules.Rooms.Classes.*;
import Hotel.Modules.Rooms.Classes.Singleton;

public class find {

	// SINGLE
	public static int find_Single_id(Single opcion) {
		int pos = -1;
		if (Singleton.a_Single.size() != 0) {
			for (int i = 0; i <= (Singleton.a_Single.size()-1); i++) {
				if ((Singleton.a_Single.get(i).getId()).equals(opcion.getId())) {
					return i;
				}
			} // for
		} // if
		return pos;
	}// FIND_SINGLE

	
	// DOUBLES
	public static int find_Double_id(Doubles opcion) {
		int pos = -1;
		if (Singleton.a_Doubles.size() != 0) {
			for (int i = 0; i <= Singleton.a_Doubles.size()-1; i++) {
				if ((Singleton.a_Doubles.get(i).getId()).equals(opcion.getId())) {
					return i;
				}
			} // for
		} // if
		return pos;
	}// FIND_DOUBLES

	
	// SUIT
	public static int find_Suite_id(Suite opcion) {
		int pos = -1;
		if (Singleton.a_Suite.size() != 0) {
			for (int i = 0; i <= Singleton.a_Suite.size()-1; i++) {
				if ((Singleton.a_Suite.get(i).getId()).equals(opcion.getId())) {
					return i;
				}
			} // for
		} // if
		return pos;
	}// FIND_DOUBLES

}// FIND.java
