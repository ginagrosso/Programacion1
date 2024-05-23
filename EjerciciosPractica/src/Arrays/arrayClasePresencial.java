package Arrays;
import java.util.Scanner;
public class arrayClasePresencial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] arreglo = {1, 2, 3, 4, 5, 6, 7};
        //int acum = 0;
        System.out.println(arreglo);
        //**for (int elemento : arreglo){
           // System.out.println(elemento);
           // acum++;
       // }
        //System.out.println("Cantidad de elementos: " + acum);

        System.out.print("Indique que elementos desea mostrar: 1 pares, 2 impares ");
        int num = input.nextInt();
        int [] NuevoArreglo = new int[3];
        int [] NuevoArreglo2 = new int[4];
        int index = 0;
            for (int i = 0; i < arreglo.length; i++){
                if (num == 1) {
                    if (arreglo [i] % 2 == 0){
                        NuevoArreglo[index] = arreglo [i];
                        index ++;
                    }
                }else if (num == 2){
                    if (arreglo[i] % 2 != 0){  
                        NuevoArreglo2 [index] = arreglo [i];
                        index ++;
                    }
                } 
            }
            switch (num) {
                case 1:
                    for (int elemento : NuevoArreglo){
                        System.out.println(elemento);
                    }
                    break;
                case 2:
                    for (int elemento : NuevoArreglo2){
                        System.out.println(elemento);
                    }
                    break;
                default:
                    System.out.println("El número ingresado es inválido");
                    break;
            }
            input.close();
    }
}
