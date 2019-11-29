package TFI02;

public class Estudiante extends Persona {
    String nombre;
    String apellido;
    int legajo;
    public Estudiante(String nombre,String apellido,int legajo) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(legajo);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
