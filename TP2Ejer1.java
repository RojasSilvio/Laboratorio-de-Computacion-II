
package tp2.ejer1;

import java.util.Scanner;

public class TP2Ejer1 {

    /*Ejercicio 1: Almacenar en Array
Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola. 
Los números introducidos se almacenarán en un array. 
El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int []arr = new int[10];int i=0;int cantnegativo=0,cantpositivo=0,cantcero=0;
        while(i<10){
        System.out.print("Ingrese un numero: ");
        arr[i]=sc.nextInt();
        if(arr[i]<0){
            cantnegativo++;
        }else if(arr[i]>0){
            cantpositivo++;
        }else if(arr[i]==0){
            cantcero++;
        }
        i++;
        }
        System.out.println("Cantidad de numeros negativos: "+cantnegativo);
        System.out.println("Cantidad de numeros positivos: "+cantpositivo);
        System.out.println("Cantidad de numero cero: "+cantcero);
    }
    
}
