package TPN5;

public class Estudiante {
    String nombreEstud;
    int numEstu;
    double notaMedia;

    public Estudiante(String nombreEstud, int numEstu, double notaMedia) {
        this.nombreEstud = nombreEstud;
        this.numEstu = numEstu;
        this.notaMedia = notaMedia;
    }

    public String getDatos(){

        return "Nombre del estudiante: "+nombreEstud+
                "\nNumero del estudiante: "+numEstu+
                "\nNota media del estudiante:"+notaMedia;
    }
}
