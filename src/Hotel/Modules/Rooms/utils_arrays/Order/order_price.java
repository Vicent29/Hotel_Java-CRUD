package Hotel.Modules.Rooms.utils_arrays.Order;

import java.util.Comparator;

import Hotel.Modules.Rooms.Classes.Room;


public class order_price implements Comparator<Room> {

	public int compare(Room room1, Room room2) {
		if(((Room)room1).getPrecio()>((Room)room2).getPrecio())
			return 1;
		if(((Room)room1).getPrecio()<((Room)room2).getPrecio())
			return -1;
		return 0;
	}
}


