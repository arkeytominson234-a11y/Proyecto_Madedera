package maderera;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private String tipoMadera;

    public Producto(String nombre, double precio, int stock, String tipoMadera) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipoMadera = tipoMadera;
    }

    @Override
    public String toString() {
        return "Producto:\n"
                + "Nombre: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Stock: " + stock + "\n"
                + "Tipo de Madera: " + tipoMadera + "\n"
                + "-----------------------------\n";
    }
    public static String productosRegistrados = "";
}
