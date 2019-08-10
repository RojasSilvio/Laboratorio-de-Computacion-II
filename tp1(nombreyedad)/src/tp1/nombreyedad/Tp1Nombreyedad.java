
package tp1.nombreyedad;

import java.util.Scanner;
//hola mundo
public class Tp1Nombreyedad {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String nombre;int edad;
        do{
            System.out.print("Ingrese NOMBRE: ");
            nombre=sc.next();
            System.out.print("Ingrese EDAD: ");
            edad=sc.nextInt();
            if(edad<18){
                System.out.println(nombre+" es MENOR de edad.");
            }else{
                System.out.println(nombre+" es MAYOR de edad.");
            }

        }while(edad>0);
        
    }
    
}
