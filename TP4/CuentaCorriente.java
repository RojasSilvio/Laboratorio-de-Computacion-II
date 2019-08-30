package TP4;

public class CuentaCorriente {
    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

    public CuentaCorriente(double saldo, String nombreTitular) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        this.numeroCuenta =(long)(Math.random()*100);
    }

    public void setsuma(double saldo){

        this.saldo=this.saldo+saldo;
    }
    public void setresta(double saldo){
        this.saldo=this.saldo-saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getInfo() {

        return ("Numero de cuenta: "+this.numeroCuenta +
                " \nNombre: "+this.nombreTitular+"\n"+
                "Saldo: $"+this.saldo);
    }
}
