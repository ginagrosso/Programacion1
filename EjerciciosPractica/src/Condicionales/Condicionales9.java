package Condicionales;

import java.util.Scanner;

public class Condicionales9 {
    public static void main(String [] args) {

        Scanner leer = new Scanner (System.in);

        System.out.print("Ingrese la cantidad de horas de trabajo: ");

        Double horas = leer.nextDouble();

        System.out.print("Ingrese el sueldo por hora: ");

        Double sueldo_hs = leer.nextDouble();
        leer.close();
        Double SueldoTotal;

        if (horas <= 40) {

            SueldoTotal = horas * sueldo_hs;
            
        } 
        else { 
           SueldoTotal =  (horas - 40) * (sueldo_hs * 2) + 40 * sueldo_hs ;
        }

        System.out.println( "El sueldo del trabajador es de: " + SueldoTotal );


    }
}
