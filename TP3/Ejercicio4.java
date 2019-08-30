package com.company;
/*Ejercicio 04:
Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola.
Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor
* */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int m[][]=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = (int) (Math.random() *10);
            }
        }
        System.out.println("Matriz Desordenada: ");
        for (int x = 0; x <3; x++) {
            for (int j = 0; j <3; j++) {
                System.out.print(m[x][j]+"   ");
            }
            System.out.println();
        }
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <3; k++) {
                    for (int l = 0; l <3; l++) {
                        for (int n = 0; n <3; n++) {
                            if (m[j][k]<m[l][n]){
                                int aux=m[j][k];
                                m[j][k]=m[l][n];
                                m[l][n]=aux;
                            }

                        }
                    }
                }
            }
        System.out.println("Matriz Ordenada: ");
            for (int x = 0; x <3; x++) {
                for (int j = 0; j <3; j++) {
                    System.out.print(m[x][j]+"   ");
                }
                System.out.println();
            }

    }
}
