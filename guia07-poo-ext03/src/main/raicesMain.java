/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.raices;
import servicio.raicesServicios;

/**
 *
 * @author LMACHADO
 */
public class raicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        raices r = new raices ();
        raicesServicios rS = new raicesServicios();
        
        System.out.println("ECUACIONES DE 2DO. GRADO");
        System.out.println("*************************");
        System.out.println("");
        rS.solicitarValores(r);
        rS.calcular(r);
        
    }       
    
}
