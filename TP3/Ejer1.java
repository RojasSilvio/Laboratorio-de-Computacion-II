package com.company;
/*Ejercicio 01:
Crear un array de 100 elementos que guarde en cada una de las posiciones un número aleatorio entre 1 y 100.
El programa debe imprimir en consola todos los valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados.
(Debes utilizar el método random() de la clase Math para poder rellenar los elementos del array.
BONUS: Verificar que el número no se repita.
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int tam=100;int aux;
        int arr[]=new int[tam];
        for (int i = 0; i <tam; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        for (int x:arr) {
            System.out.print(x+"|");
        }
    }
}
