package maderera;

public class Empleado {

    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " | Cargo: " + cargo + "\n";
    }
}
