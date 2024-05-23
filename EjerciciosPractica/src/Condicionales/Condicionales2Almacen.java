package Condicionales;

import java.util.Scanner;
public class Condicionales2Almacen {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nIngrese el total de la compra: $");
        Double total = input.nextDouble();

        int descuento = 20;
        input.close();
        if(total >= 1000){
            double ConDescuento = total - (total * descuento / 100); 
            System.out.print("El monto a pagar es: $" + ConDescuento);
        }
        else{
            System.out.print("El monto a pagar es: $" + total);
        }

    }

}
