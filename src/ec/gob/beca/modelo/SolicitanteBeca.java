package ec.gob.beca.modelo;

public class SolicitanteBeca {
    // Atributos privados
    private String nombreCompleto;
    private String cedula;
    private double promedio;
    private double ingresosFamiliares;
    private boolean tieneRecomendacion;

    // Constructor
    public SolicitanteBeca(String nombreCompleto, String cedula, double promedio, double ingresosFamiliares, boolean tieneRecomendacion) {
        this.nombreCompleto = nombreCompleto;
        setCedula(cedula);
        setPromedio(promedio);
        setIngresosFamiliares(ingresosFamiliares);
        this.tieneRecomendacion = tieneRecomendacion;
    }

    // Getters y Setters con validaciones
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula != null && cedula.length() == 10) {
            this.cedula = cedula;
        } else {
            System.out.println("Error: La cédula debe tener 10 dígitos.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio debe estar entre 0.0 y 10.0");
        }
    }

    public double getIngresosFamiliares() {
        return ingresosFamiliares;
    }

    public void setIngresosFamiliares(double ingresosFamiliares) {
        if (ingresosFamiliares >= 0) {
            this.ingresosFamiliares = ingresosFamiliares;
        } else {
            System.out.println("Error: Los ingresos familiares no pueden ser negativos.");
        }
    }

    public boolean isTieneRecomendacion() {
        return tieneRecomendacion;
    }

    public void setTieneRecomendacion(boolean tieneRecomendacion) {
        this.tieneRecomendacion = tieneRecomendacion;
    }

    // Método para verificar si la beca es aprobada
    public boolean becaAprobada() {
        return promedio >= 9.0 && ingresosFamiliares <= 1000 && tieneRecomendacion;
    }

    // Método para imprimir el resultado
    public void generarResultado() {
        if (becaAprobada()) {
            System.out.println("Resultado: Beca aprobada.");
        } else {
            System.out.println("Resultado: Beca rechazada.");
            if (promedio < 9.0) System.out.println("Motivo: Promedio insuficiente.");
            if (ingresosFamiliares > 1000) System.out.println("Motivo: Ingresos familiares altos.");
            if (!tieneRecomendacion) System.out.println("Motivo: No tiene carta de recomendación.");
        }
    }

    // Método estático
    public static void mostrarReglasBeca() {
        System.out.println("=== REGLAS DE BECA ===");
        System.out.println("Promedio mínimo: 9.0");
        System.out.println("Ingresos familiares máximos: 1000");
        System.out.println("Recomendación obligatoria");
    }

    // Sobrecarga de métodos para calcular horas de estudio
    public int calcularHorasEstudio() {
        return 20;
    }

    public int calcularHorasEstudio(int extra) {
        return 20 + extra;
    }

    // toString
    @Override
    public String toString() {
        return "Datos del solicitante:\n" +
                "Nombre: " + nombreCompleto + "\n" +
                "Cédula: " + cedula + "\n" +
                "Promedio: " + promedio + "\n" +
                "Ingresos familiares: " + ingresosFamiliares + "\n" +
                "Tiene recomendación: " + tieneRecomendacion;
    }
}
