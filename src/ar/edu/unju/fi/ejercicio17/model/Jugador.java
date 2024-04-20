package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Jugador(String nombre, String apellido, LocalDate fechaNac, String nacionalidad, double estatura,
			double peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int calcularEdad() {
        return Period.between(this.fechaNac, LocalDate.now()).getYears();
    }
	
}
