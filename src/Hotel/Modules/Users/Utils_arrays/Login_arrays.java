package Hotel.Modules.Users.Utils_arrays;


import javax.swing.JOptionPane;
import Hotel.Modules.Users.Classes.Admin;
import Hotel.Modules.Users.Classes.Client;
import Hotel.Modules.Users.Classes.Premium;
import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Classes.User;
import Hotel.Modules.Users.Utils.Data_user;

public class Login_arrays {
	
	public static void login_Users() {
		User u2=null;
		int pos = -1;
		Boolean com_password = false;

		if (Singleton_user.a_Users.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You must create a user Admin first!", "There isn't USER",
					JOptionPane.ERROR_MESSAGE);
		} else {
			String u1 = Data_user.ask_username("Enter a usename:", "USERNAME LOGIN");
			pos = find_users.find_general_username(u1);
			if (pos != -1) {
				do {
					String password = Data_user.ask_password();
					 u2 = Singleton_user.a_Users.get(pos);
					if (password.equals( u2.getPassword())) {
						com_password=true;
						Singleton_user.loged_user=u2;
						
					}else {
						JOptionPane.showMessageDialog(null, "The password isn't correct", "ERROR PASSWORD",
								JOptionPane.ERROR_MESSAGE);
					}
				} while (com_password==false);

			} else {
				JOptionPane.showMessageDialog(null, "There isn't User Admin", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	
	}

}//Login_arrays.java



