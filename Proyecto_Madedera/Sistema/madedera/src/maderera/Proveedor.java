package maderera;

public class Proveedor {

    private String nombre;
    private String productoSuministra;

    public Proveedor(String nombre, String productoSuministra) {
        this.nombre = nombre;
        this.productoSuministra = productoSuministra;
    }

    @Override
    public String toString() {
        return "Proveedor: " + nombre + " | Producto: " + productoSuministra + "\n";
    }
}
