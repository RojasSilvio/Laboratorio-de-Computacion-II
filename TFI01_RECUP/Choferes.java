package TFI01_RECUP;

public class Choferes extends Personas implements ParaMostrar {
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
        return "Choferes="+getNombre()+ '\''
                ;
    }
}
