
package matriz1;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int [][]m=new int [3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            m[i][j]=(int)(Math.random()*100);
            }
        }
        for(int[] fila:m){
            for(int elemento:fila){
            System.out.print(elemento+"  ");
            
            }
             System.out.println();
        }
        
    }
    
}
