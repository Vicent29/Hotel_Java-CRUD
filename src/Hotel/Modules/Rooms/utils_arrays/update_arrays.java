package Hotel.Modules.Rooms.utils_arrays;

import javax.swing.JOptionPane;

import Hotel.Modules.Rooms.Classes.Doubles;
import Hotel.Modules.Rooms.Classes.Single;
import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.Classes.Suite;
import Hotel.Modules.Rooms.Utils.CRUD;

public class update_arrays {

	// SINGLE
	public static void update_single () {
		Single s1=null;
		int pos = -1;
		
		if(Singleton.a_Single.isEmpty()){
			JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
			pos = -1;
			s1 = ask_IDS.ask_id_single();
			pos = find.find_Single_id(s1); // pos 
			if (pos != -1) {
				s1 = Singleton.a_Single.get(pos);
				s1=(Single) CRUD.update_room(s1);
				Singleton.a_Single.set(pos, s1);
			}else {
				JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	// DOUBLES
	public static void update_doubles () {
		Doubles d1= null;
		int pos = -1;
		
		if(Singleton.a_Doubles.isEmpty()){
			JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
			pos = -1;
			d1 = ask_IDS.ask_id_doubles();
			pos = find.find_Double_id(d1); // pos 
			if (pos != -1) {
				d1 = Singleton.a_Doubles.get(pos);
				d1=(Doubles) CRUD.update_room(d1);
				Singleton.a_Doubles.set(pos, d1);
			}else {
				JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	// SUITE
	public static void update_suite () {
		Suite su1=null;
		int pos = -1;
		
		if(Singleton.a_Suite.isEmpty()){
			JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
			pos = -1;
			su1 = ask_IDS.ask_id_suite();
			pos = find.find_Suite_id(su1); // pos 
			if (pos != -1) {
				su1 = Singleton.a_Suite.get(pos);
				su1=(Suite) CRUD.update_room(su1);
				Singleton.a_Suite.set(pos, su1);
			}else {
				JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	

	
	
	
	
}// UPDATE.java


