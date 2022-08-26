/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author LMACHADO
 */
public class persona {
    private String nombre;
    private Date fNacimiento;

    public persona() {
    }

    public persona(String nombre, Date fNacimiento) {
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
