import java.util.Objects;

public class CuentaFiscal {

    // Atributos
    private final String rfc; // Solo modificable en constructor
    private double saldoDisponible;

    // Constructor
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if(saldoDisponible > 0){
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo.");
            this.saldoDisponible = 0;
        }
    }

    // Getters
    public String getRfc() {
        return rfc;
    }
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Validación de RFC
    public boolean validarRFC(DeclaracionImpuestos declaracion){
        return Objects.equals(this.rfc,declaracion.rfcContribuyente());
    }

    // Mustra información
    public void muestraInfo(){
        System.out.println("Cuenta fiscal registrada con RFC: : " + rfc +
                ", saldo disponible: $" + saldoDisponible);
    }
}
