package Arrays.ArrDinamicos;

/*Desarrolla una función que encuentre el elemento máximo en un array de números.
Por ejemplo, para el array [10, 3, 4, 15, 7], la función debe retornar 15. */

public class EncontrarMaximo {
    public static void main(String[] args) {
        
        int[] arreglo = {5, 2, 10, 24, 14, 15, 6};
        int maximo = 0;
        
        for (int i = 0; i < arreglo.length; i++){
            if (maximo < arreglo[i]){
                maximo = arreglo[i];
            }
        }

        System.out.println("el maximo es: " + maximo);

        
    }
}
