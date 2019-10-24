package TFI01_RECUP;

public class Origen extends Lugares implements ParaMostrar{
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public String toString() {
        return "Origen{}";
    }
}
