package Condicionales;

import java.util.Scanner;
public class condicionales14DosCifras {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese un número de dos cifras: ");
        int num = input.nextInt();
        input.close();
        if (num >= 10 && num <= 99){             
            int cifra1 = num / 10;
            int cifra2 = num % 10;
            System.out.println("\nLa primer cifra es: " +(cifra1)+ " y la segunda cifra es: " +(cifra2));
            
            if (num % 3 == 0){
                System.out.print("\nEl número ingresado es múltiplo de 3");
            }
            else{
                System.out.print("\nEl número ingresado no es múltiplo de 3");
            }
        }
        else{
            System.out.print("\nEl número ingresado debe ser de 2 cifras");
        }
    }
}
