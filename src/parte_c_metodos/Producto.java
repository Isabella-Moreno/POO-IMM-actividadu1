package parte_c_metodos;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.precio -= (this.precio * (porcentaje / 100));
        }
    }

    public void abastecer(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    public void mostrarEstado() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}