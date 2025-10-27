package maderera;

public class Venta {

    private String producto;
    private int cantidad;
    private double precioUnitario;

    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "Venta: " + producto + " | Cantidad: " + cantidad
                + " | Total: S/" + calcularTotal() + "\n";
    }
}
