/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.cadena;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class cadenaServicio {
    Scanner leer = new Scanner(System.in);
    
    public void setCadena (cadena c){
        System.out.println("*****   BIENVENIDO   *****");
        System.out.println("");
        System.out.println("- Ingrese una frase: ");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        
    }

    public void mostrarVocales (cadena c){
        
    }
