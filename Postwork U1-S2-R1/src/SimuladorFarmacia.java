import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        String medicamento;
        double precio;
        int cantidad;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del medicamento: "); medicamento = sc.nextLine();
        System.out.print("Precio del medicamento: "); precio = sc.nextDouble();
        System.out.print("Cantidad: "); cantidad = sc.nextInt();

        var total = precio * cantidad;
        double Final = (total > 500) ? total - (total * 0.15) : total;

        System.out.println("\n"+"Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento?: " + (total > 500));
        System.out.println("Descuento " + ((total > 500) ? (total * 0.15) : 0));
        System.out.println("Total a pagar: $" + Final);
    }
}