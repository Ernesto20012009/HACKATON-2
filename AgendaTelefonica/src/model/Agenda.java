package model;
import java.util.Arrays;
import java.util.Comparator;
public class Agenda {

    private Contacto[] contactos;
    private  int contador;//Contador de contactos

    public Agenda() {
        this.contactos = new Contacto[10];
        this.contador = 0;
    }//Constructor Agenda

    public Agenda(int tamanioMaximo) {
        this.contactos = new Contacto[tamanioMaximo];
        this.contador = 0;
    }//Constructor Agenda

   public boolean AddContacto(Contacto contacto1) {
       if (contacto1.getNombre() == null || contacto1.getNombre().trim().isEmpty() ||
               contacto1.getApellido() == null || contacto1.getApellido().trim().isEmpty()) {
           System.out.println("El nombre y apellido no pueden estar vacios");
           return false;
       }
       if (agendaLlena()) {// validar si la agenda esta llena
           System.out.println("La agenda esta llena, no queda más espacio");
           return false;
           // Validar si el contacto ya existe
           if (existeContacto(contacto1)) {
               System.out.println("El contacto ya existe en la agenda (nombre y apellido duplicados).");
               return false;
           }
           contactos[contador] = contacto1;
           contador++;
           System.out.println("Contacto añadido exitosamente.");
           return true;
       }//If Agenda Llena

       return false;
   }//fin addContacto

    public boolean agendaLlena(){
        return contador >= contactos.length;


    }//Agenda Llena

    public int espacioAgenda(){
        return contactos.length-contador;


    }//espacio de la agenda

// METODO QUE MUESTGRA TODOS LOS CONTACTOS ORDENADOS ALFABETICAMENTE POR NOMBRE Y APELLIDO
    public void listarContactos(){

        return;
    }// fin listarContactos

    // METODO PARA BUSCAR UN CONTACTO
    public void buscarContacto(){

    }// fin buscarContacto

//METODO PARA ELIMINAR CONTACTO
    public boolean eliminarContacto(Contacto contacto1){
    return false;
    }// fin eliminarContacto

//METODO PARA  MODIFICAR UN CONTACTO EXISTENTE
    public void modificarTelefono(){

    }// fin modificarTelefono
}//class Agenda
