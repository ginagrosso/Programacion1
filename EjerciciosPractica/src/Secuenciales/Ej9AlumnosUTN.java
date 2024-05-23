package Secuenciales;
import java.util.Scanner;
public class Ej9AlumnosUTN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de cursantes mujeres de la comision 1: ");
        int mujeres1 = input.nextInt();
        System.out.print("Ingrese el número de cursantes mujeres de la comision 2: ");
        int mujeres2 = input.nextInt();
        System.out.print("Ingrese el número de cursantes mujeres de la comision 3: ");
        int mujeres3 = input.nextInt();
        System.out.print("\nIngrese el número de cursantes hombres de la comision 1: ");
        int hombres1 = input.nextInt();
        System.out.print("Ingrese el número de cursantes hombres de la comision 2: ");
        int hombres2 = input.nextInt();
        System.out.print("Ingrese el número de cursantes hombres de la comision 3: ");
        int hombres3 = input.nextInt();

        input.close();
        
        int totalM = mujeres1 + mujeres2 + mujeres3;

        int totalH = hombres1 + hombres2 + hombres3;

        int totalEst = totalH + totalM;
        
        double PorcentajeH = (totalH * 100) / totalEst;

        double PorcentajeM = (totalM * 100) / totalEst;

        double promedio = totalEst / 3;

        System.out.print("\nEl promedio de alumnos es: " + promedio);
        System.out.print("\nEl procentaje de cursantes mujeres es: " + PorcentajeM + "%");
        System.out.print("\nEl porcentaje de cursantes hombres es: " + PorcentajeH + "%");
        

    }

}
