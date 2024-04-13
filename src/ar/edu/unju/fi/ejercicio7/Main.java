package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();
        
        Empleado empleado = new Empleado(nombre, legajo, salario);
        
        System.out.println(empleado.toString());
        empleado.aumento();
        System.out.println("\nSalario actualizado\n");
        System.out.println(empleado.toString());

        scanner.close();
	}

}
