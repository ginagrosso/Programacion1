package Secuenciales;
public class Conversion {
    public static void main(String [] args){
        String textouno = "Hola";
        String textodos = "Mundo";

        System.out.printf( "Este es el mensaje: %s %s. \f" , textouno, textodos); // el %s hace referencia al lugar donde va a estar la variable
        System.out.print("---------------- \n");
        System.out.print(textouno + "\b" + textodos + "\f"); //n newline (punto y aparte), t tabulacion, f float salto de renglón, b quita caracteres
        System.out.println("-----------------");
        System.out.print(textouno + "\f\t" + textodos + "\n");
    }
}
