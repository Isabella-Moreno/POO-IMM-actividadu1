package parte_h_argumentativos;

public class Empleado {
    public String nombre;
    public double salario;

    /*
     * ARGUMENTO EJERCICIO 41:
     * Es mejor modelar 'Empleado' con una clase que con variables sueltas porque en la
     * programación procedural los datos (nombre, salario) quedan desvinculados de sus
     * operaciones. Con POO encapsulamos los datos y el comportamiento en una sola entidad
     * coherente, facilitando el mantenimiento y evitando errores al manejar múltiples empleados.
     */
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}
