package TFI01_RECUP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int cantPasajejos;

        System.out.print("Defina la cantiad de pasajeros que desea ingresar: ");
        cantPasajejos= sc.nextInt ();

        String nombrep,nombrec,nombrev,matricula;
        int dni,dnic;

        Pasajeros listadePasajero[]=new Pasajeros[cantPasajejos];
        Choferes chofer01=new Choferes();
        Vehiculos vehiculo01=new Vehiculos();
        Lugares origen=new Lugares();Lugares destino=new Lugares();
        int x=0;

        for (int i = 0; i <listadePasajero.length ; i++) {
            do {
                x=0;
                try {
                    System.out.print("Ingrese nombre: ");
                    nombrep = sc.next();

                    System.out.print("Ingrese DNI: ");
                    dni = sc.nextInt();

                    listadePasajero[i]=new Pasajeros(nombrep,dni);

                }catch (Exception e){
                    System.out.println("ERROR EN EL INGRESO DE DATOS");
                    sc=new Scanner(System.in);
                    x=1;
                }
            }while(x==1);
                }
        try {
            System.out.print("Ingrese nombre de Chofer: ");
            nombrec=sc.next();
            chofer01.setNombre(nombrec);
            System.out.print("Ingrese DNi de Chofer: ");
            dnic=sc.nextInt();
            chofer01.setDni(dnic);

            System.out.println("VEHICULOS.");
            System.out.print("Ingrese Origen: ");
            nombrev=sc.next();
            origen.setNombre(nombrev);
            vehiculo01.setOrigen(origen);
            System.out.print("Ingrese Destino: ");
            nombrev=sc.next();
            destino.setNombre(nombrev);
            vehiculo01.setDestino(destino);

            vehiculo01.setChofer(chofer01);

            vehiculo01.setListaPasajeros(listadePasajero);
            System.out.print("Ingrese Matricula: ");
            matricula=sc.next();
            vehiculo01.setMatricula(matricula);
            System.out.println("Cantidad de Pasajero.");
            vehiculo01.setCapacidadDePasajero(cantPasajejos);


        }catch (Exception e){
            System.out.println("ERROR EN EL INGRESO DE DATOS");
        }
        System.out.println("---- Chofer del vehiculo ---- ");
        System.out.println(vehiculo01.toString());
        System.out.println(vehiculo01.getListaDePasajero());
    }

}
