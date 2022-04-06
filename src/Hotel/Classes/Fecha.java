package Hotel.Classes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Fecha {

	// ATTRIBUTES
	private String fecha;
	private int day;
	private int month;
	private int year;

	// GETERS
	public String getFecha() {
		return fecha;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// SETTERS
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

	// CONSTRUCTOR

	public Fecha(String fecha) {

		String[] SplitArray = fecha.split("/");

		this.day = Integer.parseInt(SplitArray[0]);
		this.month = Integer.parseInt(SplitArray[1]);
		this.year = Integer.parseInt(SplitArray[2]);

		this.fecha = fecha;
	}

	// De String to Calendar
	public Calendar StringToCalendar(String fecha) {

		Date fechaDate = new Date();
		Calendar fechaCalendar = new GregorianCalendar();
		try {
			fechaDate = formatoFecha.parse(fecha);

			fechaCalendar.setTime(fechaDate);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fechaCalendar;
	}

	// COMPARAR FECHAS
	public int CompararDates(Fecha fecha_final) {

		Calendar fechaInicial = this.StringToCalendar(this.getFecha());
		Calendar fechaFinal = fecha_final.StringToCalendar(fecha_final.getFecha());


		if (fechaInicial.before(fechaFinal)) // antes
			return 1;
		else if (fechaInicial.after(fechaFinal)) // despues
			return 2;
		else
			return 3;
	}

	// RESTAR FECHAS:
	public int restar2Fechas(Fecha fecha_final) {

		int dayInicial;
		int dayFinal;
		Calendar fechaInicial = this.StringToCalendar(this.getFecha());
		Calendar fechaFinal = fecha_final.StringToCalendar(fecha_final.getFecha());

		dayInicial = fechaInicial.get(Calendar.DAY_OF_MONTH);
		dayFinal = fechaFinal.get(Calendar.DAY_OF_MONTH);

		return (dayFinal - dayInicial);

	}

	// metodo VALIDAR DATA
	public boolean validaFecha() {

		boolean valido = false;

		if ((this.year > 1930) && (year < 2090)) {
			if ((this.month >= 1) && (month <= 12)) {
				switch (month) {
				case 1: // Enero
					if ((this.day > 0) && (day <= 31))
						valido = true;
					break;
				case 2: // Febrero

					if ((((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0)))
							&& (day > 0) && (day <= 29))
						valido = true; // Año Bisiesto
					else if ((day > 0) && (day <= 28))
						valido = true;
					break;
				case 3: // Marzo
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 4: // Abril
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 5: // Mayo
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 6: // Junio
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 7: // Julio
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 8: // Agosto
					if ((day > 0) && (day <= 31))
						valido = true;
					break;
				case 9: // Septiembre
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 10: // Octubre
					if ((day > 0) && (day <= 31))
//						System.out.println(day+"holaaaaa");
						valido = true;
					break;
				case 11: // Noviembre
					if ((day > 0) && (day <= 30))
						valido = true;
					break;
				case 12: // Diciembre

					if ((day > 0) && (day <= 31))
						valido = true;
					break;

				default:
					valido = false;
				}
			} else
				valido = false;
		} else
			valido = false;
		return valido;
	}

	// TO STRING
	@Override
	public String toString() {
		return fecha = this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
		

	}// TO_STRING

}// fecha.java
