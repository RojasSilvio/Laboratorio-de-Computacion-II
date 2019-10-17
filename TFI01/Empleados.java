package TFI01;

public class Empleados extends Personas  {
    private int sueldo;

    public Empleados(String nombre,int edad) {
        super(nombre,edad);
    }


    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String toSting() {
        return null;
    }
}
