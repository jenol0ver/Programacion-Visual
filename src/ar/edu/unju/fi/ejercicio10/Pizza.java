package ar.edu.unju.fi.ejercicio10;

public class Pizza {
	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private static final double ADICIONAL_20 = 500;
    private static final double ADICIONAL_30 = 750;
    private static final double ADICIONAL_40 = 1000;
    
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	public static double getAdicional20() {
		return ADICIONAL_20;
	}
	public static double getAdicional30() {
		return ADICIONAL_30;
	}
	public static double getAdicional40() {
		return ADICIONAL_40;
	}
    
	public void calcularPrecio() {
        switch (diametro) {
            case 20:
                precio = ingredientesEspeciales ? 4500 + ADICIONAL_20 : 4500;
                break;
            case 30:
                precio = ingredientesEspeciales ? 4800 + ADICIONAL_30 : 4800;
                break;
            case 40:
                precio = ingredientesEspeciales ? 5500 + ADICIONAL_40 : 5500;
                break;
        }
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
