package parte_l_consolidacion;

// Ejercicio 67: Clase relacionada con tu vida cotidiana
public class MascotaCotidiana {
    public String nombre;
    public String raza;
    public int edad;

    // Ejercicio 71: Reescribe usando constructor con parámetros
    public MascotaCotidiana(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Ejercicio 73: Constructor copia
    public MascotaCotidiana(MascotaCotidiana otra) {
        this.nombre = otra.nombre;
        this.raza = otra.raza;
        this.edad = otra.edad;
    }

    public void mostrarDetalles() {
        System.out.println("Mascota: " + nombre + " | Raza: " + raza + " | Edad: " + edad + " años");
    }
}