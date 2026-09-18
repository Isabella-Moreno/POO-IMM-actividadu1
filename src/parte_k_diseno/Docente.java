package parte_k_diseno;

/*
 * DISEÑO PREVIO:
 * ATRIBUTOS: nombre (String), asignatura (String), experienciaAnios (int)
 * MÉTODOS: dictarClase(), evaluarExamen()
 * OBJETOS REALES: "Prof. John Arrieta", "Profa. María López"
 */
public class Docente {
    public String nombre;
    public String asignatura;
    public int experienciaAnios;

    public Docente(String nombre, String asignatura, int experienciaAnios) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.experienciaAnios = experienciaAnios;
    }

    public void dictarClase() {
        System.out.println(nombre + " está impartiendo la clase de " + asignatura);
    }
}