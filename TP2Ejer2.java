
package tp2.ejer2;

import java.util.Scanner;

public class TP2Ejer2 {

    /*Ejercicio 2. Media en posiciones pares del Array
En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
Los números se almacenarán en un array y el programa calculará la media de los 
    números introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];int i=0;int mediapares=0,cantpares=0,promedio=0;
        
        while(i<10){
            System.out.print("Ingrese numero: ");
            arr[i]=sc.nextInt();
            if((i%2)==0){
                mediapares=mediapares+arr[i];
                cantpares++;
            }
            i++;
        }
        promedio=mediapares/cantpares;
        System.out.println("Promedio de los numeros en posiciones pares: "+promedio);
        
    }
    
}
