package Condicionales;

import java.util.Scanner;
public class Condicionales5Triangulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese uno de los lados del triángulo: ");
        double lado1 = input.nextDouble();

        System.out.print("\nIngrese el segundo lado: ");
        double lado2 = input.nextDouble();

        System.out.print("\nIngrese el tercer lados: ");
        double lado3 = input.nextDouble();
        input.close();
        if (lado1 == lado2 && lado2 == lado3){

            System.out.println("\nEs un triángulo Equilátero");

        }else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){

            System.out.println("\nEs un triángulo Isósceles");

        }else if(lado1 != lado2 && lado2 != lado3){

            System.out.println("\nEs un triángulo Escaleno");
        }
    }

}
