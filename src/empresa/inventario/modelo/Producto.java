package empresa.inventario.modelo;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int cantidadStock;
    private boolean esPerecible;

    // Constructor que recibe todos los atributos
    public Producto(String nombre, String codigo, double precio, int cantidadStock, boolean esPerecible) {
        this.nombre = nombre;
        setCodigo(codigo);
        setPrecio(precio);
        setCantidadStock(cantidadStock);
        this.esPerecible = esPerecible;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public double getPrecio() { return precio; }
    public int getCantidadStock() { return cantidadStock; }
    public boolean getEsPerecible() { return esPerecible; }

    // Setters con validaciones
    public void setCodigo(String codigo) {
        if(codigo != null && codigo.length() >= 5) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido. Debe tener al menos 5 caracteres.");
        }
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio no puede ser negativo.");
        }
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock >= 0) {
            this.cantidadStock = cantidadStock;
        } else {
            System.out.println("Cantidad en stock no puede ser negativa.");
        }
    }

    // Métodos
    public boolean stockDisponible() {
        return cantidadStock > 0;
    }

    public void mostrarEstado() {
        System.out.println(this);
        System.out.println("Stock disponible: " + stockDisponible());
    }

    public static void mostrarReglasProducto() {
        System.out.println("Reglas para productos:");
        System.out.println("- Código mínimo 5 caracteres");
        System.out.println("- Precio y stock no pueden ser negativos");
    }

    // valor total
    public double calcularValorTotal() {
        return precio * cantidadStock;
    }

    // Sobrecarga con descuento
    public double calcularValorTotal(double descuento) {
        double total = calcularValorTotal();
        return total - descuento;
    }

    @Override
    public String toString() {
        return "Datos del producto:\n"
                + "Nombre: " + nombre + "\n"
                + "Código: " + codigo + "\n"
                + "Precio: " + precio + "\n"
                + "Cantidad en stock: " + cantidadStock + "\n"
                + "Es perecible: " + esPerecible;
    }
}
