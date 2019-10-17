package TFI01;

public class Espectadores extends Personas {
    private String fila;
    private String silla;

    public Espectadores(String nombre, int edad, String fila, String silla) {
        super(nombre, edad);
        this.fila = fila;
        this.silla = silla;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String toSting() {
        return "Espectadores{" +
                "Nombre="++
                "Edad="+getEdad()+
                "fila='" + fila + '\'' +
                ", silla='" + silla + '\'' +
                '}';
    }


    public String getButaca(){
        return"";
    }
}
