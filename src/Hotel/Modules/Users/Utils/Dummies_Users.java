package Hotel.Modules.Users.Utils;

import Hotel.Classes.Fecha;
import Hotel.Modules.Users.Classes.Admin;
import Hotel.Modules.Users.Classes.Client;
import Hotel.Modules.Users.Classes.Premium;
import Hotel.Modules.Users.Classes.Singleton_user;
import Hotel.Modules.Users.Classes.User;

public class Dummies_Users {
	private static final int LONGDUMMIES = 5;

	//PREGUNTAR
	public static void carregarDades_User() {
		int longitud = 5;
		boolean poner_dumies = false;
		poner_dumies = Data_user.ask_yes_no("Do you want to load the 15 test users?", "DUMMIES USERS");
		if (poner_dumies)
			carregarDummies(longitud);
	}

	//LONGITUD
	public static void carregarDummies(int longitud) {
		User ADMIN= null, PREMIUM= null, CLIENT= null;

		//ATRIBUTOS ADMIN 
		String[] username_A = { "Vicent29", "Carla", "Yolanda21", "Carlos", "Enric10" };
		String[] password_A = { "Vicent.29", "Carla.23", "Yolanda.23", "Carlos.123", "Enric.10" };
		String[] gmail_A = { "vicent@gmail.com", "carla@gmail.com", "yolanda@gmail.com", "carlos@gmail.com", "enric@gmail.com" };
		Fecha[] f_alta_sistema = { new Fecha("12/11/2020"), new Fecha("12/11/2020"), new Fecha("12/11/2020"),
				new Fecha("12/11/2020"), new Fecha ("12/11/2020") };

		//PREMIUM
		String[] username_P = { "Carlos29", "Susan12", "Rafa15", "Ramon", "Jose" };
		String[] password_P = { "Carlos.29", "Vicent.29", "Vicent.29", "Vicent.29", "Vicent.29" };
		String[] gmail_P = { "carlos@gmail.com", "susan@gmail.com", "rafa@gmail.com", "ramon@gmail.com", "jose@gmail.com" };
		Fecha[] f_alta_web_P = { new Fecha("12/11/2020"), new Fecha("12/11/2020"), new Fecha("12/11/2020"),
				new Fecha("12/11/2020"), new Fecha("12/11/2020") };
		String[] nacionalidad_P = { "Spain", "India", "Francia", "Spain", "Spain" };
		Fecha[] f_nacimiento_P = { new Fecha("12/11/1976"), new Fecha("12/11/1980"), new Fecha("12/11/2002"),
				new Fecha("12/11/2001"), new Fecha("12/11/2003") };
		String[] Genero_P = { "Male", "Feminine", "Male", "Male", "Male" };
		int[] Num_reservas = { 2, 3, 1, 2, 2 };
		
		//CLIENT
		String[] username_C = { "Blai29", "Maria12", "Cristian15", "Raul", "Toni" };
		String[] password_C = { "Vicent.29", "Maria.29", "Vicent.29", "Vicent.29", "Vicent.29" };
		String[] gmail_C = { "blai@gmail.com", "maria@gmail.com", "cristian@gmail.com", "raul@gmail.com", "toni@gmail.com" };
		Fecha[] f_alta_web_C = { new Fecha("12/11/2020"), new Fecha("12/11/2020"), new Fecha("12/11/2020"),
				new Fecha("12/11/2020"), new Fecha("12/11/2020") };
		String[] nacionalidad_C = { "Spain", "India", "Francia", "Spain", "Spain" };
		Fecha[] f_nacimiento_C = { new Fecha("12/11/1976"), new Fecha("12/11/1980"), new Fecha("12/11/2002"),
				new Fecha("12/11/2001"), new Fecha("12/11/2003") };
		String[] Genero_C = { "Male", "Feminine", "Male", "Male", "Male" };

		for (int i = 0; i < LONGDUMMIES; i++) { 
			ADMIN = new Admin(username_A[i], password_A[i], gmail_A[i],f_alta_sistema[i]);
			Singleton_user.a_Users.add((Admin) ADMIN);
			
			PREMIUM = new Premium(username_P[i], password_P[i], gmail_P[i],f_alta_web_P[i], nacionalidad_P[i], f_nacimiento_P[i], Genero_P[i], Num_reservas[i]);
			Singleton_user.a_Users.add((Premium) PREMIUM);
			
			CLIENT = new Client(username_C[i], password_C[i], gmail_C[i],f_alta_web_C[i], nacionalidad_C[i], f_nacimiento_C[i], Genero_C[i]);
			Singleton_user.a_Users.add((Client) CLIENT);

		}
	}

}
