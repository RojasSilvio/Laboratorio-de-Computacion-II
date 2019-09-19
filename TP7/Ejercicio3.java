package TP7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,i=0;
        do {
            i=0;
            try {
                System.out.print("Ingrese numero: ");
                numero = sc.nextInt();
                if ((numero % 2) == 0) {
                    System.out.println("El numero ingresado es PAR.");
                } else {
                    System.out.println("El numero ingresado es IMPAR.");
                }

            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es numérico.");
                sc= new Scanner(System.in);
                i=1;

            }
        }while(i==1);

    }
}
