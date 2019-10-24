package TFI01_RECUP;

public class Vehiculos extends Automoviles implements ParaMostrar {
    private Lugares origen;
    private Lugares destino;
    private Choferes chofer;
    private Pasajeros listaDePasajero[];
    private String matricula;
    private int  capacidadDePasajero=5;


    @Override
    public String verDatos() {
        return null;
    }

    @Override
    public String setChofer(Choferes chofer) {
        this.chofer=chofer;
        return null;
    }

    @Override
    public String setDestino(Lugares lugar) {
        this.destino=lugar;
        return null;
    }

    @Override
    public String setListaPasajeros(Pasajeros[] listaPasajeros) {
        if (listaPasajeros.length>capacidadDePasajero){
            System.out.println("“LA LISTA DE PASAJEROS ES SUPERIOR A LA CAPACIDAD DEL VEHÍCULO.");
        }else{
            this.listaDePasajero=listaPasajeros;
        }
        return null;
    }

    public String getListaDePasajero() {
        String listado ="LISTADO: \n";
        for (Pasajeros p : this.listaDePasajero) {
            listado = listado+p;
        }
        return listado;

    }

    public Lugares getOrigen() {
        return origen;
    }

    public void setOrigen(Lugares origen) {
        this.origen = origen;
    }

    public Lugares getDestino() {
        return destino;
    }

    public Choferes getChofer() {
        return chofer;
    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCapacidadDePasajero() {
        return capacidadDePasajero;
    }

    public void setCapacidadDePasajero(int capacidadDePasajero) {

            this.capacidadDePasajero = capacidadDePasajero;


    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula='" + matricula + '\'' +
                "Chofer= " +this.chofer + '\'' +
                "Origen= " +origen+ '\'' +
                "Destino= " +destino+ '\'' +

                '}';
    }
}
