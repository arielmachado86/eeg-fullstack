/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07.poo.ej03;

import Entidad.Operacion;
import Servicio.ServicioOperacion;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class Guia07POOEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioOperacion so = new ServicioOperacion();
        Operacion n = so.CrearOperacion();
       

        int seleccion = 0;
        String confirmar = "N";

        do {
                System.out.println("********************************");
                System.out.println("            BIENVENIDO          ");
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
                        so.Sumar(n);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        so.Restar(n);
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        so.Multiplicar(n);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        so.Dividir(n);
                        System.out.println("");
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
