package TFI01;

abstract public class Personas {
    private String nombre;
    private int edad;

    public Personas(String nombre, int edad) {
    }

    public String getNombre() {
        return null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    abstract public String getTipo();
    abstract public String toSting();

}
