import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        p1.nombre = sc.nextLine(); // Con nextLine() se limpia el buffer en automático

        System.out.print("Edad: ");
        p1.edad = sc.nextInt(); // Para nextLine(), limpiar buffer con un input.nextLine()
        //input.nextLine();

        System.out.print("Número de expediente: ");
        p1.expediente = sc.next();
        //p1.expediente = sc.nextLine();
        //input.close()

        // Para cerrar los posibles procesos de entrada usamos input.close();
        p1.mostrarInfo();
    }
}