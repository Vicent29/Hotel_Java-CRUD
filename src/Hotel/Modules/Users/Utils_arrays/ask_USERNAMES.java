package Hotel.Modules.Users.Utils_arrays;


import Hotel.Modules.Users.Classes.Admin;
import Hotel.Modules.Users.Classes.Client;
import Hotel.Modules.Users.Classes.Premium;
import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Utils.Data_user;

public class ask_USERNAMES {
	
	
	//ADMIN
	public static Admin ask_username_Admin() {
		Singleton_user.USERNAME= Data_user.ask_username("Enter a USERNAME the Admin" +'\n'+ "Example: Vicent29", "USERNAME_ADMIN");
		return new Admin(Singleton_user.USERNAME);
	}
	
	//PREMIUM
	public static Premium ask_username_Premium() {
		Singleton_user.USERNAME= Data_user.ask_username("Enter a USERNAME the Premium" +'\n'+ "Example:  Vicent29", "USERNAME_PREMIUM");
		return new Premium(Singleton_user.USERNAME);
	}
	
	//CLIENT
	public static Client ask_username_Client() {
		Singleton_user.USERNAME= Data_user.ask_username("Enter a USERNAME the Client" +'\n'+ "Example:  Vicent29", "USERNAME_CLIENT");
		return new Client(Singleton_user.USERNAME);
	}

}
