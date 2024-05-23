package Arrays.Multidimencional;
import java.util.Scanner;
public class multi1 {
    public static void main(String[] args) {
        int [] [] matriz = new int[3][5];
        Scanner input = new Scanner(System.in);
       //**matriz [0][0] = 2;
        //matriz [0][1] = 4;
        //matriz [0][2] = 2;
        //matriz [0][3] = 4;
        //matriz [0][4] = 2;

       // matriz [1][0] = 2;
       // matriz [1][1] = 3;
       // matriz [1][2] = 5;
       // matriz [1][3] = 3;
       // matriz [1][4] = 5;

       // matriz [2][0] = 1;
       // matriz [2][1] = 8;
       // matriz [2][2] = 6;
       // matriz [2][3] = 8;
       // matriz [2][4] = 6; 
        
        //* ingresar los elementos */
        for (int f = 0; f < 3; f++){
            for (int c = 0; c < 5; c++){
                System.out.print("ingrese el elemento " + (f) + "," + (c) + ":");
                int elementos = input.nextInt();
                matriz[f][c] = elementos; 
            }
        }
        
        input.close();

        for (int f = 0; f < 3; f++){
            for (int c = 0; c < 5; c++){
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("con for-each: \n");

        //**Recorrer por medio de for-each */

        for (int [] fila:matriz){
            for (int elemento:fila){
                System.out.print(elemento + " ");
            }
            System.out.println(" ");
        }
    }

}
