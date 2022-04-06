package Hotel.Modules.Rooms.utils_arrays.Order;

import java.util.Comparator;

import Hotel.Modules.Rooms.Classes.Room;

public class order_id implements Comparator<Room> {

	public int compare(Room room1, Room room2) {
		if (room1.getId().compareTo(room2.getId()) > 0)
			return 1;
		if (room1.getId().compareTo(room2.getId()) < 0)
			return -1;
		return 0;
	}
}
