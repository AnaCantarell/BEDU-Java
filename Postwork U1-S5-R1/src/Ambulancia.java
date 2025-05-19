public class Ambulancia extends UnidadEmergencia{
// La Ambulancia pertenece a la Unidad de Emergencia (Herencia)

    // Atributos tipo objeto
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    // Constructor
    public Ambulancia(String nombre, String nombreOperador) {

        // Constructor de clase padre
        super(nombre);

        // Creación de objetos
        this.sirena = new Sirena();
        this.gps = new SistemaGPS(); // Ambulancia tiene un sistema GPS (Composición)
        this.operador = new Operador(nombreOperador);
    }

    // Métodos
    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    // Método abstracto de la clase padre
    @Override
    public void responder() {
        System.out.println("🚑 Ambulancia en camino al hospital más cercano.");
    }
}
