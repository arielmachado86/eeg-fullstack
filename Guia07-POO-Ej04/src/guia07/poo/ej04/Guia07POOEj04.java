/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07.poo.ej04;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class Guia07POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RectanguloServicio v = new RectanguloServicio ();
        Rectangulo v1 = v.CrearRectangulo();
        
        int seleccion = 0;
        String confirmar = "N";
        
        do {
                v.Dibujar(v1);
                System.out.println("");
                System.out.println("********************************");
                System.out.println("            BIENVENIDO          ");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("- SELECCIONE UNA OPERACIÓN");
                System.out.println("");
                System.out.println("    1. CALCULAR SUPERFICIE");
                System.out.println("    2. CALCULAR PERíMETRO");
                System.out.println("    3. SALIR");
                System.out.println("");
                System.out.print(">>>: ");
                seleccion = leer.nextInt();
                leer.nextLine();
                System.out.println("");
                
                switch (seleccion) {
                    case 1:
                        v.Superficie(v1);
                        System.out.println("");
                        break;
                    case 2:
                        v.Perimetro(v1);
                        System.out.println("");
                        break;
                    
                    case 3:
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
