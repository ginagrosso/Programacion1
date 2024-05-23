package Arrays.Ordenamiento;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese la cantidad de elementos que desea que tenga el arreglo: ");
        int cant = input.nextInt();
        int [] arregloOriginal = new int [cant];
        
        for (int i = 0; i < arregloOriginal.length; i++){
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            int elemento = input.nextInt();
            arregloOriginal [i] = elemento;
        }
        input.close();

        //** método QuickSort: es un algoritmo de ordenamiento eficiente que utiliza la estrategia de dividir y conquistar. 
        //El algoritmo elige un elemento pivote y particiona el arreglo en dos sub-arreglos alrededor del pivote, 
        //de manera que los elementos más pequeños que el pivote estén a su izquierda y los elementos más grandes 
        // estén a su derecha. Luego, aplica recursivamente el mismo proceso a los sub-arreglos.**//

        int pivote = arregloOriginal [cant /2];
        System.out.println(pivote);

    

        System.out.println("\nArreglo ordenado en sentido creciente:");
        for (int i = 0; i < arregloOriginal.length; i++){
            System.out.println(arregloOriginal[i]);
        }
    }
}
