package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entre 1 y 9: ");
        int num = sc.nextInt();
        
        if (num < 1 || num > 9) {
        	        System.out.println("El número debe estar entre 1 y 9.");        	 
        } else {
        	System.out.println("La tabla de multiplicar de "+num+" es:");
            for (int i = 1; i < 11; i++) {
                int resultado = num * i;
                System.out.println(num+" x "+i+" = "+resultado);
            }
        }
        sc.close();
	}
}

