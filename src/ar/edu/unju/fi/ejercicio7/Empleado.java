package ar.edu.unju.fi.ejercicio7;

public class Empleado {
	private String nombre;
    private int legajo;
    private double salario;

    private static final double SALARIO_MINIMO = 210000.00;
    private static final double AUMENTO_POR_MERITOS = 20000.00;
    
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = (salario >= SALARIO_MINIMO) ? salario : SALARIO_MINIMO;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public static double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}
	public static double getAumentoPorMeritos() {
		return AUMENTO_POR_MERITOS;
	}
	
	
	
	@Override
	public String toString() {
		return "Nombre: " + nombre +
	           "\nLegajo: " + legajo +
	           "\nSalario: $" + salario;
	}

	public void aumento() {
        salario += AUMENTO_POR_MERITOS;
    }
    
    }


