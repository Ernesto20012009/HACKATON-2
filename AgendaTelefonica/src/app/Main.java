package app;
import java.util.Scanner;

import model.Agenda;
import model.Contacto;

public class Main {
    public static void main(String[] args) {
        //Scanner para la entradad de datos
        Scanner sc = new Scanner(System.in); // inputs
        Agenda agenda = null;
        //menu
        System.out.println("===============CREAR AGENDA============");
        System.out.println("¿Como quieres crear la agenda?");
        System.out.println("1.-10 contactos");
        System.out.println("2.- Tamaño personalizado");
        System.out.println("Selecciona uan opción");
        int opcionIniciar = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        if (opcionIniciar == 2) {
            System.out.println("Ingresa el tamaño de la agenda: ");
            int tamanio = sc.nextInt();
            agenda = new Agenda(tamanio);
        }//if Opciones
        else {
            agenda = new Agenda();
            System.out.println("Se creo la agenda con 10 contactos");
        }//Else
        int opcion;
        do {
            System.out.println("\n================= AGENDA TELEFÓNICA =======================");
            System.out.println("1.- Añadir contacto");
            System.out.println("2.- Listar contactos");
            System.out.println("3.- Buscar contacto");
            System.out.println("4.- Comprobar si existe un contacto");
            System.out.println("5.- Modificar teléfono");
            System.out.println("6.- Eliminar contacto");
            System.out.println("7.- Verificar si la agenda está llena");
            System.out.println("8.- Ver espacios libres de la agenda");
            System.out.println("9.- Salir");
            System.out.print("Elige una opción (del 1 al 9): ");
            opcion = sc.nextInt(); // guarda el valor del usuario
            sc.nextLine(); // limpia el buffer de la entrada
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingresa el apellido: ");
                    String  apellido = sc.nextLine();
                    System.out.println("ingresa el numero: ");
                    String numero = sc.nextLine();
                    agenda.AddContacto(new Contacto(nombre,apellido,numero));
                    break;
                case 2:
                    agenda.listarContactos();
                    break;
                case 3:
                    System.out.print("Nombre del contacto a buscar: ");
                    String nomB = sc.nextLine();
                    System.out.print("Apellido del contacto a buscar: ");
                    String apB = sc.nextLine();
                    agenda.buscaContacto(nomB, apB);
                    break;
                case 4:
                    System.out.print("Nombre del contacto: ");
                    String nomV = sc.nextLine();
                    System.out.print("Apellido del contacto: ");
                    String apV = sc.nextLine();
                    if (agenda.existeContacto(new Contacto(nomV, apV, ""))) {
                        System.out.println("El contacto SÍ existe en la agenda.");
                    } else {
                        System.out.println("El contacto NO existe en la agenda.");
                    }
                    break;
                case 5:
                    System.out.print("Nombre del contacto: ");
                    String nomM = sc.nextLine();
                    System.out.print("Apellido del contacto: ");
                    String apM = sc.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String telN = sc.nextLine();
                    agenda.modificarTelefono(nomM, apM, telN);
                    break;
                case 6:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nomE = sc.nextLine();
                    System.out.print("Apellido del contacto a eliminar: ");
                    String apE = sc.nextLine();
                    agenda.eliminarContacto(new Contacto(nomE, apE, ""));
                    break;
                case 7:
                    if (agenda.agendaLlena()) {
                        System.out.println("Sí, la agenda está llena.");
                    } else {
                        System.out.println("No, todavía hay espacio disponible.");
                    }
                    break;
                case 8:
                    System.out.println("Espacios libres disponibles: " + agenda.espacioAgenda());
                    break;
                case 9:
                    System.out.println("Saliendo de la agenda.");
                    break;
                default:
                    System.out.println(" Opción no válida. Intenta de nuevo.");
            }//Switch
            //System.out.println(opcion);
        }while(opcion !=9);// fin main
    } // fin CLASS Main
}