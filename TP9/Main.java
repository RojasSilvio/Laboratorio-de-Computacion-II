package TP9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tam_n,tam_c;
        Numeros_Naturales numeros_naturales=new Numeros_Naturales();
        Numeros_Complejos numeros_complejos=new Numeros_Complejos();
        System.out.print("Ingrese la cantidad de Numeros Naturales: ");
        tam_n=sc.nextInt();
        System.out.print("Ingrese la cantidad de Numeros Complejos: ");
        tam_c=sc.nextInt();
        int nc[]=new int[(tam_c*2)];
        int nt[]=new int[tam_n];
        System.out.println("------Numeros Naturales------ ");
        for (int i = 0; i <nt.length; i++) {
            System.out.print("Ingrese numero: ");
            nt[i]=sc.nextInt();
        }
        numeros_naturales.sumar(nt);
        numeros_naturales.restar(nt);
        numeros_naturales.multiplicar(nt);
        System.out.println("------Numeros Complejos------");
        int x=0;
        for (int i = 0; i <tam_c; i++) {
            System.out.print("Ingrese numero (x): ");
            nc[i+x]=sc.nextInt();
            x++;
            System.out.print("Ingrese numero (y): ");
            nc[i+(x)]=sc.nextInt();
        }
        numeros_complejos.sumar(nc);
        numeros_complejos.restar(nc);
        numeros_complejos.multiplicar(nc);
        int opcion;
        System.out.println("¿Deseas listar los Numeros Ingresado?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.print("Opcion: ");
        opcion=sc.nextInt();
        if (opcion==1){
            System.out.println("Numeros Naturales: ");
            numeros_naturales.listar(nt);
            System.out.println();
            System.out.println("Numeros Complejos: ");
            numeros_complejos.listar(nc);
        }
    }
}
