package parte_l_consolidacion;

public class PruebaConsolidacion {
    public static void main(String[] args) {
        // Ejercicio 69: Crear 5 objetos diferentes
        MascotaCotidiana m1 = new MascotaCotidiana("Max", "Labrador", 3);
        MascotaCotidiana m2 = new MascotaCotidiana("Luna", "Beagle", 2);
        MascotaCotidiana m3 = new MascotaCotidiana("Toby", "Poodle", 5);
        MascotaCotidiana m4 = new MascotaCotidiana("Rocky", "Bulldog", 1);
        MascotaCotidiana m5 = new MascotaCotidiana(m1); // Usando constructor copia

        m1.mostrarDetalles();
        m5.mostrarDetalles();
    }
}