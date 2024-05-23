package Iteraciones;
import java.util.Scanner;
public class Ej4SumayPromedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int cant = 0;
        double prom = 0;

        System.out.println("Cuántos números desea ingresar: ");
        int n = input.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.print("Ingrese un número del 0 al 100: ");
            num = input.nextInt();
            while (num >= 0 && num <= 100){
                if (num >= 0 && num <= 100){
                    suma += num;
                    cant ++;
                }
            }
        }

        input.close();
        
        if (cant > 0){
            prom = suma / cant;
            System.out.println("Suma: " + suma);
            System.out.println("Pormedio: " + prom);
        }
        else{
            System.out.println("No se ingresaron números dentro del rango [0,100]");
        }
    
    }
}

