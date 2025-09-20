package Biblioteca_Virtual;

public class Libro {
    private String titulo;
    private Autor autor;
    private int año;
    private String isbn;

    // Constructor sin ISBN
    public Libro(String titulo, Autor autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.isbn = null;  // Si no tiene ISBN, se asigna null
    }

    // Constructor con ISBN
    public Libro(String titulo, Autor autor, int año, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.isbn = isbn;
    }

    // Métodos getter y setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        String info = "Título: " + titulo + "\n" + autor.toString() + "\nAño: " + año;
        if (isbn != null) {
            info += "\nISBN: " + isbn;
        } else {
            info += "\nISBN: No disponible";
        }
        System.out.println(info);
    }
}