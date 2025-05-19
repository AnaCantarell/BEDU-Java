public class PagoTransferencia extends MetodoPago{

    // Atributos
    private boolean validadoExternamente;

    // Constructor
    public PagoTransferencia(double monto, boolean validaExternamente) {
        super(monto);
        this.validadoExternamente = validaExternamente;
    }

    // Método implementado
    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    // Método heredado
    @Override
    public void procesarPago() {
        System.out.println("🏚 Procesando transferencia por $" + monto);
    }
}
