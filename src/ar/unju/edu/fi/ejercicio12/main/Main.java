package ar.unju.edu.fi.ejercicio12.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ar.unju.edu.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (dd/mm/yy):");
        String fecha = scanner.nextLine();
		
		DateFormat formateador = new SimpleDateFormat("dd/MM/yy");		
		Date Fecha = formateador.parse(fecha);
		
		Calendar fechaNac = Calendar.getInstance();
		
		fechaNac.setTime(Fecha);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNac);
		
		System.out.println(persona.toString());
		
		scanner.close();
		
		
	}


}
