/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.tiempo;
import servicio.tiempoServicio;

/**
 *
 * @author LMACHADO
 */
public class tiempoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tiempo t = new tiempo();
        tiempoServicio ts = new tiempoServicio();
        
        ts.reproducir(100);
    }
    
}
