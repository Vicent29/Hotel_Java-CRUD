package Hotel.Utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Format {
	
	// Redondear_dos_decimals
	public static String dosDecimalesRedondea(double num){
		DecimalFormat format2 = new DecimalFormat("00.00");
		float f = (float)num;
		return(format2.format(f));//02,32
	}
	
	
	//%
	public static String FormatPorcentaje(double desc){
		String percentage = desc + " %";
		return percentage;
	}
	
	//m2 //PENDIENTEEEE
		public static String FormatM2(String m2){
			String decirm2 = m2 + " m2";
			return decirm2;
		}
	
	
	// Dollar
	public static String FormatDollar(double precio){
		NumberFormat coin = NumberFormat.getCurrencyInstance(Locale.US);
		return coin.format(precio);
	}
	
	// Euro
	public static String FormatEuro(double precio){
		NumberFormat coin = NumberFormat.getCurrencyInstance( Locale.FRANCE );
		return coin.format(precio);
	}
	
	//Libra_
	public static String FormatLibra(double precio){
		NumberFormat coin=NumberFormat.getCurrencyInstance( Locale.UK );
		return coin.format(precio);
	}

}//Format.java
