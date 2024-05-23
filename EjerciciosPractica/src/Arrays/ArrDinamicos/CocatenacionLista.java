package Arrays.ArrDinamicos;
/** Crea una función que tome dos arrays como argumentos y retorne un nuevo 
array que sea la concatenación de los dos arrays de entrada.
Por ejemplo, concatenar [1, 2, 3] y [4, 5, 6] debería dar como resultado [1, 2, 3, 4, 5, 6]. **/ 

import java.util.ArrayList;
import java.util.List;
public class CocatenacionLista {
    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        List<Integer> listaResult = new ArrayList<>();

        listaResult.addAll(lista1);
        listaResult.addAll(lista2);

        for (int elemento:listaResult){
            System.out.print(elemento + ", ");
        }


        System.out.println("\n-----------otra forma-------------\n");

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(4);
        lista2.add(5);
        lista2.add(6);

        lista1.addAll(lista2);

        for (int elemento:lista1){
            System.out.print(elemento + ", ");
        }
    }
}
