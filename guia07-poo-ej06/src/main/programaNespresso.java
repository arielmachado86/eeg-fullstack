/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.cafetera;
import java.util.Scanner;
import servicio.cafeteraServicio;

/**
 *
 * @author LMACHADO
 */
public class programaNespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cafeteraServicio cs = new cafeteraServicio ();
        cafetera c = new cafetera ();
        
        int seleccion = 0;
        String confirmar = "N";
        
        do {
 
                System.out.println("");
                System.out.println("***********NESPRESSO************");
                System.out.println("********************************");
                System.out.println("            BIENVENIDO          ");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("- SELECCIONE UNA OPERACIÓN");
                System.out.println("");
                System.out.println("    1. LLENAR CAFETERA");
                System.out.println("    2. SERVIR TAZA");
                System.out.println("    3. VACIAR CAFETERA");
                System.out.println("    4. AGREGAR CAFÉ");
                System.out.println("    5. SALIR");
                System.out.println("");
                System.out.print(">>>: ");
                seleccion = leer.nextInt();
                leer.nextLine();
                System.out.println("");
                
                switch (seleccion) {
                    case 1:
                        cs.llenarCafetera(c);
                        break;
                    case 2:
                        cs.servirTaza(c);
                        break;
                    case 3:
                        cs.vaciarCafetera(c);
                        break;
                    case 4:
                        cs.agregarCafe(c);
                        break;
                    case 5:
                        System.out.println("");
                        System.out.println("Usted ha seleccionado SALIR. Esta seguro (S/N): ");
                        confirmar = leer.nextLine();
                        confirmar = confirmar.toUpperCase();
                        System.out.println(".............. EL PROGRAMA HA FINALIZADO!!! ..............");
                        break;
                }

        } while (confirmar.equals("N"));
    }
    
}
