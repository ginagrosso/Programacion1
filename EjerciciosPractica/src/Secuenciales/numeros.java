package Secuenciales;
import java.util.Scanner;
public class numeros {
    
    public static void main(String [] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");

        Double num1 = leer.nextDouble();

        System.out.print("Ingrese el segundo número: ");

        Double num2 = leer.nextDouble();

        leer.close();
        
        double suma = (num1 * 2) + (num2 * num2);
        System.out.println("El total de la suma es: " + suma);
        
        double promedio = (Math.pow(num1, 3) + Math.pow(num2, 3)) / 2;

        System.out.println("El promedio del cubo de los números es: " + promedio);
        System.out.println("djhixh ndhcuhc");
    }
    
}
