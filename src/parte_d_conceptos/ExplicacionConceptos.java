package parte_d_conceptos;

public class ExplicacionConceptos {
    public static void main(String[] args) {
        // Ejercicio 19: Comentario explicativo
        /*
         * EXPLICACIÓN EJERCICIO 19:
         * 'Estudiante' es una CLASE porque es la plantilla o molde conceptual que define
         * qué atributos (nombre, codigo) y métodos tendrá cualquier estudiante.
         * 'est1' es un OBJETO porque es la instancia real creada en memoria RAM con
         * datos concretos (ej. "Ana", código "101").
         */

        // Ejercicio 20 y 21: Tres objetos de la misma clase
        Persona p1 = new Persona("Carlos", "Pérez", 20);
        Persona p2 = new Persona("Carlos", "Gómez", 25); // Comparte el nombre "Carlos" con p1
        Persona p3 = new Persona("Mariana", "Ríos", 22);

        System.out.println("p1 y p2 comparten el atributo nombre ('Carlos'), pero son objetos independientes.");
    }
}

class Persona {
    String nombre;
    String apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
