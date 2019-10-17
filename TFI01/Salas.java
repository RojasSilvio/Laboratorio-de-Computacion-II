package TFI01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Salas {
    Scanner sc=new Scanner(System.in);
    private int capacidad;
    private String pelicula;
    private String nombre;

    Espectadores espectadores[]=new Espectadores[this.capacidad];

    public Salas(int capacidad,String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.espectadores = espectadores;
        String nombre,silla,fila;
        int edad,r=0;
        do {
            r=0;
            try {
                for (int i = 0; i <this.capacidad; i++) {
                    System.out.println("Espectador "+(i+1));
                    System.out.println("Ingrese Nombre: ");
                    nombre=sc.next();
                    System.out.println("Ingrese Edad: ");
                    edad=sc.nextInt();
                    System.out.println("Ingrese Fila: ");
                    fila=sc.next();
                    System.out.println("Ingrese silla: ");
                    silla=sc.next();
                    espectadores[i]=new Espectadores(nombre,edad,fila,silla);
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROr en el INGRESO de DATOS");
                sc= new Scanner(System.in);
                r=1;

            }
        }while(r==1);
    }

    public void getEspectadores() {
        String l=" ";
        /*for (Espectadores e:espectadores){
            l=l+e;
           //l=(l+espectadores[i])+"\n";

        }
        return l;
        */
        for (Espectadores e:espectadores){
            System.out.println(e.toSting());
        }
    }

    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", espectadores=" + Arrays.toString(espectadores) +
                '}';
    }
}
