package Biblioteca_Virtual;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaVirtual {
    // Lista para almacenar los libros
    private ArrayList<Libro> libros;

    // Constructor
    public BibliotecaVirtual() {
        libros = new ArrayList<>();
    }

    // Método para registrar un libro (título, autor, año)
    public void registrarLibro(String titulo, Autor autor, int año) {
        Libro nuevoLibro = new Libro(titulo, autor, año);
        libros.add(nuevoLibro);
        System.out.println("Libro registrado exitosamente: " + titulo);
    }

    // Método para mostrar la información de todos los libros registrados
    public void mostrarInformacionLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInformacion();
                System.out.println("----------");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear biblioteca
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();

        // Ingreso de información del autor
        System.out.print("Ingrese el nombre del autor: ");
        String nombreAutor = scanner.nextLine();
        
        System.out.print("Ingrese la nacionalidad del autor: ");
        String nacionalidadAutor = scanner.nextLine();
        
        Autor autor = new Autor(nombreAutor, nacionalidadAutor);

        // Ingreso de información del libro
        System.out.print("Ingrese el título del libro: ");
        String tituloLibro = scanner.nextLine();
        
        System.out.print("Ingrese el año de publicación: ");
        int añoLibro = scanner.nextInt();
        
        // Registrar el libro
        biblioteca.registrarLibro(tituloLibro, autor, añoLibro);

        // Mostrar la información de los libros registrados
        System.out.println("\nInformación de los libros registrados:");
        biblioteca.mostrarInformacionLibros();
        
        scanner.close(); // Cerrar el scanner
    }
}
