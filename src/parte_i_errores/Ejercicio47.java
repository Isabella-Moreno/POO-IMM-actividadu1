package parte_i_errores;
import parte_a_reconocimiento.Estudiante;

public class Ejercicio47 {
    public static void main(String[] args) {
        /*
        // 1. CÓDIGO ERRADO (Punto 1 del requerimiento):
        // Estudiante est;
        // est.mostrarInfo();

        // 2. EXPLICACIÓN DEL ERROR DEL COMPILADOR (Punto 2):
        // El compilador arroja el error: "variable est might not have been initialized".
        // Ocurre porque se declaró la variable de referencia, pero no se instanció el objeto con 'new'.
        */

        // 3. CÓDIGO CORREGIDO (Punto 3):
        Estudiante est = new Estudiante(); // Se reserva memoria con 'new'
        est.nombre = "Laura";
        est.codigo = "E202";
        est.semestre = 1;
        est.mostrarInfo();
    }
}