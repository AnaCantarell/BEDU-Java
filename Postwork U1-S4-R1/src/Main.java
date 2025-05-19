public class Main {
    public static void main(String[] args) {

        // Creación de objetos
        Factura f1 = new Factura("FAC001","Ana",1200);
        Factura f2 = new Factura("FAC001","Ana",1200);
        Factura f3 = new Factura("FAC004","Ana",1200);

        // Mostramos facturas
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        // Comparamos

        System.out.println("\n\n¿F1 y F2 son iguales (equals)? " + f1.equals(f2));
        // Mismos datos, diferente objeto
        System.out.println("¿F1 y F2 son iguales (==)? " + (f1==f2));
        // Mismos datos, diferente objeto

        System.out.println("¿F1 y F3 son iguales (equals)? " + f1.equals(f3));
        System.out.println("¿F2 y F3 son iguales (equals)? " + f2.equals(f3));
    }
}
