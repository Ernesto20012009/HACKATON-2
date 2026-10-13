package model;

import java.util.Arrays;

public class Agenda {

    private Contacto[] contactos;
    private int contador;// Contador de contactos

    public Agenda() {
        this.contactos = new Contacto[10];
        this.contador = 0;
    }// Constructor Agenda

    public Agenda(int tamanioMaximo) {
        this.contactos = new Contacto[tamanioMaximo];
        this.contador = 0;
    }// Constructor Agenda

    public boolean AddContacto(Contacto contactoNuevo) {
        if (contactoNuevo.getNombre() == null || contactoNuevo.getNombre().trim().isEmpty() ||
                contactoNuevo.getApellido() == null || contactoNuevo.getApellido().trim().isEmpty()) {
            System.out.println("El nombre y el apellido no pueden estar vacíos.");
            return false;
        }

        if (agendaLlena()) { // Validar si la agenda está llena
            System.out.println("La agenda está llena, no queda más espacio.");
            return false;
        } // fin if agendaLlena

        // Validar si el contacto ya existe en la agenda
        if (existeContacto(contactoNuevo)) {
            System.out.println("El contacto ya existe en la agenda (nombre y apellido duplicados).");
            return false;
        } // fin if existeContacto

        contactos[contador] = contactoNuevo;
        contador++;
        System.out.println("Contacto añadido exitosamente.");
        return true;
    } // fin AddContacto

    // MÉTODO PARA VERIFICAR SI UN CONTACTO YA EXISTE EN LA AGENDA
    public boolean existeContacto(Contacto contactoNuevo) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].equals(contactoNuevo)) {
                return true;
            }
        }
        return false;
    } // fin existeContacto

    public boolean agendaLlena() {
        return contador >= contactos.length;
    } // fin agendaLlena

    public int espacioAgenda() {
        return contactos.length - contador;
    } // fin espacioAgenda

    public int espacioLibres() {
        return espacioAgenda();
    } // fin espacioLibres

    // Alias para cumplir con la firma exacta del requerimiento
    public boolean añadirContacto(Contacto contactoNuevo) {
        return AddContacto(contactoNuevo);
    } // fin añadirContacto

    // MÉTODO QUE MUESTRA TODOS LOS CONTACTOS ORDENADOS ALFABÉTICAMENTE POR NOMBRE Y APELLIDO
    public void listarContactos() {
        if (contador == 0) {
            System.out.println("La agenda está vacía.");
            return;
        }

        // Ordenar los contactos alfabéticamente por nombre y luego por apellido (ignorando mayúsculas/minúsculas)
        Arrays.sort(contactos, 0, contador, (c1, c2) -> {
            int compNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
            if (compNombre != 0) {
                return compNombre;
            }
            return c1.getApellido().compareToIgnoreCase(c2.getApellido());
        });

        System.out.println("================ LISTA DE CONTACTOS ================");
        for (int i = 0; i < contador; i++) {
            System.out.println(contactos[i]);
        }
    } // fin listarContactos

    // MÉTODO PARA BUSCAR UN CONTACTO POR NOMBRE Y APELLIDO
    public void buscaContacto(String nombre, String apellido) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre) &&
                    contactos[i].getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Teléfono de " + contactos[i].getNombre() + " " + contactos[i].getApellido() + ": " + contactos[i].getTelefono());
                return;
            }
        }
        System.out.println("El contacto no se ha encontrado en la agenda.");
    } // fin buscaContacto

    // MÉTODO PARA ELIMINAR CONTACTO
    public boolean eliminarContacto(Contacto contactoAEliminar) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].equals(contactoAEliminar)) {
                // Desplazar elementos hacia la izquierda para mantener el arreglo compacto
                for (int j = i; j < contador - 1; j++) {
                    contactos[j] = contactos[j + 1];
                }
                contactos[contador - 1] = null;
                contador--;
                System.out.println("Contacto eliminado exitosamente de la agenda.");
                return true;
            }
        }
        System.out.println("No se puede eliminar: el contacto no existe en la agenda.");
        return false;
    } // fin eliminarContacto

    // MÉTODO PARA MODIFICAR EL TELÉFONO DE UN CONTACTO EXISTENTE
    public boolean modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre) &&
                    contactos[i].getApellido().equalsIgnoreCase(apellido)) {
                contactos[i].setTelefono(nuevoTelefono);
                System.out.println("Teléfono modificado exitosamente para " + contactos[i].getNombre() + " " + contactos[i].getApellido() + ".");
                return true;
            }
        }
        System.out.println("No se puede modificar: el contacto no existe en la agenda.");
        return false;
    } // fin modificarTelefono
} // fin class Agenda
