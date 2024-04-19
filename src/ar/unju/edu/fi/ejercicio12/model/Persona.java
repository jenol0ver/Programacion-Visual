package ar.unju.edu.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int calcularEdad() {
		int edad=0;
		Calendar hoy = new GregorianCalendar();
		edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
		return edad;
	}
	
	public String signoZodiaco () {
		String signo = "";
		
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
	    int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	        signo = "Acuario";	        
	    } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
	        signo = "Piscis";
	    } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	        signo = "Aries";
	    } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	        signo = "Tauro";
	    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	        signo = "Geminis";
	    } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	        signo = "Cancer";
	    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	        signo = "Leo";
	    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	        signo = "Virgo";
	    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	        signo = "Libra";
	    } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	        signo = "Escorpio";
	    } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	        signo = "Sagitario";
	    } else {
	        signo = "Capricornio";
	    }
		
		return signo;
	}
	
	public String estacion() {
		int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
	    String estacion = "";

	    if (mes == 12 || mes == 1 || mes == 2) {
	        estacion = "Verano";
	    } else if (mes >= 3 && mes <= 5) {
	        estacion = "Otoño";
	    } else if (mes >= 6 && mes <= 8) {
	        estacion = "Invierno";
	    } else if (mes >= 9 && mes <= 11) {
	        estacion = "Primavera";
	    }
		return estacion;
	} 

	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nEdad: " + calcularEdad() + "\nSigno Zodiacal: " + signoZodiaco()
				+ "\nEstacion: " + estacion();
	}
	
	

}
