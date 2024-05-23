package Condicionales;
import java.util.Scanner;
public class Condicionales1Aprobacion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       

        System.out.print("Ingrese la primer nota: ");
        int nota1 = input.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        int nota2 = input.nextInt();

        System.out.print("Ingrese la tercer nota: ");
        int nota3 = input.nextInt(); 
        input.close();
        
        double promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 60){
            System.out.println("\nEl alumno está APROBADO y su promedio es: " + promedio);
        }
        else {
            System.out.println("\n60El alumno está DESAPROBADO y su promedio es: " + promedio);
        }

    }

}
