/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.digitoVerificador;
import java.util.Scanner;
import servicio.digitoVerificadorServicio;

/**
 *
 * @author LMACHADO
 */
public class digitoVerificadoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        digitoVerificador dV = new digitoVerificador();
        digitoVerificadorServicio dVS = new digitoVerificadorServicio();
        
        System.out.println("*********************************");
        System.out.println("*          BIENVENIDO           *");
        System.out.println("*********************************");
        System.out.println("");
        System.out.println("* Ingrese su nro. de DNI (sin puntos): ");
        dV.setDni(leer.nextInt());
        dVS.mostrar(dV);
        
    }
    
}
