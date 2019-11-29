package TFI02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Facultad facu=new Facultad();
        Materia m=new Materia("Pablito");
        Carrera carrera1= new Carrera("TUP");
        facu.agregarCarrera(carrera1);

        m.toString();
    }
}
