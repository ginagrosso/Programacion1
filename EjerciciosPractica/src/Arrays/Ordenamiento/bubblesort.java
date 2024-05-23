package Arrays.Ordenamiento;
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese la cantidad de elementos que desea que tenga el arreglo: ");
        int cant = input.nextInt();
        int [] arreglo = new int [cant];
        
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            int elemento = input.nextInt();
            arreglo [i] = elemento;
        }
        input.close();

        //** método burbuja: compara los números adyacentes en la lista y los intercambia si están en el orden incorrecto.
        //Repite este proceso hasta que todos los números estén en su posición correcta.**//

        int temp;
        for ( int i = 0; i < (cant -1); i++){
            for (int j = 0; j < (cant - 1); j++){
                if (arreglo [j] > arreglo [j+1]){
                    temp = arreglo [j];
                    arreglo [j] = arreglo [j+1];
                    arreglo [j+1] = temp;
                }
            }
        }

        System.out.println("\nArreglo ordenado en sentido creciente:");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}