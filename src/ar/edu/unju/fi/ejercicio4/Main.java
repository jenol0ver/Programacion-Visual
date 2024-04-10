package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre el 0 y el 10: ");
        int num = sc.nextInt();
        
        long factorial = 1;
        int inicio = 1;
        
        while (inicio <= num) {
        	
        	factorial *= inicio;
            inicio++;
        	
        	
        }
        
        System.out.println("El factorial de "+num+" es "+factorial);
        
        

	}

}
