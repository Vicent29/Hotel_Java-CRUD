package Hotel;






import Hotel.Classes.Fecha;
import Hotel.Modules.Rooms.Utils.*;



public class test {

	public static void main(String[] args) {
		
		
		Fecha fechaInicio_est=Dates.pedir_fechaIni();
		Fecha fechaFin_est=Dates.pedir_fechaFin(fechaInicio_est);
//		Fecha fechaInicio_jacuzzi=Dates.pedir_fechaIni_jacuzzi(fechaInicio_est, fechaFin_est);
//		Fecha fechaFin_jacuzzi=Dates.pedir_fechaFin_jacuzzi(fechaFin_est, fechaInicio_jacuzzi);
		Fecha fechaInicio_est_update=Dates.pedir_fechaIni_update(fechaFin_est);
		Fecha fechaFin_est_update=Dates.pedir_fechaFin(fechaInicio_est);
		System.out.println("Fecha INICIO: "+fechaInicio_est);
		System.out.println("Fecha FINAL: "+fechaFin_est);
		System.out.println("Fecha INICIO_UPDATE: "+fechaInicio_est_update);
		System.out.println("Fecha FIN_UPDATE: "+fechaFin_est_update);
		
		
			
///////////////////////////////////////////////////////////////////////////////////////////////////
//		
//		Boolean ffin_jacuzzi=false;
//		Boolean ffin_est=false;
//		
//		
//		
////		do {
//			
//				
//					
//				
//				String f_estancia= validators.valida_String("Pide fecha fin estancia", "FIN ESTANCIA");
//				Fecha ffin_estancia = new Fecha(f_estancia);
//				System.out.println("Fecha inicial: "+ffin_estancia.getFecha());
//				Boolean res_ini= ffin_estancia.validaFecha();
//				System.out.println("VALID fecha estancia: "+res_ini);
//		
//				
//			
//				String f_jacuzzi= validators.valida_String("Pide fecha fin jacuzzi", "FIN jacuzzi");
//				Fecha ffin_jacuzzi = new Fecha(f_jacuzzi);			
//				System.out.println("Fecha final: "+ffin_jacuzzi.getFecha());
//				Boolean res_fin= ffin_jacuzzi.validaFecha();
//				System.out.println("VALID fecha_ini: "+res_fin);
//				
//				
//				System.out.println("COMPARAR: "+ ffin_jacuzzi.CompararDates(ffin_estancia));
//				 System.out.println("RESTAR: " +fecha_inicial.restar2Fechas(ffin_jacuzzi));
			
			
			
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	
		
		
		
//		String f_entra="";
//		String f_fin ="";
//		Boolean result=false;
//		
//		f_entra = Data.ask_date("Give me Entry Date" +'\n'+ "Example 'dd/mm/yyyy'", "DATE ENTER");
//		f_fin = Data.ask_date("Give me Finish Date" +'\n'+ "Example 'dd/mm/yyyy'", "DATE FINIH");
//		
//		Fecha fechaInicial = new Fecha(f_entra);
//		Fecha fechaFinal = new Fecha(f_fin);
//		
//		 
//		do {
//			if ( (fechaInicial.CompararDates(fechaFinal)==2) || (fechaInicial.CompararDates(fechaFinal)==3) ) {
//				result=false;
//				System.out.println("La fecha de entrada es mayor o igual a la de salida 'ERROR'");
//			}
//			else {
//			
//				if (fechaInicial.CompararDates(fechaFinal)==1) {
//			
//				System.out.println("La fechas estan CORRECTAS");
//				result=true;
//				
//				int resta = ( fechaFinal.restar2Fechas(fechaInicial));
//				System.out.println(resta+ "ooooooo");
//				if (resta >= 2) {
//					System.out.println("INSTANCIA CORRECTA= " +resta);
//					result=true;
//				}
//				else {
//					System.out.println("INSTANCIA INCORRECTA= " +resta);
//					result= false;
//				}
//				System.out.println("Los dias de la insatncia es de: "+resta);		
//			}	
//			}
//		} while (result==false);
		

	}// main

}// test.java

//10/12/2021

