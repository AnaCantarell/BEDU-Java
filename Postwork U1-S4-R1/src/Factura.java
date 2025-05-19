public class Factura {

    // Atributos
    private String folio;
    private String cliente;
    private double total;

    // Constructor con parámetros
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString
    public String toString() {
        return "-------------------FACTURA------------------------" +
             "\nFolio: " + folio +
             "\nCliente: " + cliente +
             "\nTotal: $" + total;
    }

    // Método equals(), ayuda a comparar el folio de dos facturas
    public boolean equals(Object obj) {
        if (this == obj) return true; // Compara espacio de memoria de los objetos

        // Revisa si el objeto está vacío y que sean el mismo tipo de objetos
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj; // El objeto "otra" es la copia de "obj"
        return this.folio.equals(otra.folio); // Comparamos solo el folio de objetos
    }

    // Regresa el hasCode() consistente con equals(), basado en el folio
    public int hashCode() {
        return folio.hashCode();
    }
}
