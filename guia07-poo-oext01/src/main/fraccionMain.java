/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.fraccion;
import java.util.Scanner;
import servicio.fraccionServicio;

/**
 *
 * @author LMACHADO
 */
public class fraccionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        fraccion f = new fraccion ();
        fraccionServicio fs = new fraccionServicio();
        
        fs.Ingreso(f);
        
        int seleccion = 0;
        String confirmar = "N";

        do {
                System.out.println("********************************");
                System.out.println("             FRACCIONES         ");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("- SELECCIONE UNA OPERACIÓN");
                System.out.println("");
                System.out.println("    1. SUMA");
                System.out.println("    2. RESTA");
                System.out.println("    3. MULTIPLICACIÓN");
                System.out.println("    4. DIVISIÓN");
                System.out.println("    5. SALIR");
                System.out.println("");
                System.out.print(">>>: ");
                seleccion = leer.nextInt();
                leer.nextLine();
                System.out.println("");
                
                switch (seleccion) {
                    case 1:
                        System.out.println("");
                        fs.Sumar(f);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        fs.Restar(f);
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        fs.Multiplicar(f);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        fs.Dividir(f);
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("Usted ha seleccionado SALIR. Esta seguro (S/N): ");
                        confirmar = leer.nextLine();
                        System.out.println(".............. EL PROGRAMA HA FINALIZADO!!! ..............");
                        break;
                }

        } while (confirmar.equalsIgnoreCase("N"));
    }
    
}
