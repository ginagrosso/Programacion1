package Secuenciales;
import java.util.Scanner;
public class Ej7PorcentajeEstudiantes {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("\nEscriba la cantidad de estudiantes mujeres: ");
        int mujeres= input.nextInt();

        System.out.print("\nEscriba la cantidad de estudiantes varones: ");
        int varones= input.nextInt();

        input.close();
        
        int total = varones + mujeres;
        double porcentajeM = (mujeres * 100) / total;
        double porcentajeV = (varones * 100) / total;


        System.out.println("\nEl porcentaje de estudiantes mujeres es: " + porcentajeM );
        System.out.println("El porcentaje de estudiantes varones es: " + porcentajeV);
    }
}
