package Hotel.Modules.Rooms.utils_arrays;

import java.util.ArrayList;

import Hotel.Modules.Rooms.Classes.Room;
import Hotel.Modules.Rooms.Classes.Single;
import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.Utils.CRUD;

public class test_arrays {

	public static void main(String[] args) {
		Singleton.a_Single = new ArrayList<>();
		Singleton.a_Doubles = new ArrayList<>();

		Single aSingle = (Single)CRUD.created_room(0);
		
		System.out.println(Singleton.a_Single.get(0));
		
		update_arrays.update_single(aSingle);
		
		System.out.println(Singleton.a_Single.get(0));
		
	}

}
