package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int j = 40;
	        for (int i = 2; j >= 0; i += 4 ) {
	        	j +=41 ;
	            System.out.print(j + " ");
	            j -= i^2;
	        }

	}

}
