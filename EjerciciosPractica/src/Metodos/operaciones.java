package Metodos;
import java.util.Scanner;
public class operaciones {

    //*Atributos */
    int num1, num2, suma, resta, producto;
    double cociente;

    //*Método para pedirle al usuario que ingrese los números */

    public void LeerNumeros (){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los numeros con los que desea operar: ");
        num1 =input.nextInt();
        num2 =input.nextInt();
        input.close();
    }

    //*Método para sumar los números */

    public void Sumar (){
       suma = num1 + num2;
    }

    //*Método para restar los números */

    public void Restar (){
        resta = num1 - num2;
    } 
    
    //*Método para multiplicar los números */

    public void Multiplicar (){
        producto = num1 * num2;
    }

    //*Método para dividir los números */

    public void Dividir (){
        cociente = (double) num1 / num2;
    }

    //*Método para mostrar los resultados */

    public void MostrarResultados (){
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + producto);
        System.out.println("El resultado de la división es: " + cociente);
    }

}
