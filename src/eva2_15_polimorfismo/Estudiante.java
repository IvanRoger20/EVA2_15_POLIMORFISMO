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
public class Estudiante extends Persona{
    private String numeroControl;

    public Estudiante() {
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);
        this.numeroControl = numeroControl;
    }

    public Estudiante(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    
    
    
}
