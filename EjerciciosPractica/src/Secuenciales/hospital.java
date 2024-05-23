package Secuenciales;
import java.util.Scanner;
public class hospital {

    public static void main(String[] args) {

       Scanner leer = new Scanner(System.in);

        System.out.print("Escriba el monto del presupuesto anual");

        double anual = leer.nextInt();

        leer.close();

        double urgencias = 0.37 * anual ;

        double pediatria = 0.42 * anual ;

        double trauma = 0.21 * anual ;

        System.out.println("El monto destinado para Urgencias:" + urgencias);

        System.out.println("El monto destinado para Pediatría:" + pediatria);

        System.out.println("El monto destinado para Traumatología:" + trauma);

    }

}
