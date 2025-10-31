import empresa.inventario.modelo.Producto;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese código del producto:");
        String codigo = scanner.nextLine();

        System.out.println("Ingrese precio:");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese cantidad en stock:");
        int cantidad = scanner.nextInt();

        System.out.println("¿Es perecible? (true/false):");
        boolean esPerecible = scanner.nextBoolean();

        Producto producto = new Producto(nombre, codigo, precio, cantidad, esPerecible);

        System.out.println("\nDESARROLLO DE SOFTWARE\n");
        producto.mostrarEstado();

        double total = producto.calcularValorTotal();
        double totalDescuento = producto.calcularValorTotal(10);

        System.out.println("Valor total: " + total);
        System.out.println("Valor total con descuento 10: " + totalDescuento);
    }
}
