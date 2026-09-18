package parte_e_constructores;

public class PruebaConstructores {
    public static void main(String[] args) {
        // Instanciación mediante constructor vacío
        Mascota m1 = new Mascota();

        // Instanciación mediante constructor completo
        Mascota m2 = new Mascota("Firulais", "Perro", 4);

        // Instanciación mediante constructor parcial
        Mascota m3 = new Mascota("Michi", "Gato");

        m1.mostrarFicha();
        m2.mostrarFicha();
        m3.mostrarFicha();
    }
}