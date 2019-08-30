package TP4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        CuentaCorriente Cuenta1;
        CuentaCorriente Cuenta2;
        /*Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:
			Nombre de clase: CuentaCorriente.
				Propiedades:
					saldo (double)
					nombreTitular (String)
					numeroCuenta (long)
				Constructor con dos parámetros:
					nombreTitular (String)
					saldo (double)
					Este constructor se encargará de establecer un nombre de titular para la cuenta corriente, un saldo inicial y asignará un nº a la cuenta corriente de tipo long de forma aleatoria
				Métodos:
					2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo CuentaCorriente.
					2 getter: Permitirán obtener saldo de la cuenta y datos generales de una CuentaCorriente.
					1 método adicional: permitirá realizar transferencias de dinero de una cuenta a otra.

			Crea una clase principal con el nombre de UsoCuenta. Crea dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2. Haz una transferencia de Cuenta1 a Cuenta2 por un importe de $200. Imprime los datos de las dos cuentas en consola.
*/

        Cuenta1=new CuentaCorriente(500,"Roberto");
        Cuenta2=new CuentaCorriente(500,"Juan");

        Cuenta1.setresta(200);
        Cuenta2.setsuma(200);

        System.out.println(Cuenta1.getInfo());
        System.out.println("-------------------------");
        System.out.println(Cuenta2.getInfo());
    }
}
