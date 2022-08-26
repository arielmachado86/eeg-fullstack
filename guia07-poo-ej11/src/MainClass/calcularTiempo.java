/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class calcularTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
        int dia,mes,anio,hoy;
        
        System.out.println("Ingrese un dia numerico");
        dia=leer.nextInt();
        System.out.println("Ingrese un mes numerico");
        mes=leer.nextInt();
        System.out.println("Ingrese un año numerico");
        anio=leer.nextInt();
        //por teclado
        Date fecha= new Date(anio-1900,mes-1,dia);
        //la fecha de hoy
        Date fechaHoy=new Date();
        
        hoy=fechaHoy.getYear()-fecha.getYear();
        System.out.println(fecha);
        System.out.println(fechaHoy);
        System.out.println("Tiene "+hoy+" años");
 
    }
    
}
