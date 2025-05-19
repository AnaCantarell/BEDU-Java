public class Operador {

    // Atributos
    String nombre;

    // Constructor
    public Operador(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public void reportarse() {
        System.out.println("📞 Operador " + nombre + " reportándose.");
    }
}
