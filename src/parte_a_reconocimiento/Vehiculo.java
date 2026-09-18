package parte_a_reconocimiento;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidadActual;

    public void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Velocidad: " + velocidadActual + " km/h");
    }

    public void acelerar() {
        this.velocidadActual += 10;
    }

    public void frenar() {
        if (this.velocidadActual - 10 >= 0) {
            this.velocidadActual -= 10;
        } else {
            this.velocidadActual = 0;
        }
    }
}