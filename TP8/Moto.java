package TP8;

public class Moto implements Vehiculos {
    //int plaza=5;
    private double velocidad;

    public Moto(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public int plaza() {
        return 2;
    }

    @Override
    public void acelerar(double v) {
        this.velocidad=this.velocidad+v;
        if (this.velocidad>Vehiculos.velocidad_maxima){
            System.out.println("La velocidad del moto supera los 120km");
            System.out.println("La velocidad es: "+this.velocidad+"km");
        }else if (this.velocidad>=60){
            System.out.println("La Moto hizo wili con la rueda delantera");
            System.out.println("La velocidad es: "+this.velocidad+"km.");
        }else{
            System.out.println("La velocidad es: "+this.velocidad+"km.");
        }
    }

    @Override
    public void frenar(double v) {

        this.velocidad=this.velocidad-v;
        if (this.velocidad<=0){
            System.out.println("STOP");
            System.out.println("Velocidad = 0 km");
        }else{
            System.out.println("La velocidad de la moto disminuye a "+this.velocidad+"km");
        }

    }

    public void freno(int f) {
        if (f==1){
            System.out.println("La Moto hizo Wily con la rueda trasera.");
        }else if (f==2){
            System.out.println("La Moto Derrapo.");
        }
    }
}
