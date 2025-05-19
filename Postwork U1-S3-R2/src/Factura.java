import java.util.Optional;

public class Factura {

    // Atributos privados para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Manejo seguro del valor nulo

    // Constructor: Convierte el RFC en OptionaL, que puede ser null
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); // Si el rfc es nulo creará un Optional vacío
    }

    // Método público que devuelve un resumen de la factura
    public String getResumen(){
        String resumen = "📃 Factura generada:\n";
        resumen += "Descripción: "+ descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Si el rfc está presente, se muestra. Si no, se muestra mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen; // Se evitan salidas desde clases que no sean main
    }
}