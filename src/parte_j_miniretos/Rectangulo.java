package parte_j_miniretos;

public class Rectangulo {
    public double base;
    public double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarResultados() {
        System.out.println("Base: " + base + " | Altura: " + altura);
        System.out.println("Área: " + calcularArea() + " | Perímetro: " + calcularPerimetro());
    }
}