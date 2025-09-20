package Clases;

public abstract class Estudiante implements Evaluable{
	protected String id;
    protected String nombre;
    protected int edad;
    protected double mensualidadBase;
    
    public  Estudiante(String id, String nombre, int edad, double mensualidadBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.mensualidadBase = mensualidadBase;
    }
    
 // Método polimórfico: cada subclase lo implementará a su manera
    public abstract double calcularMensualidad();

    // Declarado abstracto para forzar a las subclases a dar su forma de evaluar
    @Override
    public abstract void evaluar();

    @Override
    public String toString() {
        return id + " - " + nombre + " (edad: " + edad + ")";
    }
}
