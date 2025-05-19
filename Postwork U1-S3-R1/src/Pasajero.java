public class Pasajero {

    // Declaración de atributos que puede tener un pasajero
    String nombre; // Visibilidad por defecto "public"
    public String pasaporte; // Visibiidad especificada

    // Clase para obtener un pasajero
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
}
