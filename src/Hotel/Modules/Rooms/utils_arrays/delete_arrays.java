package Hotel.Modules.Rooms.utils_arrays;

import javax.swing.JOptionPane;

import Hotel.Modules.Rooms.Classes.Doubles;
import Hotel.Modules.Rooms.Classes.Single;
import Hotel.Modules.Rooms.Classes.Singleton;
import Hotel.Modules.Rooms.Classes.Suite;

public class delete_arrays {
	
	//SINGLE
	public static void delete_single () {
		Single s1=null;
		int pos = -1;
		Single fecha=null;
		
		if(Singleton.a_Single.isEmpty()){
			JOptionPane.showMessageDialog(null, "There isn't doubles room created", "ERROR", JOptionPane.ERROR_MESSAGE);
		}else{
			pos = -1;
			s1 = ask_IDS.ask_id_single();
			fecha=s1;
			pos = find.find_Single_id(s1);
			if (pos != -1) {
				Singleton.a_Single.remove(pos);
				JOptionPane.showMessageDialog(null, "A single room ' " + fecha.getId()+ " ' has been successfully deleted", "DELETE SUCCESFULLY", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
	//DOUBLE
	public static void delete_doubles () {
		Doubles d1=null;
		int pos = -1;
		Doubles fecha=null;
		
		if(Singleton.a_Doubles.isEmpty()){
			JOptionPane.showMessageDialog(null, "There isn't single room created", "ERROR", JOptionPane.ERROR_MESSAGE);
		}else{
			pos = -1;
			d1 = ask_IDS.ask_id_doubles();
			fecha=d1;
			pos = find.find_Double_id(d1);
			if (pos != -1) {
				Singleton.a_Doubles.remove(pos);
				JOptionPane.showMessageDialog(null, "A double room ' " + fecha.getId()+ " ' has been successfully deleted", "DELETE SUCCESFULLY", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	//SUITE
		public static void delete_suite () {
			Suite s1=null;
			int pos = -1;
			Suite fecha=null;
			
			if(Singleton.a_Suite.isEmpty()){
				JOptionPane.showMessageDialog(null, "There isn't suite room created", "ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				pos = -1;
				s1 = ask_IDS.ask_id_suite();
				fecha=s1;
				pos = find.find_Suite_id(s1);
				if (pos != -1) {
					Singleton.a_Suite.remove(pos);
					JOptionPane.showMessageDialog(null, "A double room ' " + fecha.getId()+ " ' has been successfully deleted", "DELETE SUCCESFULLY", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "This room doesn't exist", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
}//delete.java
