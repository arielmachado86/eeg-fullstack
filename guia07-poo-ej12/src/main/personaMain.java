/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.persona;
import servicio.personaServicio;

/**
 *
 * @author LMACHADO
 */
public class personaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona p = new persona ();
        personaServicio ps = new personaServicio();
        int Edad;
        
        ps.crearPersona(p);
        System.out.println(ps.mostrarPersona(p));
        System.out.println("Su edad es: "+ps.calcularEdad(p));
        System.out.println(ps.menorQue(p)); 
    }
    
}
