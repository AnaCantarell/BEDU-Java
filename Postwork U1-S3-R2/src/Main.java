public class Main {
    public static void main(String[] args) {

        // Factura con RFC
        Factura conRFC = new Factura(1500,"Servicio de consultoría","AJFD1234BHG");
        // Factura sin RFC
        Factura sinRFC = new Factura(100,"Reparación de equipo",null);

        // Mostrar facturas
        System.out.println(conRFC.getResumen()+"\n\n"+sinRFC.getResumen());
    }
}