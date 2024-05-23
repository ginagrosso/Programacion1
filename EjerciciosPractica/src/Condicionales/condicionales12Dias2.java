package Condicionales;

import java.util.Scanner;
public class condicionales12Dias2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
            System.out.print("\nIngrese un número del 1 al 7: ");
            int num = input.nextInt();
            input.close();                
            String dia = "";

            switch (num) {
                case 1:
                    dia = "Lunes";
                    break;
                case 2:
                    dia = "Martes";
                    break;
                case 3:
                    dia = "Miércoles";
                    break;
                case 4:
                    dia = "Jueves";
                    break;
                case 5:
                    dia = "Viernes";
                    break;
                case 6:
                    dia = "Sábado";
                    break;
                case 7:
                    dia = "Domingo";
                    break;
                default:
                    System.out.println("\nEl número que debe ingresar solo puede ser del 1 al 7");
            }
            if (dia != ""){
                System.out.println("\nEl día de la semana es: " + dia);
            }
    }
}


