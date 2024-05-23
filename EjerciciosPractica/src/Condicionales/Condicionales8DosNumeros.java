package Condicionales;


import java.util.Scanner;
public class Condicionales8DosNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngrese los dos números:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        input.close();
        
        if(num1 == num2){

            System.out.println(+ num1 + " x " + num2 + " = " + (num1*num2));

        }else if(num1 > num2){

            System.out.println(+ num1 + " - " + num2 + " = " + (num1-num2));
        }
        else{

            System.out.println(+ num1 + " + " + num2 + " = " + (num1+num2));
        }
    }
}
