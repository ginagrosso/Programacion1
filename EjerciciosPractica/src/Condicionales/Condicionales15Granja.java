package Condicionales;

import java.util.Scanner;
public class Condicionales15Granja {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de conejos blancos: ");
        int N1 = input.nextInt();

        System.out.print("\nIngrese la cantidad de conejos negros: ");
        int N2 = input.nextInt();

        System.out.print("\nIngrese el valor de cada conejos blanco: $");
        Double P1 = input.nextDouble();

        System.out.print("\nIngrese el valor de cada conejos negros: $");
        Double P2 = input.nextDouble();
        input.close();
        double TotalP1 = N1 * P1;
        double TotalP2 = N2 * P2;
        
        System.out.println("\nEl total de venta es de: $" + (TotalP1 + TotalP2));

        if (N1 > N2){
            System.out.println("\nLos blancos son los más vendidos");
        }
        else{
            System.out.println("\nLos negros son los más vendidos");
        }
    }
}
