package TFI01_RECUP;

public class Pasajeros extends Personas implements ParaMostrar {
    private String nombre;
    private int dni;

    public Pasajeros(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setDni(int dni) {
        super.setDni(dni);
    }

    @Override
    public int getDni() {
        return super.getDni();
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
