package Hotel.Modules.Rooms.Utils;

import Hotel.Classes.Fecha;
import Hotel.Modules.Rooms.Classes.*;
import Hotel.Modules.Rooms.utils_arrays.ask_IDS;
import Hotel.Modules.Rooms.utils_arrays.find;
import Hotel.Utils.*;
import javax.swing.JOptionPane;

public class CRUD {
	public static Room created_room(int optionsRoom) {

		String id = "";
		String m2 = "";
		String capacidad = "";
		Boolean disponible = false;
		Boolean wifi = false;
		Fecha f_entra = null;
		Fecha f_fin = null;
		
		//
		Boolean desayuno = false;
		Boolean excursion = false;
		//
		Boolean ambiente_romantico = false;
		Boolean desayuno_doble = false;
		Boolean musica = false;
		//
		float precio_jacuzzi= (float) 0.0f;
		Fecha f_entrada_jacuzzi = null;
		Fecha f_salida_jacuzzi = null;
		Boolean masaje = true;
		Boolean pension_completa = true;

		Room roomType = null;
		

		disponible = Data.ask_yes_no("Is the room available?", "AVAIABLE");
		wifi = Data.ask_yes_no("There is wifi?", "WIFI");
		id = Singleton.ID;
		m2 = Data.ask_m2("Enter a M2:" +'\n'+ " (Example '30')", "M2");
		capacidad = Data.ask_capacity("Enter a capacity:" +'\n'+ " (Minim 1 and Maxim 6)", "CAPACITY");
		f_entra = Dates.pedir_fechaIni();
		f_fin = Dates.pedir_fechaFin(f_entra);
		

		switch (optionsRoom) {
		case 0: // SINGLE
			desayuno = Data.ask_yes_no("Do you want breakfast included?", "BREAKFAST");
			excursion = Data.ask_yes_no("Do you want to go on an excursion?", "EXCURSION");
			roomType = new Single(id, m2, capacidad, disponible, wifi, f_entra, f_fin,desayuno, excursion );
			break;

		case 1: // DOUBLES
			ambiente_romantico = Data.ask_yes_no("Do you want romantic theme", "Romantic Them");
			desayuno_doble = Data.ask_yes_no("Do you want double breakfast", "BREAKFAST");
			musica = Data.ask_yes_no("Do you want music?", "MUSIC");
			roomType = new Doubles(id, m2, capacidad, disponible, wifi, f_entra, f_fin,ambiente_romantico, desayuno_doble, musica);
			break;

		case 2: // SUIT
			f_entrada_jacuzzi = Dates.pedir_fechaIni_jacuzzi(f_entra, f_fin);
			f_salida_jacuzzi = Dates.pedir_fechaFin_jacuzzi(f_fin, f_entrada_jacuzzi);
			masaje = Data.ask_yes_no("Do you want massage included?", "MASSAGE");
			pension_completa = Data.ask_yes_no("Do you want Full board?", "FULL BOARD");
			roomType = new Suite(id, m2, capacidad, disponible, wifi, f_entra, f_fin,f_entrada_jacuzzi, f_salida_jacuzzi, precio_jacuzzi, masaje, pension_completa);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Thank you for using our application!", "SEE YOU",
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		}// switch

		return roomType;
	}// 


