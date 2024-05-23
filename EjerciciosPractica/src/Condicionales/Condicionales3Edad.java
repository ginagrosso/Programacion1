package Condicionales;

import java.util.Scanner;
public class Condicionales3Edad {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese la edad de uno de los hermanos: ");
        int Edad1 = input.nextInt();

        System.out.print("\nIngrese la edad del otro hermano: ");
        int Edad2 = input.nextInt();
        input.close();
        if(Edad1 > Edad2){ 
            System.out.print("\nLa edad del hermano mayor tiene: " + Edad1 + " años y se lleva " + (Edad1 - Edad2) + " años de diferencia con el hermano menor");
        }
        else{
            System.out.print("\nLa edad del hermano mayor es: " + Edad2 + " años y se lleva " + (Edad2 - Edad1) + " años de diferencia con el hermano menor.");
        }
    }

}
