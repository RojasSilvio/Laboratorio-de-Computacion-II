package Java;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Contacto> persona = new HashMap<>();
        int i=0,x=0,j=0;
        String nombre,apellido;
        int dni,telefono;

        do {

            try {
                do {
                    System.out.println("Ingrese Contacto "+(x+1)+":");
                    System.out.print("Ingrese DNI: ");
                    dni=sc.nextInt();
                    System.out.print("Ingrese Apellido: ");
                    apellido=sc.next();
                    System.out.print("Ingrese Nombre: ");
                    nombre=sc.next();
                    System.out.print("Ingrese Telefono: ");
                    telefono=sc.nextInt();
                    persona.put(dni, new Contacto(nombre,apellido,dni,telefono));
                    System.out.println("Deseas seguir ingresando: ");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Opcion: ");
                    i=sc.nextInt();
                }while(i==1);
                j=0;
            } catch (InputMismatchException e) {
                System.out.println("ERROr");
                sc= new Scanner(System.in);
                j=1;

            }
        }while(j==1);

        System.out.println(persona);
        do {
            try {
                System.out.print("Ingrese DNI a eliminar: ");
                dni=sc.nextInt();
                persona.remove(dni);
                System.out.println(persona);
                j=0;
            } catch (InputMismatchException e) {
                System.out.println("ERROr");
                sc= new Scanner(System.in);
                j=1;
            }
        }while(j==1);


        System.out.println("LISTADO DEL DIRECTORIO EN FORMATO CLAVE VALOR:");

        for(Map.Entry<Integer, Contacto>p:persona.entrySet()) {
            Integer clave = p.getKey();
            Contacto valor = p.getValue();
            System.out.println("Clave: "+clave+" Valor: "+valor);
        }

    }
}
