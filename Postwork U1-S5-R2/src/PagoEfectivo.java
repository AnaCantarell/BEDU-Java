public class PagoEfectivo extends MetodoPago{

    // Constructor
    public PagoEfectivo(double monto) {
        super(monto);
    }

    // Método implementado
    @Override
    public boolean autenticar() {
        return true; // No se requiere validación para efectivo
    }

    // Método heredado
    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
