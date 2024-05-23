package Arrays.ArrDinamicos;
/** Crea una función que tome dos arrays como argumentos y retorne un nuevo 
array que sea la concatenación de los dos arrays de entrada.
Por ejemplo, concatenar [1, 2, 3] y [4, 5, 6] debería dar como resultado [1, 2, 3, 4, 5, 6]. **/ 

import java.util.Scanner;

public class Concatenacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] Array_1 = new int [5];
        int [] Array_2 = new int [4];


        System.out.println("\n-------------Primer Arreglo-------------\n");
        for (int i = 0; i < Array_1.length; i++){
            System.out.print("ingrese el elemento " + (i + 1) + ": ");
            Array_1[i] = input.nextInt(); 
        }

        System.out.println("\n-------------Segundo Arreglo-------------\n");
        for (int i = 0; i < Array_2.length; i++){
            System.out.print("ingrese el elemento " + (i + 1) + ": ");
            Array_2[i] = input.nextInt(); 
        }
        input.close();
    
        int longTotal= Array_1.length + Array_2.length;
        
        int [] NuevoArray = new int[longTotal];

        System.arraycopy(Array_1, 0, NuevoArray, 0, Array_1.length);
        System.arraycopy(Array_2, 0, NuevoArray, Array_1.length, Array_2.length);

        System.out.println("\n-------------Arreglo Concatenado-------------\n");
        for (int elemento:NuevoArray){
            System.out.print(elemento + ", ");
        }
    }
    
}
