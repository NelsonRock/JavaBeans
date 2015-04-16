/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author rcerrato
 */
public class Incidencia {
 private String email, aplicaciones, descripcion;
 private int ide;
        
   
    public Incidencia(){
    
    }
        public Incidencia(int e){
        this.ide=e;
    }
        public Incidencia (String e){
        email=e;
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
     * @return the aplicaciones
     */
    public String getAplicaciones() {
        return aplicaciones;
    }

    /**
     * @param aplicaciones the aplicaciones to set
     */
    public void setAplicaciones(String aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    /**
     * @return the problema
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param problema the problema to set
     */
    public void setDescripcion(String problema) {
        this.descripcion = problema;
    }

    /**
     * @return the ide
     */
    public int getIde() {
        return ide;
    }

    /**
     * @param ide the ide to set
     */
    public void setIde(int ide) {
        this.ide = ide;
    }

 
}
