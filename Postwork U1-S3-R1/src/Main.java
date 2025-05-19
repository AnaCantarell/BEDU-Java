import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Ana Cantarell", "P1237654");

        // Crear vuelo
        Vuelo vuelo = new Vuelo("UX234","París","14:35");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado){
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else{
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Realizamos una nueva reservación
        vuelo.reservarAsiento("Ana Cantarell","P1237655");
        System.out.println(vuelo.obtenerItinerario());
    }
}
