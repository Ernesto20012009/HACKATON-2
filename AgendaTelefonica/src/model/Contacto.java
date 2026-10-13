package model;
import java.util.Objects;

public class Contacto {
    // declarar variables tipo de dato + nombrevariable
    private String nombre;
    private String apellido;
    private String telefono;
    // CONSTRUCTOR
    public Contacto (String nombre, String apellido, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // getter y setter////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }// fin getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// fin setNombre

    public String getApellido() {
        return apellido;
    }// fin getApellido

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }// fin setApellido

    public String getTelefono() {
        return telefono;
    } // fin getTelefono

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }// fin setTelefono
    // //////////////////////////////////////////////////

    // UN CONTACTO SE CONSIDERA IGAL A OTRO CUANDO TIENEN EL MISMMO NOMBRE Y APELLIDO
    //(SIN DISTINGUIR ENTRE MAYUSCULAS Y minusculas)
    @Override
    public boolean equals(Object object){
        if (this == object)return  true;
        if (object == null|| getClass() != object.getClass()) return false;
        //
        Contacto contacto = (Contacto) object;
        return nombre.equalsIgnoreCase(contacto.nombre) && apellido.equalsIgnoreCase(contacto.apellido);
    }// fin  equals

    @Override
    public int hashCode(){
        return  Objects.hash(nombre.toLowerCase(), apellido.toLowerCase());// regresar nombre y apellido en minuscula
    }// fin nombreNormalizado


    //  IMPRIME LOS RESULTADOS  |
    //                          V
    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }// FIN toString
}// fin class Contacto
