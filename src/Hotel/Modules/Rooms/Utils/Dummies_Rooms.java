package Hotel.Modules.Rooms.Utils;

import Hotel.Classes.Fecha;
import Hotel.Modules.Rooms.Classes.Doubles;
import Hotel.Modules.Rooms.Classes.Room;
import Hotel.Modules.Rooms.Classes.Single;
import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.Classes.Suite;
import Hotel.Modules.Users.Utils.Data_user;


public class Dummies_Rooms {
	private static final int LONGDUMMIES = 5;

	//PREGUNTAR
	public static void carregarDades_Rooms() {
		int longitud = 5;
		boolean poner_dumies = false;
		poner_dumies = Data_user.ask_yes_no("Do you want to load the 15 test rooms?", "DUMMIES ROOMS");
		if (poner_dumies)
			carregarDummies(longitud);
	}

	//LONGITUD
	public static void carregarDummies(int longitud) {
		Room SINGLE= null, DOUBLES= null, SUITE= null;

		//SINGLE 
		String[] id_S = { "2-S", "4-S", "1-S", "3-S", "5-S" };
		String[] m2_S = { "40", "90", "30", "40", "35" };
		String[] capacidad_S = { "1", "1", "1", "1", "1" };
		boolean[] disponible_S = { true, true, true, true, true };
		boolean[] wifi_S = { true, true, true, true, true };
		Fecha[] f_entra_S = { new Fecha("12/11/2020"), new Fecha("12/11/2020"), new Fecha("12/11/2020"),
				new Fecha("12/11/2020"), new Fecha ("12/11/2020") };
		Fecha[] f_fin_S = { new Fecha("20/11/2020"), new Fecha("17/11/2020"), new Fecha("20/11/2020"),
				new Fecha("20/11/2020"), new Fecha ("20/11/2020") };
		boolean[] desayuno = { true, true, true, true, true };
		boolean[] excursion = { true, true, true, true, true };
		
		

		//DOUBLES
		String[] id_D = { "1-D", "2-D", "3-D", "4-D", "5-D" };
		String[] m2_D = { "40", "90", "30", "40", "35" };
		String[] capacidad_D = { "2", "1", "3", "2", "1" };
		boolean[] disponible_D = { true, true, true, true, true };
		boolean[] wifi_D = { true, true, true, true, true };
		Fecha[] f_entra_D = { new Fecha("12/11/2020"), new Fecha("12/11/2020"), new Fecha("12/11/2020"),
				new Fecha("12/11/2020"), new Fecha ("12/11/2020") };
		Fecha[] f_fin_D = { new Fecha("20/11/2020"), new Fecha("20/11/2020"), new Fecha("20/11/2020"),
				new Fecha("20/11/2020"), new Fecha ("20/11/2020") };
		boolean[] ambiente_romantico = { true, true, true, true, true };
		boolean[] desayuno_doble = { true, true, true, true, true };
		boolean[] musica = { true, true, true, true, true };
	
		
		
		//SUITE
		String[] id_SW = { "1-Sw", "2-Sw", "3-Sw", "4-Sw", "5-Sw" };
		String[] m2_SW = { "40", "90", "30", "40", "35" };
		String[] capacidad_SW = { "2", "2", "2", "2", "2" };
		boolean[] disponible_SW = { true, true, true, true, true };
		boolean[] wifi_SW = { true, true, true, true, true };
		Fecha[] f_entra_SW = { new Fecha("12/11/2020"), new Fecha("12/11/2020"), new Fecha("12/11/2020"),
				new Fecha("12/11/2020"), new Fecha ("12/11/2020") };
		Fecha[] f_fin_SW = { new Fecha("20/11/2020"), new Fecha("20/11/2020"), new Fecha("20/11/2020"),
				new Fecha("20/11/2020"), new Fecha ("20/11/2020") };
		Fecha[] f_entrada_jacuzzi = { new Fecha("15/11/2020"), new Fecha("15/11/2020"), new Fecha("15/11/2020"),
				new Fecha("15/11/2020"), new Fecha ("15/11/2020") };
		Fecha[] f_salida_jacuzzi = { new Fecha("16/11/2020"), new Fecha("16/11/2020"), new Fecha("16/11/2020"),
				new Fecha("16/11/2020"), new Fecha ("16/11/2020") };
		boolean[] masaje = { true, true, true, true, true };
		boolean[] pension_completa = { true, true, true, true, true };
		
	
		

		for (int i = 0; i < LONGDUMMIES; i++) { 
			SINGLE = new Single(id_S[i], m2_S[i], capacidad_S[i],disponible_S[i], wifi_S[i], f_entra_S[i],f_fin_S[i], desayuno[i], excursion[i]);
			Singleton.a_Single.add((Single) SINGLE);
			
			DOUBLES = new Doubles(id_D[i], m2_D[i], capacidad_D[i],disponible_D[i], wifi_D[i], f_entra_D[i],f_fin_D[i],ambiente_romantico[i], desayuno_doble[i], musica[i]);
			Singleton.a_Doubles.add((Doubles) DOUBLES);
			
			SUITE = new Suite(id_SW[i], m2_SW[i], capacidad_SW[i], disponible_SW[i], wifi_SW[i], f_entra_SW[i], f_fin_SW[i], f_entrada_jacuzzi[i], f_salida_jacuzzi[i], i, masaje[i], pension_completa[i]);
			Singleton.a_Suite.add((Suite) SUITE);

		}
	}

}