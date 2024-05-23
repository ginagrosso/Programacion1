package Secuenciales;
import java.util.Scanner;

public class Ej6Digitos {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Ingrese el primer número: ");
        int NumUno = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int NumDos = input.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int NumTres = input.nextInt();

        input.close();
        
        int x = NumUno * 100 + NumDos * 10 + NumTres;

        System.out.println("El número es: " + x);
        
    }
}
