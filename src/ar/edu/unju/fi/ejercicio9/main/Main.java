package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
        	int desc;
        	
            System.out.println("\nIngrese los datos para el producto " + (i + 1) + ":");
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.println("Código: ");
            String codigo = scanner.nextLine();

            System.out.println("Precio: ");
            double precio = scanner.nextDouble();
            do {
            System.out.println("Descuento (entre 0 y 50): ");
             desc = scanner.nextInt();
            if (desc < 0 || desc > 50) {
            	System.out.println("El descuento debe estar en el rango 0-50");
            	}
            } while (desc < 0 || desc > 50);
            
            scanner.nextLine();
            
            Producto producto = new Producto();
            
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            producto.setDesc(desc);
            
            System.out.println(producto.toString());
            
        }               
       
        scanner.close();

	}


}