	// UPDATE
	public static Room update_room(Room roomtype) {

		String elegir_cambiar = "";
		// SINGLE
		if (roomtype instanceof Single) {
			
			do {
				String[] cambiar_room = { "Id", "M2", "Capcity", "Available", "WIFI", "Entry Date", "Finish Date",
						"Desayuno", "Excursion", "Go Back" };
				elegir_cambiar = function_menu.combo_String(cambiar_room, "Choose the option to update?", "UPDATE SINGLE");
				switch (elegir_cambiar) {
				
				case "Id":
					int pos = -1;
					Single	s1 = ask_IDS.ask_id_single();
					pos = find.find_Single_id(s1); // pos 
					if (pos != -1) {
						JOptionPane.showMessageDialog(null, "This room single already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else {
						roomtype.setId(s1.getId());
						JOptionPane.showMessageDialog(null, "Id: " + roomtype.getId());
					}
					break;
				case "M2":
					roomtype.setM2(Data.ask_m2("Enter a M2:" + '\n' + " (Example '30')", "M2"));
					JOptionPane.showMessageDialog(null, "M2: " + roomtype.getM2());
					break;
				case "Capcity":
					roomtype.setCapacitat(
							Data.ask_capacity("Enter a capacity:" + '\n' + " (Minim 1 and Maxim 6)", "CAPACITY"));
					JOptionPane.showMessageDialog(null, "Capacity: " + roomtype.getCapacitat());
					break;
				case "Available":
					roomtype.setDisponible(Data.ask_yes_no("Is the room available?", "Available"));
					JOptionPane.showMessageDialog(null, "Available: " + roomtype.getDisponible());
					break;
				case "WIFI":
					roomtype.setWifi(Data.ask_yes_no("Is there wifi in the room?", "WIFI"));
					JOptionPane.showMessageDialog(null, "WIFI: " + roomtype.getWifi());
					break;
				case "Entry Date":
					roomtype.setF_entra(Dates.pedir_fechaIni_update(((Single) roomtype).getF_fin()));
					JOptionPane.showMessageDialog(null, "Entry date: " + ((Single) roomtype).getF_entra());
					break;
				case "Finish Date":
					roomtype.setF_fin(Dates.pedir_fechaFin(((Single) roomtype).getF_entra()));
					JOptionPane.showMessageDialog(null, "Finish date update: " + roomtype.getF_fin());
					break;
				case "Desayuno":
					((Single) roomtype).setDesayuno(Data.ask_yes_no("Do you want breakfast included?", "BREAKFAST"));
					JOptionPane.showMessageDialog(null, "Breakfast: " + ((Single) roomtype).getDesayuno());
					break;
				case "Excursion":
					((Single) roomtype)
							.setExcurison(Data.ask_yes_no("Do you want to go on an excursion?", "EXCURSION"));
					JOptionPane.showMessageDialog(null, "Excursion: " + ((Single) roomtype).getExcurison());
					break;
				case "Go Back":
					elegir_cambiar = "Exit";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
				}// SWITCH_menuOptions

			} while (elegir_cambiar != "Exit");
		} // IF_SINGLE

		// DOUBLE
		if (roomtype instanceof Doubles) {
			do {
				String[] cambiar_room = { "Id", "M2", "Capcity", "Avaiable", "WIFI", "Entry Date", "Finish Date",
						"Romantic Them", "Breakfast", "Music", "Go Back" };
				elegir_cambiar = function_menu.combo_String(cambiar_room, "What do you want to update", "UPDATE DOUBLES");
				switch (elegir_cambiar) {
				
				case "Id":
					int pos = -1;
					Doubles	d1 = ask_IDS.ask_id_doubles();
					pos = find.find_Double_id(d1); // pos 
					if (pos != -1) {
						JOptionPane.showMessageDialog(null, "This room double  already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else {
						roomtype.setId(d1.getId());
						JOptionPane.showMessageDialog(null, "Id: " + roomtype.getId());
					}
					break;
				case "M2":
					roomtype.setM2(Data.ask_m2("Enter a M2:" + '\n' + " (Example '30')", "M2"));
					JOptionPane.showMessageDialog(null, "M2: " + roomtype.getM2());
					break;
				case "Capcity":
					roomtype.setCapacitat(
							Data.ask_capacity("Enter a capacity:" + '\n' + " (Minim 1 and Maxim 6)", "CAPACITY"));
					JOptionPane.showMessageDialog(null, "Capacity: " + roomtype.getCapacitat());
					break;
				case "Available":
					roomtype.setDisponible(Data.ask_yes_no("Is the room available?", "Available"));
					JOptionPane.showMessageDialog(null, "Available: " + roomtype.getDisponible());
					break;
				case "WIFI":
					roomtype.setWifi(Data.ask_yes_no("Is there wifi in the room?", "WIFI"));
					JOptionPane.showMessageDialog(null, "WIFI: " + roomtype.getWifi());
					break;
				case "Entry Date":
					roomtype.setF_entra(Dates.pedir_fechaIni_update(((Doubles) roomtype).getF_fin()));
					JOptionPane.showMessageDialog(null, "Entry date: " + roomtype.getF_entra());
					break;
				case "Finish Date":
					roomtype.setF_fin(Dates.pedir_fechaFin(((Doubles) roomtype).getF_entra()));
					JOptionPane.showMessageDialog(null, "Finish date update: " + roomtype.getF_fin());
					break;
				case "Romantic Them":
					((Doubles) roomtype)
							.setAmbiente_amoroso(function_menu.YES_NO("Do you want romantic theme", "Romantic Them"));
					JOptionPane.showMessageDialog(null,
							"Romantic Them: " + ((Doubles) roomtype).getAmbiente_romantico());
					break;
				case "Breakfast":
					((Doubles) roomtype)
							.setDesayuno_doble(Data.ask_yes_no("Do you want double breakfast", "BREAKFAST"));
					JOptionPane.showMessageDialog(null, "Breakfast: " + ((Doubles) roomtype).getDesayuno_doble());
					break;
				case "Music":
					((Doubles) roomtype).setMusica(Data.ask_yes_no("Do you want music?", "MUSIC"));
					JOptionPane.showMessageDialog(null, "Music: " + ((Doubles) roomtype).getMusica());
					break;
				case "Go Back":
					elegir_cambiar = "Exit";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
				}// SWITCH_menuOptions

			} while (elegir_cambiar != "Exit");
		} // IF DOUBLE

		// SUIT
		if (roomtype instanceof Suite) {
			do {
				String[] cambiar_room = { "Id", "M2", "Capcity", "Avaiable", "WIFI", "Entry Date", "Finish Date",
						"F. Entre yacuzzi", "F. Finish yacuzzi", "Massage", "Full board", "Go Back" };
				elegir_cambiar = function_menu.combo_String(cambiar_room, "What do you want to update", "UPDATE SUITE");
				switch (elegir_cambiar) {
				
				case "Id":
					int pos = -1;
					Suite su1 = ask_IDS.ask_id_suite();
					pos = find.find_Suite_id(su1); // pos 
					if (pos != -1) {
						JOptionPane.showMessageDialog(null, "This room suite  already exists", "ERROR", JOptionPane.ERROR_MESSAGE);
					}else {
						roomtype.setId(su1.getId());
						JOptionPane.showMessageDialog(null, "Id: " + roomtype.getId());
					}
					break;
				case "M2":
					roomtype.setM2(Data.ask_m2("Enter a M2:" + '\n' + " (Example '30')", "M2"));
					JOptionPane.showMessageDialog(null, "M2: " + roomtype.getM2());
					break;
				case "Capcity":
					roomtype.setCapacitat(
							Data.ask_capacity("Enter a capacity:" + '\n' + " (Minim 1 and Maxim 6)", "CAPACITY"));
					JOptionPane.showMessageDialog(null, "Capacity: " + roomtype.getCapacitat());
					break;
				case "Available":
					roomtype.setDisponible(Data.ask_yes_no("Is the room available?", "Available"));
					JOptionPane.showMessageDialog(null, "Available: " + roomtype.getDisponible());
					break;
				case "WIFI":
					roomtype.setWifi(Data.ask_yes_no("Is there wifi in the room?", "WIFI"));
					JOptionPane.showMessageDialog(null, "WIFI: " + roomtype.getWifi());
					break;
				case "Entry Date":
					roomtype.setF_entra(Dates.pedir_fechaIni_update(((Suite) roomtype).getF_fin()));
					JOptionPane.showMessageDialog(null, "Entry date update: " + roomtype.getF_entra());
					break;
				case "Finish Date":
					roomtype.setF_fin(Dates.pedir_fechaFin(((Suite) roomtype).getF_entra()));
					JOptionPane.showMessageDialog(null, "Finish date: " + roomtype.getF_fin());
					break;
				case "F. Entre yacuzzi":
					((Suite) roomtype).setF_entrada_jacuzzi(Dates.pedir_fechaIni_jacuzzi_update(
							((Suite) roomtype).getF_entra(), ((Suite) roomtype).getF_salida_jacuzzi()));
					JOptionPane.showMessageDialog(null,
							"Entre date yacuzzi: " + ((Suite) roomtype).getF_entrada_jacuzzi());
					break;
				case "F. Finish yacuzzi":
					((Suite) roomtype).setF_salida_jacuzzi(Dates.pedir_fechaFin_jacuzzi(((Suite) roomtype).getF_fin(),
							((Suite) roomtype).getF_entrada_jacuzzi()));

					JOptionPane.showMessageDialog(null,
							"Finish date yacuzzi: " + ((Suite) roomtype).getF_salida_jacuzzi());
					break;
				case "Massage":
					((Suite) roomtype).setMasaje(Data.ask_yes_no("Do you want massage included?", "MASSAGE"));
					JOptionPane.showMessageDialog(null, "Massage: " + ((Suite) roomtype).getMasaje());
					break;
				case "Full board":
					((Suite) roomtype).setPension_completa(Data.ask_yes_no("Do you want Full board?", "FULL BOARD"));
					JOptionPane.showMessageDialog(null, "Full board: " + ((Suite) roomtype).getPension_completa());
					break;
				case "Go Back":
					elegir_cambiar = "Exit";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Thank you for using our application", "SEE YOU",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
				}// SWITCH_menuOptions

			} while (elegir_cambiar != "Exit");
		} // IF_SUIT
		return roomtype;
	}// update_room

}// functions_CRUD_Room
