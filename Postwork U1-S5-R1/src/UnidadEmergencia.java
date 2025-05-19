public abstract class UnidadEmergencia {

    // Atributos
    String nombre;

    // Constructor
    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public void activarUnidad() {
        System.out.println("🚨 Activando unidad " + nombre);
    }
    // Métodos abstractos
    public abstract void responder();
    // Un método abstracto cambia en cada objeto que lo usa, es un tipo de estructura
}
