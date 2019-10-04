package TP8;

public class Coche implements Vehiculos {
    //int plaza=5;
    private double velocidad;

    public Coche(double velocidad) {

        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public int plaza() {
        return 5;
    }

    @Override
    public void acelerar(double v) {
        this.velocidad=this.velocidad+v;
        if (this.velocidad>Vehiculos.velocidad_maxima){
            System.out.println("La velocidad del auto supera los 120km");
            System.out.println("La velocidad es: "+this.velocidad+"km");
        }else{
            System.out.println("La velocidad es: "+this.velocidad+"km.");
        }
    }

    @Override
    public void frenar(double v) {
        this.velocidad=this.velocidad-v;
        if (this.velocidad<=0){
            System.out.println("STOP");
            System.out.println("Velocidad = 0");
        }else{
            System.out.println("La velocidad del auto disminuye a "+this.velocidad+"km");
        }
    }
}
