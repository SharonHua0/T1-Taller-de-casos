package Clases;

public class EstudianteBecado extends Estudiante{
	
	 private double porcentajeBeca; // valor entre 0 y 100

	    public EstudianteBecado(String id, String nombre, int edad, double mensualidadBase, double porcentajeBeca) {
	        super(id, nombre, edad, mensualidadBase);
	        this.porcentajeBeca = porcentajeBeca;
	    }

	    @Override
	    public double calcularMensualidad() {
	        return mensualidadBase * (1 - porcentajeBeca / 100.0);
	    }

	    @Override
	    public void evaluar() {
	        System.out.println(nombre + " (Becado con " + porcentajeBeca + "%) fue evaluado con criterios especiales.");
	    }

}
