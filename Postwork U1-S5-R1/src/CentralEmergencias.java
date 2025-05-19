public class CentralEmergencias {
    public static void main(String[] args) {

        // Creación de objetos
        Ambulancia a = new Ambulancia("Ambulancia","Juan");
        Patrulla p = new Patrulla("Patrulla","Laura");
        UnidadBomberos b = new UnidadBomberos("Unidad de Bomberos","Marco");

        // Activamos
        a.iniciarOperacion();System.out.println();
        p.iniciarOperacion();System.out.println();
        b.iniciarOperacion();System.out.println();
    }
}
