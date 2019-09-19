package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int numero;

        try {
            System.out.print("Ingrese numero: ");
            numero=sc.nextInt();
            if((numero%2)==0){
                System.out.println("El numero es PAR.");
            }else{
                System.out.println("El numero es IMPAR.");
            }
        }catch (InputMismatchException e){
            System.out.println("El valor introducido no es numérico. El programa se cerrará");
        }

    }
}
