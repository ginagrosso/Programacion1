package Arrays.busqueda;
import java.util.Scanner;
public class secuencial {
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

        System.out.print("Escriba el dato que desea encontrar: ");
        int dato = input.nextInt();
        input.close();
        boolean band = false;
        int i = 0;
        while (i < cant){
                if (arreglo [i] == dato){
                    System.out.println("El elemento " + dato + " se encunetra en la posición " + i);
                    band = true;
                    break;
                }
            i++;
        }
        if(band == false){
            System.out.println("El elemento que buscas no se encuentra en el arreglo");
        }
    }
}
