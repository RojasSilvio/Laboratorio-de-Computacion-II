package TP8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Coche c[];
        Moto m[] ;
        int opcion=0,i;int cant_auto,cant_moto;

        System.out.println("///////////////-MENU-///////////////");
        do {
            i=0;
            try {

                    System.out.println("1. Crear AUTO");
                    System.out.println("2. Crear MOTO");
                    System.out.println("3. Crear AUTO y MOTO");
                    System.out.print("Opcion: ");
                    opcion=sc.nextInt();

            }catch (Exception e){
                System.out.println("El valor introducido no es numérico.");
                sc= new Scanner(System.in);
                i=1;
            }
        }while ((i==1)||(opcion <=0)||(opcion>3));



        if (opcion==1){
            System.out.print("Ingrese cantidad de Auto: ");
            cant_auto=sc.nextInt();
            c=new Coche[cant_auto];
            ingresar_auto(c,cant_auto);
            System.out.println("Desea listar los Autos: ");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.print("Opcion: ");
            int op=sc.nextInt();
            if (op==1){
                mostrar_auto(c,cant_auto);
            }
        }else if (opcion==2){
            System.out.print("Ingrese cantidad de Moto: ");
            cant_moto=sc.nextInt();
            m=new Moto[cant_moto];
            ingresar_moto(m,cant_moto);
            System.out.println("Desea listar las Motos: ");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.print("Opcion: ");
            int op=sc.nextInt();
            if (op==1){
                mostra_moto(m,cant_moto);
            }
        }else if (opcion ==3){
            System.out.print("Ingrese cantidad de Moto: ");
            cant_moto=sc.nextInt();
            m=new Moto[cant_moto];
            ingresar_moto(m,cant_moto);
            System.out.print("Ingrese cantidad de Auto: ");
            cant_auto=sc.nextInt();
            c=new Coche[cant_auto];
            ingresar_auto(c,cant_auto);
            System.out.println("Desea listar los Autos: ");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.print("Opcion: ");
            int op=sc.nextInt();
            if (op==1){
                mostrar_auto(c,cant_auto);
            }
            System.out.println("Desea listar las Motos: ");
            System.out.println("1. SI");
            System.out.println("2. NO");
            System.out.println("Opcion: ");
            op=sc.nextInt();
            if (op==1){
                mostra_moto(m,cant_moto);
            }
        }


    }
    public static void ingresar_auto(Coche c[], int cant){
        Scanner sc = new Scanner(System.in);
        double aceleracion, freno;

        for (int i = 0; i < cant; i++) {
            c[i] = new Coche(40);
            System.out.print("Ingrese ACELERACION del AUTO " + (i + 1) + ": ");
            aceleracion = sc.nextDouble();
            c[i].acelerar(aceleracion);
            System.out.print("Ingrese FRENO del AUTO " + (i + 1) + ": ");
            freno = sc.nextDouble();
            c[i].frenar(freno);
            System.out.println("///////////////////////////////////////////");
        }
        System.out.println("-----------------------------------------------");

    }
    public static void ingresar_moto(Moto m[],int cant){
        Scanner sc = new Scanner(System.in);
        double aceleracion, freno;int op;
        for (int i = 0; i < cant; i++) {
            m[i] = new Moto(10);
            System.out.print("Ingrese ACELERACION de la MOTO: "+ (i + 1) + ": ");
            aceleracion = sc.nextDouble();
            m[i].acelerar(aceleracion);
            System.out.println("Ingrese FRENO de la MOTO: "+ (i + 1) + ": ");
            System.out.println("1. Freno de Mano");
            System.out.println("2. Freno de Pie");
            System.out.print("Opcion: ");
            op=sc.nextInt();
            if (op==1){
                System.out.println("Ingrese FRENO de Mano la MOTO: "+ (i + 1) + ": ");
                freno = sc.nextDouble();
                m[i].frenar(freno);
                if (freno>60){
                    m[i].freno(op);
                }

            }else if(op==2){
                System.out.println("Ingrese FRENO de Pie la MOTO: "+ (i + 1) + ": ");
                freno = sc.nextDouble();
                m[i].frenar(freno);
                if (freno>60){
                    m[i].freno(op);
                }
            }



        }
        System.out.println("-----------------------------------------------");
    }

    public static void mostrar_auto(Coche c[], int cant) {

        for (int i = 0; i < cant; i++) {
            System.out.println("AUTO " + (i + 1) + ": ");
            System.out.println("Velocidad: " + c[i].getVelocidad()+ " km");
            System.out.println("Plaza: " + c[i].plaza());
            System.out.println(".....................");
        }
    }

    public static void mostra_moto(Moto m[],int cant) {
        for (int i = 0; i < cant; i++) {
            System.out.println("MOTO " + (i + 1) + ": ");
            System.out.println("Velocidad: " + m[i].getVelocidad()+ " km");
            System.out.println("Plaza: " + m[i].plaza());
            System.out.println(".....................");
        }
    }
}
