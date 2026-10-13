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

   public boolean AddContacto(Contacto contacto1){
        if (contacto1.getNombre() == null || contacto1.getNombre().trim().isEmpty()||
        contacto1.getApellido()==null || contacto1.getApellido().trim().isEmpty()){
            System.out.println("El nombre y apellido no pueden estar vacios");
            return false;
        }//getNombre y apellido
       if (agendaLlena()){
           System.out.println("La agenda esta llena, no queda más espacio");
           return false;

       }//If Agenda Llena

       return false;
   }//addContacto

    public boolean agendaLlena(){
        return contador >= contactos.length;


    }//Agenda Llena

    public int espacioAgenda(){
        return contactos.length-contador;


    }//espacio de la agenda



}//class Agenda
