package Hotel.Modules.Rooms.utils_arrays;

import Hotel.Modules.Rooms.Classes.*;
import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.Utils.Data;

public class ask_IDS {
	//SINGLE
	public static Single ask_id_single() {
		Singleton.ID= Data.ask_id("Give me ID Room Single" +'\n'+ "Example: 001-S", "ID_SINGLE");
		return new Single(Singleton.ID);
	}
	
	//DOUBLES
	public static Doubles ask_id_doubles() {
		Singleton.ID= Data.ask_id("Give me ID Room Doubles" +'\n'+ "Example: 001-D", "ID_DOUBLES");
		return new Doubles(Singleton.ID);
	}
	
	//SUIT
	public static Suite ask_id_suite() {
		Singleton.ID= Data.ask_id("Give me ID Room Suite" +'\n'+ "Example: 001-Sw", "ID_SUIT");
		return new Suite(Singleton.ID);
	}

}
