package Condicionales;

import java.util.Scanner;
public class Condicionales6Romanos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese un número del 1 al 10 para transformar: ");
        int num = input.nextInt();
        input.close();
        if (num >= 1 && num <= 10){
            switch (num){
                case 1:
                    System.out.print("\nEl número 1 en números romanos es: I");
                    break;
                case 2:
                    System.out.print("\nEl número 2 en números romanos es: II");
                    break;
                case 3:
                    System.out.print("\nEl número 3 en números romanos es: III");
                    break;
                case 4:
                    System.out.print("\nEl número 4 en números romanos es: IV");
                    break;
                case 5:
                    System.out.print("\nEl número 5 en números romanos es: V");
                    break;
                case 6:
                    System.out.print("\nEl número 6 en números romanos es: VI");
                    break;
                case 7:
                    System.out.print("\nEl número 7 en números romanos es: VII");
                    break;
                case 8:
                    System.out.print("\nEl número 8 en números romanos es: VIII");
                    break;
                case 9:
                    System.out.print("\nEl número 9 en números romanos es: IX");
                    break;
                case 10:
                    System.out.print("\nEl número 10 en números romanos es: X");
            }
        }
        else{
            System.out.println("\nEl número ingresado no se encuentra entre 1 y 10");
        }
    }
}
