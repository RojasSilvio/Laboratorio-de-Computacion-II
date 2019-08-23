package com.company;
/*Ejercicio 05:
Realice un programa que genere una matriz de 3x3 con números ingresados por el usuario por medio de la consola.
Una vez terminada la carga de los elementos se debe mostrar primero la matriz cargada con los datos iniciales y
luego la matriz con los datos ordenados de mayor a menor.
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int m[][] = new int[3][3];
        int valor, aux;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valor de la posicion " + i + "," + j + ": ");
                valor = sc.nextInt();
                m[i][j] = valor;
            }
        }
        System.out.println("Matriz Desordenada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (m[i][j] < m[k][l]) {
                            aux = m[i][j];
                            m[i][j] = m[k][l];
                            m[k][l] = aux;
                        }
                    }
                }
            }
        }
        System.out.println("Matriz Ordenada de Mayor a Menor: ");
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
