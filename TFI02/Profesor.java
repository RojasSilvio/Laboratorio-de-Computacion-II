package TFI02;

public class Profesor extends Persona {
    double basico;
    int antiguedad;

    public Profesor(double basico, int antiguedad) {
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        double x=((this.basico*10)/100);
        this.basico=((x+this.basico)*antiguedad);
        return 0 ;
    }

}
