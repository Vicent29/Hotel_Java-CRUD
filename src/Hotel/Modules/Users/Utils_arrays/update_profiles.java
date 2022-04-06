package Hotel.Modules.Users.Utils_arrays;

import javax.swing.JOptionPane;


import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Classes.User;
import Hotel.Modules.Users.Utils.CRUD_users;


public class update_profiles {

	//UPDATE_GENERAL
	public static void up_profile_users (User loged_user) {
		
	int	pos= find_users.find_general_username(loged_user.getUsername());
		
		if (pos!=-1) {
			loged_user= (User)CRUD_users.update_user(loged_user);
			Singleton_user.a_Users.set(pos, loged_user);
		}else {
			JOptionPane.showMessageDialog(null, "You must create a user  first!", "There isn't USER",
					JOptionPane.ERROR_MESSAGE);
		}
	
	}

	

	
	
	
	
}// UPDATE.java


