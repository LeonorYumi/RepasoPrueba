import ec.gob.beca.modelo.SolicitanteBeca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SolicitanteBeca.mostrarReglasBeca();

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese su promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Ingrese sus ingresos familiares: ");
        double ingresos = sc.nextDouble();

        System.out.print("¿Tiene recomendación? (true/false): ");
        boolean recomendacion = sc.nextBoolean();

        SolicitanteBeca estudiante = new SolicitanteBeca(nombre, cedula, promedio, ingresos, recomendacion);

        System.out.println(estudiante.toString());
        estudiante.generarResultado();

        System.out.println("Horas de estudio recomendadas: " + estudiante.calcularHorasEstudio());
        System.out.println("Horas de estudio con extra 5: " + estudiante.calcularHorasEstudio(5));
    }
}
