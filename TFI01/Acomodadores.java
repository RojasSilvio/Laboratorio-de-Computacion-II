package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores {
    private Salas sala=new Salas(5,"a");

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    public String getTipo(){
        return " ";
    }

    @Override
    public Salas getSalas() {
        return null;
    }

    @Override
    public void setSalas(Salas sala) {

    }
}
