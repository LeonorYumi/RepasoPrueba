import empresa.recursos.modelo.Empleado;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado.mostrarReglasBonificacion();

        System.out.print("Ingrese nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese años de antigüedad: ");
        int años = sc.nextInt();

        System.out.print("¿Es gerente? (true/false): ");
        boolean gerente = sc.nextBoolean();

        Empleado empleado = new Empleado(nombre, cedula, salario, años, gerente);

        System.out.println(empleado.toString());
        empleado.generarResultado();
    }
}

