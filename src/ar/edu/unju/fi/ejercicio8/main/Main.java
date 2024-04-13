package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int n = sc.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		calculadora.setN(n);
		
		System.out.println("Calculo de la sumatoria: " + calculadora.calcularSumatoria());
		System.out.println("Calcul de la productoria: " + calculadora.calcularProductoria());
		
		sc.close();

	}

}
