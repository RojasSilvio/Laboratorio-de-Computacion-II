package com.company;
/*Ejercicio03:
Crear una matriz que contenga datos de personas, siendo cada columna una persona diferente y cada fila los datos de las mismas.
Los datos para rellenar la matriz deben ser proporcionados por el usuario.
Una vez que se llene todo el arreglo de arreglos se debe mostrar la información en la consola de una forma clara.
BONUS: ordenar alfabéticamente el arreglo.
* */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String m[][]=new String[3][30];int x=0;int pregunta=1;
        String nombre;String edad,dni;
        while(pregunta==1){

                System.out.print("Ingrese Nombre: ");
                nombre=sc.next();
                m[0][x]=nombre;
                System.out.print("Ingrese DNI: ");
                dni=sc.next();
                m[1][x]=dni;
                System.out.print("Ingrese Edad:");
                edad=sc.next();
                m[2][x]=edad;
                x++;
                System.out.println("Desea seguir ingresando?: ");
                System.out.println("1.SI. ");
                System.out.println("2.NO. ");
                System.out.print("Opcion: ");
                pregunta=sc.nextInt();

        }
        for (int i = 0; i <3; i++){
            for (int j = 0; j <x ; j++){
                if (i==2){
                    System.out.print(m[i][j]+"           \t\t\t");
                }else if(i==0) {
                    System.out.print(m[i][j] + "       \t\t\t");
                }
                else{
                    System.out.print(m[i][j] + "    \t\t\t");
                }
            }
            System.out.println();
        }
    }
}
