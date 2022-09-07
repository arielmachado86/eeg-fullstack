/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.cadena;
import java.util.Scanner;
import servicio.cadenaServicio;

/**
 *
 * @author LMACHADO
 */
public class cadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cadena c = new cadena ();
        cadenaServicio cs = new cadenaServicio ();
        cs.setCadena(c);
        
        int seleccion = 0;
        String confirmar = "N";
        
        do {
                System.out.println("");
                System.out.println("********************************");
                System.out.println("            COMENCEMOS          ");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("- SELECCIONE UNA OPCION");
                System.out.println("");
                System.out.println("    1. CONTABILIZAR VOCALES EN LA FRASE");
                System.out.println("    2. INVERTIR FRASE");
                System.out.println("    3. BUSCAR Y CONTABILIZAR EL CARACTER INDICADO EN LA FRASE");
                System.out.println("    4. COMPARAR LONGITUD CON OTRA FRASE");
                System.out.println("    5. UNIR FRASE CON OTRA ADICIONAL");
                System.out.println("    6. REEMPLAZAR UN CARACTER SELECCIONADO POR OTRO DESEADO");
                System.out.println("    7. BUSCAR UN CARACTER EN LA FRASE");
                System.out.println("    8. SALIR");
                System.out.println("");
                System.out.print(">>>: ");
                seleccion = leer.nextInt();
                leer.nextLine();
                System.out.println("");
                
                switch (seleccion) {
                    case 1:
                        System.out.println("La frase tiene "+cs.mostrarVocales(c)+" vocales");
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Frase ingresada: "+c.getFrase());
                        System.out.println("");
                        System.out.println("Frase invertida: "+cs.invertirFrase(c));
                        System.out.println("");
                        break;
                    case 3:      
                        cs.vecesRepetido(c);
                        System.out.println("");
                        break;
                    case 4:
                        cs.compararLongitud(c);
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("Resultado: "+cs.unirFrases(c));
                        System.out.println("");
                        break;
                    case 6:
                        cs.reemplazar(c);
                        System.out.println("");
                        break;  
                    case 7:
                        System.out.println("La Frase contiene el caracter seleccionado: "+cs.contiene(c));
                        System.out.println("");
                        break;    
                    case 8:
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
