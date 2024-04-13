package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private int desc;
	private double precioconDescuento;
	
	public Producto() {
		
	}

	public Producto(String nombre, String codigo, double precio, int desc, double precioconDescuento) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.desc = desc;
		this.precioconDescuento = precioconDescuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDesc() {
		return desc;
	}

	public void setDesc(int desc) {
		this.desc = desc;
	}
	
	
	public double getPrecioconDescuento() {
		return precioconDescuento;
	}

	public void setPrecioconDescuento(double precioconDescuento) {
		this.precioconDescuento = precioconDescuento;
	}

	public double calcularDescuento() {
		
		/*if (desc < 0) {
		
		precioconDescuento= precio - (double)(precio * desc / 100);	
		return precioconDescuento;
		
		}
		else {
			return precio;
		}
		*/
		return precio - (precio * desc / 100);
	}

	@Override
	public String toString() {
		return "\nProducto: " + nombre + "\nCodigo: " + codigo + 
				"\nPrecio: " + precio + "\nDescuento: " + desc + "\nPrecio con Descuento: " + 
				calcularDescuento();
	}
	
	

}
