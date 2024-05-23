package Arrays.ArrDinamicos;
import java.util.Scanner;
public class InversionDelArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nIngrese la cantidad de elementos que desea que tenga el arreglo: ");
        int cant = input.nextInt();
        int [] arreglo = new int [cant];
        
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            int elemento = input.nextInt();
            arreglo [i] = elemento;
        }
        input.close();

        System.out.println("\n---------Métodos creando un nuevo arreglo----------:\n");

        int [] arreglo2 = new int [cant];
        int j = 0;
        for (int i = cant -1; i >= 0; i--){
            arreglo2 [i] = arreglo [j];
            j++;
        }

        for (int elemento : arreglo2){
            System.out.println(elemento);
        }

        System.out.println("\nOtro:\n");

        for (int i = 0; i < arreglo.length; i++){
            arreglo2 [i] = arreglo [cant - 1 - i];
        }

        for (int elemento : arreglo2){
            System.out.println(elemento);
        }
        
        System.out.println("\n---------Métodos sin crear un nuevo arreglo----------:\n");

        for (int i=cant-1; i >= 0; i--){
            System.out.println(arreglo[i]);
        } 
        
        System.out.println("\nOtro:\n");

        for (int i = 0; i < arreglo.length / 2; i++){
            int temp = arreglo[i];
            arreglo [i] = arreglo [cant - 1 - i];
            arreglo [cant - 1 - i] = temp;
        }

        for (int elemento : arreglo){
            System.out.println(elemento);
        }
    }
}
