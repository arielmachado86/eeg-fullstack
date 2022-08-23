/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07.poo.ej01;

import Entidad.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author LMACHADO
 */
public class Guia07POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLibro vm = new ServicioLibro();
        Libro v = vm.carga();
        
        vm.imprimir(v);
    }
    
}
