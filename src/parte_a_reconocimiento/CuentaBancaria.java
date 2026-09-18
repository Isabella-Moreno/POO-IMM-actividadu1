package parte_a_reconocimiento;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    public void mostrarCuenta() {
        System.out.println("Cuenta N°: " + numero + " | Titular: " + titular + " | Saldo: $" + saldo);
    }

    public void consignar(double valor) {
        if (valor > 0) this.saldo += valor;
    }

    public void retirar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para retirar.");
        }
    }
}