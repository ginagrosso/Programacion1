package Arrays.ArrDinamicos;
/*Desarrolla una función que encuentre el elemento máximo en un array de números.
Por ejemplo, para el array [10, 3, 4, 15, 7], la función debe retornar 15. */
import java.util.ArrayList;
import java.util.List;
public class EncontrarMaximoList {
    
    public static int encontrarMaximo(List<Integer> List){
        int maximo = List.get(0);
        for (int item:List){
            if (maximo < item){
                maximo = item;
            }
        }
        return maximo;
    }
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(20);
        numeros.add(2);
        numeros.add(27);
        numeros.add(6);
        numeros.add(80);
        numeros.add(55);
        numeros.add(10);

        int maximo = encontrarMaximo(numeros);

        System.out.println("El máximo es: " + maximo);
    }
    
}
