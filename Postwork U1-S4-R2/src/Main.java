public class Main {
    public static void main(String[] args) {

        // Creamos declaración de impuestos
        DeclaracionImpuestos d = new DeclaracionImpuestos("JDGVGE56",6543);

        // Creamos cuenta fiscal
        CuentaFiscal cFiscal = new CuentaFiscal("JDGVGE56",7654);

        // Mostramos la información
        System.out.println("Declaración enviada por RFC" +
                d.rfcContribuyente() + " por $" + d.montoDeclarado());
        cFiscal.muestraInfo();

        // Validamos si el RFC de la declaración es válido
        boolean rfcValido = cFiscal.validarRFC(d);
        System.out.println("¿RFC válido para esta cuenta?" + rfcValido);
    }
}
