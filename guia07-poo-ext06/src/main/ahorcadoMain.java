/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.ahorcado;
import servicio.ahorcadoServicio;

/**
 *
 * @author LMACHADO
 */
public class ahorcadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ahorcado a = new ahorcado();
        ahorcadoServicio as = new ahorcadoServicio();
        
        as.juego(a);
    }
    
}
