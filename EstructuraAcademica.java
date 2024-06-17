import java.util.ArrayList;
import java.util.Scanner;

/**Desarrolla un programa en Java que modele una estructura académica utilizando los principios de la
 * Programación Orientada a Objetos (POO). El programa debe cumplir con los siguientes requisitos:
 */


public class EstructuraAcademica {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("pepito", "perez", "25546", "dhnuch545", "TUP");
        Estudiante e2 = new Estudiante("Liset", "Grosso", "123456789","25000", "TUP");
        Estudiante e3 = new Estudiante("Paula", "Tonzar", "154354", "1654gfdvbd", "TUP");
        Estudiante e4 = new Estudiante("marito", "Dominguez", "2165121", "546dcjdg", "TUP");

        Profesor profe = new Profesor("Gustavo", "Massin", "17240515", 485000, "Jefe de Cátedra", "10 años", "Programación");
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes.add(e4);

        Comision comision1 = new Comision(profe, estudiantes);

        comision1.modificarEstudiante(e3);
        comision1.eliminarEstudiante(e2);
        comision1.altaEstudiante();
        comision1.ListarComision();

    }
}
/*Clase Persona:
   Atributos: nombre, apellido, dni.
   Métodos:
   Constructor para inicializar los atributos.
   Método verAtributos para mostrar sus atributos en formato texto.*/
class Persona{
    private String nombre, apellido, dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void verAtributos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Dni: " + getDni());
    }
}

/*Clase Empleado que hereda de Persona:
Atributos adicionales: sueldo, puesto.
Métodos:
Constructor para inicializar los atributos (incluidos los heredados).
Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
*/
class Empleado extends Persona{
    private double sueldo;
    private String puesto;
    public Empleado(String nombre, String apellido, String dni, double sueldo, String puesto) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.puesto = puesto;
    }
    public double getSueldo() {
        return sueldo;
    }
    public String getPuesto() {
        return puesto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    @Override
    public void verAtributos(){
        super.verAtributos();
        System.out.println("Sueldo: $" + getSueldo());
        System.out.println("Puesto: " + getPuesto());
    }
}
/*Clase Estudiante que hereda de Persona:
Atributos adicionales: matricula, carrera.
Métodos:
Constructor para inicializar los atributos (incluidos los heredados).
Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
*/
class Estudiante extends Persona{
    private String matricula;
    private String carrera;
    public Estudiante(String nombre, String apellido, String dni, String matricula, String carrera){
        super(nombre, apellido, dni);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCarrera() {
        return carrera;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void verAtributos(){
        super.verAtributos();
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Carrera: " + getCarrera());
    }
}
/*Clase Profesor que hereda de Persona:
Atributos adicionales: materia, antiguedad.
Métodos:
Constructor para inicializar los atributos (incluidos los heredados).
Método verAtributos que sobrescriba el de la clase Persona para mostrar también los atributos adicionales.
*/
class Profesor extends Empleado{
    private String antiguedad;
    private String materia;
    public Profesor(String nombre, String apellido, String dni,  double sueldo, String puesto, String antiguedad, String materia){
        super(nombre, apellido, dni, sueldo, puesto);
        this.antiguedad = antiguedad;
        this.materia = materia;
    }
    public String getAntiguedad() {
        return antiguedad;
    }
    public String getMateria() {
        return materia;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void verAtributos(){
        super.verAtributos();
        System.out.println("Antiguedad: " + getAntiguedad());
        System.out.println("Materia: " + getMateria());
    }

}
/*Clase Comision:
Atributos: profesor (de tipo Profesor), estudiantes (un array de objetos Estudiante).
Métodos:
Constructor que recibe un array de Estudiantes y un Profesor para inicializar los atributos.
Método eliminarEstudiante que permita eliminar estudiantes de la comisión.
Método listarComision que muestre todos los datos de la comisión, incluyendo los estudiantes y el profesor.
Métodos altaEstudiante, bajaEstudiante, y modificarEstudiante para agregar, eliminar y modificar estudiantes en la comisión, respectivamente.
*/

class Comision{
    Profesor profe;
    ArrayList<Estudiante> estudiantes;

    public Comision(Profesor profe, ArrayList<Estudiante> estudiantes) {
        this.profe = profe;
        this.estudiantes = estudiantes;
    }

    public Profesor getProfe() {
        return profe;
    }
    public void setProfe(Profesor profe) {
        this.profe = profe;
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void eliminarEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
        System.out.println("Estudiante aniquilado");
    }
    public void ListarComision(){
        System.out.println("\nPROFESOR: \n");
        profe.verAtributos();
        System.out.println("\nESTUDIANTES:\n");
        for (Estudiante estudiante : estudiantes){
            estudiante.verAtributos();
            System.out.println("\n---------------------------------");
        }
    }
    public void altaEstudiante(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del nuevo estudainte: ");
        System.out.print("Nombre: ");
        String nom = input.nextLine();
        System.out.print("Apellido: ");
        String apell = input.nextLine();
        System.out.print("DNI: ");
        String dni = input.nextLine();
        System.out.print("Matrícula: ");
        String mat = input.nextLine();
        System.out.print("Carrera: ");
        String carr = input.nextLine();
        Estudiante estu = new Estudiante(nom, apell, dni, mat, carr);
        estudiantes.add(estu);
        System.out.println("Estudiante agregado correctamente");
    }

    public void bajaEstudiante(Estudiante estu){
        eliminarEstudiante(estu);
    }

    public void modificarEstudiante(Estudiante estu){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        estu.setNombre(input.nextLine());
        System.out.println("Ingrese el apellido del estudiante: ");
        estu.setApellido(input.nextLine());
        System.out.println("Ingrese el dni del estudiante: ");
        estu.setDni(input.nextLine());
        System.out.println("Ingrese el matricula del estudiante: ");
        estu.setMatricula(input.nextLine());
        System.out.println("Ingrese el carrera del estudiante: ");
        estu.setCarrera(input.nextLine());
    }
}


