package TP9;

public class Numeros_Naturales implements Numeros {

    @Override
    public void sumar(int arr[]) {

        int resultado=0;
        for (int i = 0; i <arr.length ; i++) {
            resultado=resultado+arr[i];
        }
        System.out.println("Suma de numeros Naturales: "+resultado);
    }

    @Override
    public void restar(int arr[]) {
        int resultado=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            resultado=resultado-arr[i];
        }
        System.out.println("Resta de numeros Naturales: "+resultado);
    }

    @Override
    public void multiplicar(int arr[]) {
        int resultado=1;
        for (int i = 0; i <arr.length ; i++) {
            resultado=resultado*arr[i];
        }
        System.out.println("Multiplicacion de numeros Naturales: "+resultado);
    }

    @Override
    public void listar(int[] arr) {
        int aux=-1;

        for (int i = 1; i <= arr.length; i++) {
            for (int j=0 ; j< arr.length - 1; j++) {
                if (arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = aux;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
