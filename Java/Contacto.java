package Java;

public class Contacto {
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;

    public Contacto(String nombre, String apellido,int dni,int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni=dni;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", Dni=" +dni + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
