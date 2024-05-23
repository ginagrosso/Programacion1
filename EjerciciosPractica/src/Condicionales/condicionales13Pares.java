package Condicionales;

import java.util.Scanner;
public class condicionales13Pares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese el número entero distinto de 0: ");
        int num = input.nextInt();
        input.close();
        if (num!=0){

            if (num % 2 == 0){
                System.out.println("\nEl número es par");
            }
            else {
                System.out.println("\nEl número es impar");
            }
        }
        else{
            System.out.println("\nEl número debe ser distinto de 0");
        }
    }

}
