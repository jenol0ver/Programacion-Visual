package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el DNI:");
        Integer dni = scanner.nextInt();
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy):");
        String fechaNacStr = scanner.next();
        LocalDate fechaNac = LocalDate.parse(fechaNacStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Ingrese la provincia:");
        String provincia = scanner.next();
        
        persona1.setDni(dni);
        persona1.setNombre(nombre);
        persona1.setProvincia(provincia);
        persona1.setFechaNac(fechaNac);
        
        System.out.println("\n" + persona1.toString()); 
        
        //Persona 2
        
        System.out.println("Ingrese el DNI:");
        dni = scanner.nextInt();
        System.out.println("Ingrese el nombre:");
        nombre = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy):");
        fechaNacStr = scanner.next();
        fechaNac = LocalDate.parse(fechaNacStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Ingrese la provincia:");
        provincia = scanner.next();
        
        Persona persona2 = new Persona(dni, nombre, fechaNac, provincia);
        
        System.out.println(persona2.toString());
        
        //Persona 3 :3
        
        System.out.println("Ingrese el DNI:");
        dni = scanner.nextInt();
        System.out.println("Ingrese el nombre:");
        nombre = scanner.next();
        System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy):");
        fechaNacStr = scanner.next();
        fechaNac = LocalDate.parse(fechaNacStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        Persona persona3 = new Persona(dni, nombre, fechaNac);

        System.out.println(persona3.toString());
        
        scanner.close();
        
	}

}

