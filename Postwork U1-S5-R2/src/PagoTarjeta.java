public class PagoTarjeta extends MetodoPago{

    // Atributos
    public double saldoDisponible;

    // Constructor
    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    // Método implementado
    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto;
    }

    // Método heredado
    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
