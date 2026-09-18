package parte_f_formas_construccion;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;

    // Ejercicio 23: Constructor vacío
    public Libro() {}

    // Ejercicio 24: Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Ejercicio 33: Constructor copia
    public Libro(Libro otro) {
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.paginas = otro.paginas;
    }

    // Ejercicio 31: Método fábrica estático
    public static Libro crearLibroBasico(String titulo, String autor) {
        return new Libro(titulo, autor, 100);
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }
}