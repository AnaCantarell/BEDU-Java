/* Clase normal */
public class Entrada {

    String nombre;
    double precio;

    public Entrada (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Evento: " + nombre + " | Precio: $" + precio);
    }
}

/* Record o clase inmutable
public record Entrada(String nombre, double precio) {}
*/

/* Record con un método
public record Entrada(String nombre, double precio) {
    public void mostrarInfo() {
        System.out.println("Evento: " + this.nombre + " | Precio: $" + this.precio);
    }
}
*/