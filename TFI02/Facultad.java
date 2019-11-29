package TFI02;//10 por el basico dividido 100. por el año

import java.util.*;

public class Facultad implements Informacion {

    private String nombre;

    public Facultad() {
    }

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    Set<Carrera> coleccionDeCarreras=new HashSet<Carrera>();

    public void agregarCarrera(Carrera carrera){
        coleccionDeCarreras.add(carrera);
    }
    public void eliminarCarrera(String nombre){
        Iterator<Carrera> iterador = coleccionDeCarreras.iterator();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + "Eliminado de la carrera.");
            }
        }
    }
    public void eliminarEstudiante(Estudiante estudiante){
        Iterator<Carrera> iterador1 = coleccionDeCarreras.iterator();
        Iterator<Materia> iterador2 ;
        while(iterador1.hasNext()) {
            String buscado = iterador1.next().getNombre();
            if(buscado.equals(nombre)) {
                while(iterador1.hasNext()){
                    Materia materia = new Materia();
                    if(buscado.equals(materia.getNombre())){
                        iterador1.remove();
                    }
                }
                iterador1.remove();
                System.out.println(nombre + "Eliminado.");
            }
        }
    }

    @Override
    public int verCantidad() {
        int cont=0;
        for (Carrera carrera : coleccionDeCarreras) {
            cont++;
            }
        return cont;
        }

    @Override
    public String listarContenido() {
        String cont="";
        for (Carrera carrera : coleccionDeCarreras) {
                cont=carrera.toString();

            }
        return cont;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
