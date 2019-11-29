package TFI02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Materia implements Informacion{
    String nombre;
    Profesor titular;

    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    Set<Estudiante> coleccionDeEstudiantes=new HashSet<Estudiante>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public void agregarEstudiante(Estudiante estudiante){
        coleccionDeEstudiantes.add(estudiante);
    }
    public void eliminarEstudiante(String nombre){
        Iterator<Estudiante> iterador = coleccionDeEstudiantes.iterator();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + "Eliminado de la Facultad.");
            }
        }
    }
    public void modificarTitular(Profesor profesor){
        this.titular=profesor;
    }

    @Override
    public int verCantidad() {
        int cont=0;
        for (Estudiante estudiante : coleccionDeEstudiantes) {
            cont++;
        }
        return cont;
    }

    @Override
    public String listarContenido() {
        String cont="";
        for (Estudiante estudiante : coleccionDeEstudiantes) {
            cont=estudiante.toString();

        }
        return null;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + this.nombre + '\'' +
                ", titular=" + this.titular +
                '}';
    }
}
