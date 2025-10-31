package empresa.recursos.modelo;

public class Empleado {

    // Atributos privados
    private String nombreCompleto;
    private String cedula;
    private double salarioMensual;
    private int añosAntiguedad;
    private boolean esGerente;

    // Constructor
    public Empleado(String nombreCompleto, String cedula, double salarioMensual, int añosAntiguedad, boolean esGerente) {
        this.nombreCompleto = nombreCompleto;
        setCedula(cedula);
        setSalarioMensual(salarioMensual);
        setAñosAntiguedad(añosAntiguedad);
        this.esGerente = esGerente;
    }

    // Getters y setters
    public String getNombreCompleto() { return nombreCompleto; }

    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCedula() { return cedula; }

    public void setCedula(String cedula) {
        if (cedula != null && cedula.length() == 10) {
            this.cedula = cedula;
        } else {
            System.out.println("Error: La cédula debe tener 10 dígitos.");
        }
    }

    public double getSalarioMensual() { return salarioMensual; }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual >= 500) {
            this.salarioMensual = salarioMensual;
        } else {
            System.out.println("Error: El salario no puede ser menor a 500.");
        }
    }

    public int getAñosAntiguedad() { return añosAntiguedad; }

    public void setAñosAntiguedad(int añosAntiguedad) {
        if (añosAntiguedad >= 0) {
            this.añosAntiguedad = añosAntiguedad;
        } else {
            System.out.println("Error: Los años de antigüedad no pueden ser negativos.");
        }
    }

    public boolean isEsGerente() { return esGerente; }

    public void setEsGerente(boolean esGerente) { this.esGerente = esGerente; }

    // Método para validar bonificación
    public boolean puedeRecibirBonificacion() {
        return salarioMensual < 3000 || añosAntiguedad >= 5;
    }

    // Método para imprimir resultado
    public void generarResultado() {
        if (puedeRecibirBonificacion()) {
            System.out.println("Resultado: Bonificación aprobada.");
            System.out.println("Bonificación mensual: " + calcularBonificacion());
            System.out.println("Bonificación con extra 50: " + calcularBonificacion(50));
        } else {
            System.out.println("Resultado: Bonificación rechazada.");
            if (salarioMensual >= 3000) System.out.println("Motivo: Salario demasiado alto.");
            if (añosAntiguedad < 5) System.out.println("Motivo: Antigüedad insuficiente.");
        }
    }

    // Método estático
    public static void mostrarReglasBonificacion() {
        System.out.println("=== Reglas de Bonificación ===");
        System.out.println("✔ Salario menor a 3000 o antigüedad >= 5 años");
        System.out.println("✔ Bonificación base: 10% del salario");
    }

    // Sobrecarga de métodos para bonificación
    public double calcularBonificacion() {
        return salarioMensual * 0.10;
    }

    public double calcularBonificacion(double extra) {
        return (salarioMensual * 0.10) + extra;
    }

    @Override
    public String toString() {
        return "Datos del empleado:\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cédula: " + cedula + "\n" +
                "Salario mensual: " + salarioMensual + "\n" +
                "Años de antigüedad: " + añosAntiguedad + "\n" +
                "Es gerente: " + esGerente;
    }
}
