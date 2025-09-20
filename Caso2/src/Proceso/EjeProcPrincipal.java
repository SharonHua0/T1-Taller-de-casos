package Proceso;

import Clases.Curso;
import Clases.Estudiante;
import Clases.EstudianteBecado;
import Clases.EstudianteRegular;

public class EjeProcPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso = new Curso("5076", "Tecnica de programacion");

        Estudiante e1 = new EstudianteRegular("N00443714", "Manuel", 20, 500);
        Estudiante e2 = new EstudianteBecado("N00443715", "Luis", 21, 500, 50);
        
        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);

        curso.mostrarEstudiantes();

        System.out.println("Total mensualidad del curso: " + curso.calcularMensualidadTotal());

        // Evaluación (usando la interfaz Evaluable)
        e1.evaluar();
        e2.evaluar();

	}

}
