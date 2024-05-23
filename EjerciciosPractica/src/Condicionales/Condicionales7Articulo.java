package Condicionales;


import java.util.Scanner;
public class Condicionales7Articulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nIngrese la clave del artículo (01 o 02): ");
        int clave = input.nextInt();
        input.close();
        String Art = "";
        double precio = 0;
        double descuento = 0;

        if(clave == 1 || clave == 0){

            switch (clave){
                case 01:
                    Art = "Azúcar";
                    precio = 1300.5;
                    descuento = 0.10;
                    break;

                case 02:
                    Art = "Fideos";
                    precio = 1150;
                    descuento = 0.20;
                    break;
            }

            double PrecioDesc = precio * descuento;

            System.out.println("\nArtículo: " + Art + "\nClave: " + clave + "\nPrecio: $" + precio + "\nCon descuento: $" + (precio - PrecioDesc));
        }
        else{
            System.out.println("\nEl número de clave no es válido");
        }
    }
}
