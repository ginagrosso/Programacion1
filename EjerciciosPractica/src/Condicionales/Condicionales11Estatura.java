package Condicionales;

import java.util.Scanner;
public class Condicionales11Estatura {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese su altura en centímetros: ");
        int altura = input.nextInt();
        input.close();
        if (altura <= 150){
            System.out.println("\nPersona de estatura baja");
        }
        if (altura > 151 && altura < 170){
            System.out.println("\nPersona de estatura media");
        }
        if(altura >= 171) {
            System.out.println("\nPersona alta");
        }
    }
}
