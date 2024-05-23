package Condicionales;

import java.util.Scanner;
public class Condicionales4Enteros {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese el primer número entero: ");
        int Num1 = input.nextInt();

        System.out.print("\nIngrese el segundo número entero: ");
        int Num2 = input.nextInt();

        System.out.print("\nIngrese el tercer número entero: ");
        int Num3 = input.nextInt();

        input.close();
        if (Num1 > Num2 && Num1 > Num3 ){
                System.out.println("\nEl mayor es: " + Num1);
        }

        if (Num2 > Num1 && Num2 > Num3 ){
            System.out.println("\nEl mayor es" + Num2);
        }

        if (Num3 > Num1 && Num3 > Num2 ){
            System.out.println("\nEl mayor es: " + Num3 + "\n");
        }

    }

}
