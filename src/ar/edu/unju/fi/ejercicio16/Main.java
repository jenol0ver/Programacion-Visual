package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre de la persona: ");
            nombres[i] = scanner.nextLine();
        }

        int i = 0;
        System.out.println("\nLos nombres ingresados son: ");
        while (i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }

        System.out.println("\nEl tamaño del arreglo es: " + nombres.length);

        byte indice;
        do {
        	System.out.println("\nIngrese el indice de un elemento a eliminar (0-4): ");
            indice = scanner.nextByte();
        } while (indice < 0 || indice > 4);

        nombres[indice] = " ";

        System.out.println("\nArreglo después de eliminar el elemento:");
        i = 0;
        while (i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }
        scanner.close();

	}

}
