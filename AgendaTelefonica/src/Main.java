import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner para la entradad de datos
        Scanner sc = new Scanner(System.in); // inputs
        Agenda agenda = null;
        int opcion; //entrada del menu

        System.out.println("=================AGENDA TELEFONICA=======================");
        System.out.println("1.- Aniadir contacto");
        System.out.println("2.- Listar Contacto");
        System.out.println("3.- Buscar Contacto");
        System.out.println("4.- Eliminar Contacto");
        System.out.println("5.- Modificar Telefono");
        System.out.println("6.- Verificar si la agenda esta llena");
        System.out.println("7.-Ver espacios libres de Agenda");
        System.out.println("8.- Salir: ");
        System.out.println("Elige una opcion (del 1 al 8): ");
        opcion = sc.nextInt();// guarda el valor del usuario
        sc.nextLine();// limpia el buffer de la entrada
        //System.out.println(opcion);
    }// fin main
} // fin CLASS Main
