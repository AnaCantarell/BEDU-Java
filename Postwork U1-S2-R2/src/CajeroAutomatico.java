import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        // Abrimos proceso de entrada
        Scanner sc = new Scanner(System.in);

        // Declaramos variables
        var saldo = 1000;
        boolean menu = true;

        // Repetir al menos una vez hasta que no se cumpla la condición final
        do{
            // Mostaramos las opciones del menú
            var lim = "-------------------------------------------------";
            System.out.println(lim+"\n"+"\tBienvenido al cajero automático\n"+lim);
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir\n"+lim);
            System.out.print("-> ");

            // Solicitamos opción del usuario
            int op = sc.nextInt();
            sc.nextLine();

            // Realizamos operación según la elección de usuario
            switch(op){
                case 1:
                    System.out.println("\nTienes $"+saldo+" disponible en tu cuenta.");
                    break;
                case 2:
                    System.out.print("\nCantidad a depositar: $");
                    var deposito = sc.nextDouble();
                    System.out.println("Saldo anterior: $"+saldo);
                    saldo += deposito;
                    System.out.println("Saldo actual: $"+saldo);
                    break;
                case 3:
                    System.out.print("\nCantidad a retirar: $");
                    var retiro = sc.nextDouble();

                    // Validar que cuente con recurso suficiente
                    if (retiro<saldo){
                        System.out.println("Saldo anterior: $"+saldo);
                        saldo -= retiro;
                        System.out.println("Saldo actual: $"+saldo);
                    }else{
                        System.out.println("No cuentas con saldo suficiente para realizar esta operación\n");
                    }
                    break;
                case 4:
                    System.out.println("\nGracias por usar el sistema de cajero automático.\n" +
                            "\nSaliendo...\n");
                    menu = false; // Solo si se presiona 4, saldrá del ciclo
                    break;
                default: {
                    System.out.println("Opción no valida...");
                }
            }


        }while(menu);

        // Nota: De no querer usa menu, podemos usar op!=4 en el while
        System.out.println("\nOperaciones finalizadas");

        // Cerramos proceso de entrada
        sc.close();
    }
}
