package TP6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Contraseña c;
        int longitudContraseña;
        int cantContraseña;

        System.out.print("Ingrese la cantidad de contraseña que desea generar: ");
        cantContraseña = sc.nextInt();
        System.out.print("Ingrese longitud de contraseña: ");
        longitudContraseña = sc.nextInt();

        c=new Contraseña(longitudContraseña,cantContraseña);
        String contraseña_lista[][]=new String[cantContraseña][longitudContraseña];
        c.generadorContraseña(contraseña_lista);
        c.validacionContraseña(contraseña_lista);
    }
}
