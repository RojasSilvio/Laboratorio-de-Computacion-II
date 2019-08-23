package com.company;
/*Ejercicio 02:
Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math.
Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola.
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int m[][]=new int[3][3];

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                m[i][j]=(int)(Math.random()*10);
            }
        }
        for (int[] x:m) {
            for (int elemento:x) {
                System.out.print(elemento+" ");

            }
            System.out.println();
        }
    }
}
