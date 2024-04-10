package ar.edu.unju.fi.ejercicio6;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		Scanner scanner = new Scanner(System.in);
        
        int num = 1;
        
        while (num < 4) {
        System.out.println("\nPersona: " + (num) + "\n");
        System.out.println("Ingrese el DNI:");
        Integer dni = scanner.nextInt();
        
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.next();
        
        System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy):");
        String fechaNacStr = scanner.next();
        LocalDate fechaNac = LocalDate.parse(fechaNacStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Ingrese la provincia:");
        String provincia = scanner.next();
        
        persona.setDni(dni);
        persona.setNombre(nombre);
        persona.setProvincia(provincia);
        persona.setFechaNac(fechaNac);
        
        
        System.out.println("Datos de " + nombre + "\n" + persona.toString()); 
        num++;
        
        }


        scanner.close();
        
	}

}
