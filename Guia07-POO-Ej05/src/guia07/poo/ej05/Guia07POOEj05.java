/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07.poo.ej05;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class Guia07POOEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaServicio cs = new CuentaServicio ();
        Cuenta c = new Cuenta ();
        int seleccion = 0;
        String confirmar = "N";
        
        do {
 
                System.out.println("");
                System.out.println("********************************");
                System.out.println("            BIENVENIDO          ");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("- SELECCIONE UNA OPERACIÓN");
                System.out.println("");
                System.out.println("    1. CREAR CUENTA NUEVA");
                System.out.println("    2. EXTRACCIÓN");
                System.out.println("    3. EXTRACCIÓN RÁPIDA");
                System.out.println("    4. DEPOSITO");
                System.out.println("    5. CONSULTA DE SALDO");
                System.out.println("    6. CONSULTA DE DATOS");
                System.out.println("    7. SALIR");
                System.out.println("");
                System.out.print(">>>: ");
                seleccion = leer.nextInt();
                leer.nextLine();
                System.out.println("");
                
                switch (seleccion) {
                    case 1:
                        cs.CrearCuenta(c);
                        break;
                    case 2:
                        cs.Retirar(c);
                        break;
                    case 3:
                        cs.ExtRapida(c);
                        break;
                    case 4:
                        cs.Ingresar(c);
                    case 5:
                        System.out.println("Su saldo actual es: "+ cs.consultarSaldo(c));
                        break;
                    case 6:
                        System.out.println("Sus datos de la cuenta son los siguientes: ");
                        cs.consultarDatos(c);
                        break;
                    case 7:
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
