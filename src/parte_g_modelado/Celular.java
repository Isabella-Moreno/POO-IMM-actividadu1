package parte_g_modelado;

public class Celular {
    public String marca;
    public int bateria;
    public boolean prendido;

    public void encender() { this.prendido = true; }
    public void apagar() { this.prendido = false; }
    public void cargarBateria() { this.bateria = 100; }
}