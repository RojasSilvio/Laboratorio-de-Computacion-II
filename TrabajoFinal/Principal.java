package TrabajoFinal;

import javax.swing.*;

public class Principal {
    public static void main(String[] args){
        Ventanas v1=new Ventanas();
        v1.addWindowListener(new EventosdeVentana());
    }
}
