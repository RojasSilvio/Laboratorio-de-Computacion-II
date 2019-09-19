package TP7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero entre 1 y 100: ");
        numero=sc.nextInt();
        verificar(numero);
    }
    public static void verificar(int n)throws ExcepcionPropia{
        if (n<1||n>100){
            //throw new ExcepcionPropia("El nº está fuera de rango");
            ExcepcionPropia miExcepcion = new ExcepcionPropia("El nº está fuera de rango");
            throw miExcepcion;

        }
        else{System.out.println("Numero Ingresado: "+n);}
    }
}
class ExcepcionPropia extends RuntimeException{
    public ExcepcionPropia(){
    }

    public ExcepcionPropia(String mensajeError) {
        super(mensajeError);
    }

}
