package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero en el rango [3,10]: ");
            num = scanner.nextInt();
        } while (num < 3 || num > 10);
        int[] nums = new int[num];
        
        int suma = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un numero: ");
            nums[i] = scanner.nextInt();
            suma += nums[i];
        }

        System.out.println("\nLos valores del arreglo son:");
        for (int i = 0; i < num; i++) {
            System.out.println("Posición " + i + ": " + nums[i]);
        }

        System.out.println("\nLa suma de todos los valores es: " + suma);
        
        scanner.close();
	}

}
