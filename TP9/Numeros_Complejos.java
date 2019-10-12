package TP9;

public class Numeros_Complejos implements Numeros {

    @Override
    public void sumar(int[] arr) {
        int resultadox=0;
        int resultadoy=0;
        for (int i = 0; i <arr.length ; i++) {
            if ((i%2)==0){
                resultadox=resultadox+arr[i];
            }else{
                resultadoy=resultadoy+arr[i];
            }
        }
        System.out.println("Suma de numeros Complejos: "+"("+resultadox+" , "+resultadoy+")");
    }

    @Override
    public void restar(int[] arr) {
        int resultadox=arr[0];
        /*int div=arr.length/2;
        if((div%2)==0){
            while(i<=div){

            }
        }*/
        for (int i = 2; i <(arr.length); i=i+2) {
                //int j=i+2;
                //if ((i%2)==0){
            resultadox=resultadox-arr[i];
                //}


        }
        int resultadoy=arr[1];
        for (int i = 3; i <(arr.length); i=i+2) {
            //if ((i%2)!=0){
                resultadoy=resultadoy-arr[i];
            //}
        }
        System.out.println("Resta de numeros Complejos: "+"("+resultadox+" , "+resultadoy+")");
    }

    @Override
    public void multiplicar(int[] arr) {
        int resultadox=1;
        int resultadoy=1;
        for (int i = 0; i <arr.length ; i++) {
            if ((i%2)==0){
                resultadox=resultadox*arr[i];
            }else{
                resultadoy=resultadoy*arr[i];
            }
        }
        System.out.println("Multiplicacion de numeros Complejos: "+"("+resultadox+" , "+resultadoy+")");
    }

    @Override
    public void listar(int[] arr) {
        for(int i=0;i<arr.length;i=i+2){
            System.out.print("("+arr[i]+","+arr[i+1]+") ");
        }
    }
}
