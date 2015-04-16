/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author rcerrato
 */
public class Usuario {
    private String email, telefono, nombre, apellidos;
    
    public Usuario(){
        
    }
    public Usuario(String e, String t, String n, String a){
        email=e;
        telefono=t;
        nombre=n;
        apellidos=a;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
}
