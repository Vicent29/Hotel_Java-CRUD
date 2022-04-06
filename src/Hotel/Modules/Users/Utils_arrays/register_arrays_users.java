package Hotel.Modules.Users.Utils_arrays;

import javax.swing.JOptionPane;
import Hotel.Modules.Users.Classes.Admin;
import Hotel.Modules.Users.Classes.Client;
import Hotel.Modules.Users.Classes.Premium;
import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Utils.CRUD_users;



public class register_arrays_users {

	//ADMIN
	public static void create_ADMIN() { 
		
		int pos = -1;

		Admin a1 = ask_USERNAMES.ask_username_Admin(); 
		pos = find_users.find_general_username(a1.getUsername());
	
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "This user Admin already exists", "USER EXISTS",JOptionPane.ERROR_MESSAGE);
		} else {
			a1 = (Admin) CRUD_users.register_user(0); // CRERA LA HABITACION
			Singleton_user.a_Users.add(a1);
			
		}
	}

	//PREMIUM
	public static void create_PREMIUM() {
		int pos = -1;

		Premium p1 = ask_USERNAMES.ask_username_Premium();
		pos = find_users.find_general_username(p1.getUsername());
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "This user Premium  already exists", "USER EXISTS",
					JOptionPane.ERROR_MESSAGE);
		} else {
			p1 = (Premium) CRUD_users.register_user(1); // CREAR LA HABITACION
//			Singleton_user.a_Premium.add(p1);
			Singleton_user.a_Users.add(p1);
		}
	}

	//CLIENT
	public static void create_CLIENT() {
		int pos = -1;

		Client c1 = ask_USERNAMES.ask_username_Client();
		pos = find_users.find_general_username(c1.getUsername());
		if (pos != -1) {
			JOptionPane.showMessageDialog(null, "This user Client already exists", "USER EXISTS",JOptionPane.ERROR_MESSAGE);
		} else {
			c1 = (Client) CRUD_users.register_user(2); // CRERA LA HABITACION
//			Singleton_user.a_Client.add(c1);
			Singleton_user.a_Users.add(c1);
		}
	}

}// CREATED.java
