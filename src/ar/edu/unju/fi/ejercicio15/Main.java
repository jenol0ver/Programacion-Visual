package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner scanner = new Scanner(System.in);
		int num;
        do {
            System.out.println("Ingrese un numero en el rango [5,10]: ");
            num = scanner.nextInt();
        } while (num < 5 || num > 10);

        String[] nombres = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un nombre de persona: ");
            nombres[i] = scanner.next();
        }

        System.out.println("\nLos nombres ingresados son: ");
        for (int i = 0; i < num; i++) {
            System.out.println("Indice " + i + ": " + nombres[i]);
        }

        System.out.println("\nLos nombres ingresados son (de la ultima a la primera posicion): ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.println("Indice " + i + ": " + nombres[i]);
        }
        scanner.close();
	}

}
