/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07.poo.ej02;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class Guia07POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCircunferencia r = new ServicioCircunferencia();
        Circunferencia R = r.crearcircunferencia();
        int opc = 0;

        while (opc != 3) {
            System.out.println("********************************");
            System.out.println("            BIENVENIDO          ");
            System.out.println("********************************");
            System.out.println("");
            System.out.println("- SELECCIONE UNA OPERACIÓN");
            System.out.println("");
            System.out.println("    1. Calcular el área de la circunferencia");
            System.out.println("    2. Calcular el perímetro de la circunferencia");
            System.out.println("    3. Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    r.Area(R);
                    break;
                case 2:
                    r.Perimetro(R);
                    break;
            }
        }
    }

}
