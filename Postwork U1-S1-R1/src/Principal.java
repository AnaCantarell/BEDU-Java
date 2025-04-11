import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        p1.nombre = sc.nextLine(); 

        System.out.print("Edad: ");
        p1.edad = sc.nextInt(); 

        System.out.print("Número de expediente: ");
        p1.expediente = sc.next();

        p1.mostrarInfo();
    }
}
