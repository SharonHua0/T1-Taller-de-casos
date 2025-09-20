package Clases;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String codigo;
    private String nombre;
    private List<Estudiante> estudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        System.out.println("Curso: " + codigo + " - " + nombre);
        for (Estudiante e : estudiantes) {
            System.out.println(e.toString() + " | Mensualidad: " + e.calcularMensualidad());
        }
    }

    public double calcularMensualidadTotal() {
        double total = 0;
        for (Estudiante e : estudiantes) {
            total += e.calcularMensualidad();
        }
        return total;
    }
}
