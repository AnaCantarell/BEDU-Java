public abstract class MetodoPago implements Autenticable{

    // Atributos
    protected double monto; // Ayuda a que sea accesible desde clases padre e hijas

    // Constructor
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Métodos abstractos
    public abstract void procesarPago();

    // Métodos
    public void mostrarResumen() {
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
        // Muestra
    }
}
