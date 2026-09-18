package parte_e_constructores;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    // Ejercicio 23: Constructor por defecto / vacío
    public Mascota() {
        this.nombre = "Sin nombre";
        this.especie = "Desconocida";
        this.edad = 0;
    }

    // Ejercicio 24: Constructor sobrecargado con parámetros
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Ejercicio 25: Constructor parcial
    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = 1; // Valor predeterminado
    }

    public void mostrarFicha() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " año(s)");
    }
}