package parte_c_metodos;

public class PruebaMetodos {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 1200.0;
        p1.stock = 5;

        System.out.println("--- Estado Inicial ---");
        p1.mostrarEstado();

        p1.aplicarDescuento(10); // Descuento del 10%
        p1.abastecer(3);        // Incrementa stock en 3

        System.out.println("--- Estado Modificado ---");
        p1.mostrarEstado();
    }
}