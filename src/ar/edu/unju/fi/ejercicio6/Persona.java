package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
		
	}


	public Persona(int dni, String nombre, LocalDate fechaNac, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}
	
	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this(dni, nombre, fechaNacimiento, "Jujuy");
	}


	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFechaNac() {
		return fechaNac;
	}



	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}



	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	public int calcularEdad() {
        return Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    
    @Override
    public String toString() {
        return "DNI: " + dni +
               "\nNombre: " + nombre +
               "\nFecha de Nacimiento: " + fechaNac +
               "\nProvincia: " + provincia +
               "\nEdad: " + calcularEdad() +
               "\n" + (esMayorDeEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad");
        
	
    }
    
    public String FechaNacStr() {
        return this.fechaNac.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
