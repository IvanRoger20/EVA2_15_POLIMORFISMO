/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_polimorfismo;

/**
 *
 * @author invitado
 */
public class Docente extends Persona{
    String numeroIdentificacion;

    public Docente(String numeroIdentificacion, String nombre, int edad) {
        super(nombre, edad);
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Docente(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
    
}
