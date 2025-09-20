package Clases;

public class EstudianteRegular extends Estudiante{
	
	public EstudianteRegular(String id, String nombre, int edad, double mensualidadBase) {
        super(id, nombre, edad, mensualidadBase);
    }

    @Override
    public double calcularMensualidad() {
        return mensualidadBase;
    }

    @Override
    public void evaluar() {
        System.out.println(nombre + " (Regular) fue evaluado con criterios estándar.");
    }

}
