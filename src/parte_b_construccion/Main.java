package parte_b_construccion;
import parte_a_reconocimiento.*;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 6: Objeto Estudiante con asignación manual
        Estudiante est1 = new Estudiante();
        est1.nombre = "Ana Gómez";
        est1.codigo = "E101";
        est1.semestre = 3;
        est1.mostrarInfo();

        // Ejercicio 7: Dos objetos Vehículo con datos independientes
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Toyota"; v1.modelo = "Corolla"; v1.velocidadActual = 0;
        Vehiculo v2 = new Vehiculo();
        v2.marca = "Ford"; v2.modelo = "Focus"; v2.velocidadActual = 50;

        v1.mostrarEstado();
        v2.mostrarEstado();

        // Ejercicio 10: Cuentas bancarias independientes
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "001"; c1.titular = "Carlos"; c1.saldo = 500;
        CuentaBancaria c2 = new CuentaBancaria();
        c2.numero = "002"; c2.titular = "Maria"; c2.saldo = 1200;

        c1.mostrarCuenta();
        c2.mostrarCuenta();
    }
}