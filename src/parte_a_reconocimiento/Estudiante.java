package parte_a_reconocimiento;

public class Estudiante {
    public String nombre;
    public String codigo;
    public int semestre;

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre);
    }

    public void cambiarSemestre(int nuevoSemestre) {
        this.semestre = nuevoSemestre;
    }
}