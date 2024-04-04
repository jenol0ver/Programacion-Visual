package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scanner = new Scanner(System.in);

	 System.out.print("Ingresa un número entero: ");
	 int num = scanner.nextInt();

		        
	 if (num % 2 == 0) {
	 int triple = num * 3;
	 
	 System.out.println("El triple del número es: "+triple);
	 					  } 
	 else {
		 int doble = num * 2;
		 System.out.println("El doble del número es: "+doble);
		        }

		        scanner.close();
		    }

}
