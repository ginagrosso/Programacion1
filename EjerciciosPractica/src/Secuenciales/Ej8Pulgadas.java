package Secuenciales;
import java.util.Scanner;
public class Ej8Pulgadas {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Escriba el valor que desea convertir: ");
        double centimetros= input.nextDouble();
        input.close();
        double pulgadas = centimetros * 0.39737;

        System.out.print(+centimetros + "cm son " + pulgadas + " pulgadas.");

    }
   

    }
