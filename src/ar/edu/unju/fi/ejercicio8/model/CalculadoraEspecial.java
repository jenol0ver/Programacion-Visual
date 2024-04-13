package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}
	
	public long calcularSumatoria() {
		long suma= 0;
		for (int i= 1; i < n; i++) {
			suma += Math.pow((i*(i+1))/2, 2);
		}
		return suma;
	}
	
	public long calcularProductoria() {
		long prod = 1;
		for (int i=1; i <= n; i++) {
			prod *= i*(i+4);			
		}
		return prod;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	

}
