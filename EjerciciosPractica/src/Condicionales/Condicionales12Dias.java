package Condicionales;

import java.util.Scanner;
public class Condicionales12Dias {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese un número del 1 al 7: ");
        int num = input.nextInt();
        input.close();
        String dia;
         if (num <= 7){

            if (num == 1){

                dia = "Lunes";

            } else if (num == 2){

                dia = "Martes";

            }else if (num == 3){

                dia = "Miércoles";

            }else if (num == 4){

                dia = "Jueves";

            }else if (num == 5){

                dia = "Viernes";

            }else if (num == 6){

                dia = "Sábado";

            }else {

                dia = "Domingo";

            }
            System.out.print("\nEl día de la semana es: " + dia);
            }

        else{
            System.out.println("\nDebe ser un número entre el 1 y el 7");
        }

    }
       

}
