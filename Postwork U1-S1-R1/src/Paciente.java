public class Paciente {

    String nombre;
    int edad;
    String expediente;

    public void mostrarInfo(){
        // Uso de emojis con Win + .
        System.out.println("\n" +
                "📁 DATOS DEL PACIENTE" + "\n\n" +
                "✏ Paciente: " + nombre + "\n" +
                "✨ Edad: " + edad + "\n" +
                "🔑 Expediente: " + expediente);
    }
}