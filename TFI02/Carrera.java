package TFI02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Carrera implements Informacion{
    private String nombre;

    public Carrera() {
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    Set<Materia> coleccionDeMaterias=new HashSet<Materia>();

    public void agregarMateria(Materia materia){
        coleccionDeMaterias.add(materia);
    }
    public void eliminarMateria(String nombreMateria){
        Iterator<Materia> iterador = coleccionDeMaterias.iterator();

        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println(nombre + "Eliminado de la Materia.");
            }
        }
    }
    public void encontrarMateria(String nombre){
        Scanner sc=new Scanner(System.in);
        int i=0;
        do {
                i=0;
        try {
            for (Materia materia : coleccionDeMaterias) {
                if(materia.getNombre().equals(nombre)) {
                    System.out.println(materia.toString() + " fue encontrado.");
                    System.out.println(" Desea eliminar¿");
                    System.out.println("1. SI");
                    System.out.println("2. No.");
                    System.out.print("Opcion: ");
                    int op=sc.nextInt();
                    if (op==1){
                        eliminarMateria(materia.getNombre());
                    }else return;

                }

            }
        }catch (Exception e){
            System.out.println("datos mal Ingresados.");
            sc= new Scanner(System.in);
            i=1;
        }
        }while(i==1);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int verCantidad() {
        int cont=0;
        for (Materia materia : coleccionDeMaterias) {
            cont++;
        }
        return cont;
    }

    @Override
    public String listarContenido() {
        String cont="";
        for (Materia materia : coleccionDeMaterias) {
            cont=materia.toString();

        }
        return cont;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + this.nombre + '\'' +
                '}';
    }

}
