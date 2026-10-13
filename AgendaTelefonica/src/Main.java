import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner para la entradad de datos
        Scanner sc = new Scanner(System.in); // inputs
        Agenda agenda = null;
        int opcion; //entrada del menu

        System.out.println("===============CREAR AGENDA============");
        System.out.println("¿Como quieres crear la agenda?");
        System.out.println("1.-10 contactos");
        System.out.println("2.- Tamaño personalizado");
        System.out.println("Selecciona uan opción");
        opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 2) {
            System.out.println("Ingresa el tamaño de la agenda: ");
            int tamanio = sc.nextInt();
            agenda = new Agenda(tamanio);
        }//if Opciones
        else {
            agenda = new Agenda();
            System.out.println("Se creo la agenda con 10 contactos");
        }//Else

        do {


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
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingresa el apellido: ");
                    String  apellido = sc.nextLine();
                    System.out.println("ingresa el numero: ");
                    String numero = sc.nextLine();
                    agenda.AddContacto(new Contacto(nombre,apellido,numero));
                    break;
            }//Switch
            //System.out.println(opcion);
        } // fin main
    } // fin CLASS Main
}