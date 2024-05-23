package Iteraciones;

import java.util.Scanner;
public class Ej1Tabla {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int mult = 0;
        int num = 0;
        do {
            System.out.println("Ingrese un número del 1 al 9");
            num = input.nextInt();
            if (num > 9 || num < 1){
                System.out.println("Número inválido, debe estar entre el 1 y el 9");
            }
        }while (num > 9 || num < 1);

        input.close();
        
        for (int i = 1; i <= 9; i++){
            mult = num * i;
            System.out.println(num + "x" + i + " = " + mult);
        } 
       
    }
}
