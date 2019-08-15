
package matriz1;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int [][]m=new int [3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print("Ingrese valor: ");
            m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print("  "+m[i][j]);
            
            }
             System.out.println();
        }
        
    }
    
}
