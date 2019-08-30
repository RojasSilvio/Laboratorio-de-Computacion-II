package TPN5;

public class UsoFacultad {

    public static void main(String[] args) {
	// write your code here
        Facultad utn= new Facultad("Universidad tecnologica nacional",5);

        Estudiante estudiante= new Estudiante("Juan",3,8.5);
        Estudiante estudiante2= new Estudiante("Carlos",3,6);
        Estudiante estudiante3= new Estudiante("Julio",3,3);
        Estudiante estudiante4= new Estudiante("Elias",3,1.1);
        Estudiante estudiante5= new Estudiante("Marcos",3,4);
        utn.agregarEstudiante(estudiante);
        utn.agregarEstudiante(estudiante2);
        utn.agregarEstudiante(estudiante3);
        utn.agregarEstudiante(estudiante4);
        utn.agregarEstudiante(estudiante5);
        utn.listarEstudiantes();
        utn.borrarEstudiante(4);
        utn.listarEstudiantes();
    }
}
