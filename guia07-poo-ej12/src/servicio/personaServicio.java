/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class personaServicio {
    
    public void crearPersona (persona cP){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("**** BIENVENIDO ****");
        System.out.println("");
        System.out.println("Ingrese su nombre: ");
        cP.setNombre(leer.nextLine());
        System.out.println("A continuacion ingrese su fecha de nacimiento");
        System.out.println("Primero el dìa: ");
        int dia = leer.nextInt();
        System.out.println("Seguido del mes: ");
        int mes = leer.nextInt();
        System.out.println("Y por último el año: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        cP.setfNacimiento(fecha);
    }
    
    public  int  calcularEdad (persona cE) {
        Date fechahoy = new Date ();
        //int calcTiempo;
        int calcTiempo = fechahoy.getYear() - cE.getfNacimiento().getYear();
        
        return calcTiempo;
    }
    
    public boolean menorQue (persona p){
        //int edad1 = calcularEdad(p);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad de su amigo: ");
        int edad2 = leer.nextInt();
        System.out.println("Su amigo es menor que usted?...");
        if (edad2 > calcularEdad(p)) {
            return false;
        }else {
            return true;
        }
    }
    
    public String mostrarPersona (persona mp){
        
        return mp.toString();
    }
}
