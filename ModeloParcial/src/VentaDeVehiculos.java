/* El programa debe mostrar un menú de opciones al
       usuario, permitiéndole interactuar con el sistema de venta de
       vehículos realizando diferentes operaciones.*/
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class VentaDeVehiculos {

    public static void MostrarMenu() {
        System.out.println("======================================\nGESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES\n==================================");
        System.out.println("1. Agregar vehículo");
        System.out.println("2. Buscar vehículo");
        System.out.println("3. Eliminar vehiculo");
        System.out.println("4. Listar vehiculos");
        System.out.println("5. Ordenar vehiculos alfabéticamente");
        System.out.println("6. Editar vehiculo por índice");
        System.out.println("7. Salir");
        System.out.println("======================================");

        System.out.print("\nIngrese la operación que desea realizar: ");
    }
    public static void AgregarAuto(ArrayList<String> autos, String nombreAuto) {
        autos.add(nombreAuto);
        System.out.println("El vehículo se agregó correctamente");
    }
    public static void EliminarAuto(ArrayList<String> autos, String nombreAuto) {
        autos.remove(nombreAuto);
        System.out.println("El auto se eliminó correctamente");
    }
    public static void BuscarAuto(ArrayList<String> autos, String nombreAuto){
        int indice = autos.indexOf(nombreAuto);
        if (indice != -1){
            System.out.println("Auto encontrado en la posición: " + indice + " de la lista.");
        }else{
            System.out.println("Auto no encontrado");
        }
    }
    public static void  ListarAutos(ArrayList<String> autos){
        System.out.println("\nLista de autos:");
        for (String auto:autos){
            System.out.println(auto);
        }
    }
    public static void  OrdenarAutos(ArrayList<String> autos){
        System.out.println("\nLista de autos ordenada alfabeticamente: ");
        Collections.sort(autos);
        for (String auto:autos){
            System.out.println(auto);
        }
    }
    public static void  EditarAuto(ArrayList<String> autos, int indice, String nuevoAuto){
        if (indice >= 0 && indice < autos.size()){
            autos.set(indice, nuevoAuto);
            System.out.println("Se ha editado el auto correctamente");
        }else{
            System.out.println("No se ha encontrado el auto. Índice no válido");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> autos = new ArrayList<>();
        autos.add("Toyota");
        autos.add("BMW");
        autos.add("Audi");
        autos.add("Ford");
        autos.add("Honda");
        autos.add("Fiat");

        int opcion;
        char salir = 'n';
        do {
            MostrarMenu();
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el nombre del auto: ");
                    String nombreAuto = input.next();
                    AgregarAuto(autos, nombreAuto);
                    System.out.println("\n¿Desea realizar otra operación (S/N)?");
                    salir = input.next().charAt(0);
                    break;
                case 2:
                    System.out.print("\nIngrese el nombre del auto que desea buscar: ");
                    nombreAuto = input.next();
                    BuscarAuto(autos, nombreAuto);
                    System.out.println("\n¿Desea realizar otra operación (S/N)?");
                    salir = input.next().charAt(0);
                    break;
                case 3:
                    System.out.print("\nIngrese el nombre del auto que desea eliminar: ");
                    nombreAuto = input.next();
                    EliminarAuto(autos, nombreAuto);
                    System.out.println("\n¿Desea realizar otra operación (S/N)?");
                    salir = input.next().charAt(0);
                    break;
                case 4:
                    ListarAutos(autos);
                    System.out.println("\n¿Desea realizar otra operación (S/N)?");
                    salir = input.next().charAt(0);
                    break;
                case 5:
                    OrdenarAutos(autos);
                    System.out.println("\n¿Desea realizar otra operación (S/N)?");
                    salir = input.next().charAt(0);
                    break;
                case 6:
                    System.out.println("\nIngrese el índice del auto que desea eliminar: ");
                    for (int i = 0; i < autos.size(); i++){
                        System.out.println(i + "." + autos.get(i));
                    }
                    int indice = input.nextInt();
                    System.out.print("\nIngrese el nuevo nombre del auto: ");

                    String nuevoAuto = input.next();

                    EditarAuto(autos, indice, nuevoAuto);
                    System.out.println("\n¿Desea realizar otra operación (S/N)?");
                    salir = input.next().charAt(0);
                    break;
                case 7:
                    System.out.println("\nSaliendo...");
                    break;
            }

        }while (opcion <= 7 && (salir == 'S' || salir == 's'));

    }
}
