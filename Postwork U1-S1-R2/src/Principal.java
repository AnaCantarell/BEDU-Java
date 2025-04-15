public class Principal {
    public static void main(String[] args){

        Entrada e1 = new Entrada("Obra de Teatro",450);
        Entrada e2 = new Entrada("Cine",80);

        /* Clase normal */
        e1.mostrarInfo();
        e2.mostrarInfo();

        System.out.println("\n"+"Pruebas de impresión usando clases:"+"\n");
        e1.nombre = "Concierto";
        System.out.println(e1.nombre);
        e1.mostrarInfo();
        System.out.println(e1);

        /*
        System.out.println("\n"+"Pruebas de impresión usando clases:"+"\n");
        // e1.nombre = "Concierto"; // No se puede cambiar
        System.out.println(e1.nombre()); // Usa método get() automático
        // e1.mostrarInfo(); Considerando que no existe
        System.out.println("Evento: " + e1.nombre() + " | Precio: $" + e1.precio());
        System.out.println(e1);
        */

        /*
        System.out.println("\n"+"Pruebas de impresión usando clases:"+"\n");
        // e1.nombre = "Concierto"; // No se puede cambiar
        System.out.println(e1.nombre()); // Usa método get() automático
        e1.mostrarInfo();
        System.out.println(e1);
        */
    }
}