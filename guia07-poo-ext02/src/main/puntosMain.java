/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.puntos;
import servicio.puntosServicio;

/**
 *
 * @author LMACHADO
 */
public class puntosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        puntos p = new puntos ();
        puntosServicio ps = new puntosServicio (); 
        
        System.out.println("CALCULO DE DINSTANCIA ENTRE DOS PUNTOS");
        System.out.println("**************************************");
        System.out.println("");
        ps.crearPuntos(p);
        
        System.out.println("La distancia entre los puntos ingresados es: " + ps.calcularDistancia(p));
    }
    
}
