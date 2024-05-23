package Condicionales;

import java. util.Scanner;
public class Condicionales10CompaniaSeguros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese el monto a financiar: $");
        Double monto = input.nextDouble();
        input.close();
        if(monto <= 50000){
            double cuota = monto * 0.03;
            System.out.println("\nEl monto de la cuota es de: $" + cuota);
        }
        else{
            double cuota = monto * 0.02;
            System.out.println("\nEl monto de la cuota es de: $" + cuota);
        }
    }

}
