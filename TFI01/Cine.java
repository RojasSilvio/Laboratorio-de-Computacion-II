package TFI01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        Espectadores espectadores[]=new Espectadores[3];
        Salas salas=new Salas(3,"Sala 01");
        salas.setPelicula("JOker");
        salas.setEspectadores(espectadores);
        salas.getEspectadores();
        salas.toString();
    }
}
