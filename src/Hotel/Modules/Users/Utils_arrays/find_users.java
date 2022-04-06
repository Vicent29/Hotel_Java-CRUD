package Hotel.Modules.Users.Utils_arrays;

import Hotel.Modules.Users.Classes.Singleton_user;


public class find_users {

	//FIND GENERAL
		public static int find_general_username(String username) {
			int pos = -1;
			if (Singleton_user.a_Users.size() != 0) {
				for (int i = 0; i <= (Singleton_user.a_Users.size()-1); i++) {
					if ((Singleton_user.a_Users.get(i).getUsername()).equals(username)) {
						return i;
					}
				} // for
			} // if
			return pos;
		}// FIND_ADMIN
	


}// FIND_USERS.java
