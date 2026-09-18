package parte_g_modelado;

public class Lampara {
    public String marca;
    public boolean encendida;

    public void encender() { this.encendida = true; }
    public void apagar() { this.encendida = false; }
    public void mostrarEstado() {
        System.out.println("Lámpara " + marca + " | Encendida: " + encendida);
    }
}
