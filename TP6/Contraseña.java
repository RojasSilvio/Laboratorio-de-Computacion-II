package TP6;

public class Contraseña {
    private int longitudContraseña;
    private int cantContraseña;
    private String contraseñaGenerada;
    int cont = 0;

    public Contraseña(int longitudContraseña, int cantContraseña) {
        this.longitudContraseña = longitudContraseña;
        this.cantContraseña = cantContraseña;

    }

    public int getLongitudContraseña() {
        return longitudContraseña;
    }

    public String getContraseñaGenerada() {
        return contraseñaGenerada;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void generadorContraseña(String contraseña_lista[][]) {
        int numeroRand, letraRand;
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] letraMin = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] letraMay = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] contraseñaUnida = new String[100];
        //String[][] contraseña=new String[this.cantContraseña][this.longitudContraseña];
        while (cont < this.cantContraseña) {
            int j = 0;
            for (int i = 0; i < 20; i++) {
                numeroRand = (int) (Math.random() * 9);
                letraRand = (int) (Math.random() * 25);
                if ((this.longitudContraseña >= 11) && (this.longitudContraseña < 20)) {
                    numeroRand = (int) (Math.random() * 9);
                    contraseñaUnida[j] = num[numeroRand];
                    j++;
                    numeroRand = (int) (Math.random() * 9);
                    contraseñaUnida[j] = num[numeroRand];
                    j++;
                    letraRand = (int) (Math.random() * 25);
                    contraseñaUnida[j] = letraMay[letraRand];
                    j++;
                    letraRand = (int) (Math.random() * 25);
                    contraseñaUnida[j] = letraMin[letraRand];
                    j++;

                } else {
                    contraseñaUnida[j] = letraMin[letraRand];
                    j++;
                    contraseñaUnida[j] = num[numeroRand];
                    j++;
                    letraRand = (int) (Math.random() * 25);
                    contraseñaUnida[j] = letraMay[letraRand];
                    j++;
                }
            }
            for (int i = 0; i < this.longitudContraseña; i++) {
                contraseña_lista[cont][i] = contraseñaUnida[i];
            }
            cont++;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public void validacionContraseña(String contraseña_lista[][]){
            System.out.println();
            System.out.println("/////////////////////////////////////////");
            if (this.longitudContraseña>=11){

                for (int i = 0; i < cont; i++) {
                    System.out.println("Contraseña: "+(i+1));
                    System.out.print("Contraseña SEGURA de "+this.longitudContraseña+" caracteres: ");
                    for (int j = 0; j < this.longitudContraseña; j++) {
                        System.out.print(contraseña_lista[i][j]);
                    }
                    System.out.println();
                    System.out.println("/////////////////////////////////////////");
                }
            }else{
                for (int i = 0; i < cont; i++) {
                    System.out.println("Contraseña: "+(i+1));
                    System.out.print("Contraseña INSEGURA de "+this.longitudContraseña+" caracteres: ");
                    for (int j = 0; j < this.longitudContraseña; j++) {
                        System.out.print(contraseña_lista[i][j]);
                    }

                    System.out.println();
                    System.out.println("/////////////////////////////////////////");
                }
            }
        }



}
