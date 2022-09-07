/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.raices;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class raicesServicios {

    public void solicitarValores(raices v) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        v.setA(leer.nextInt());
        System.out.println("Ingrese el valor de B:");
        v.setB(leer.nextInt());
        System.out.println("Ingrese el valor de C:");
        v.setC(leer.nextInt());
    }

    public boolean tieneRaices(raices r) {
        if (r.getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(raices r) {
        if (r.getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices(raices oR) {

        if (tieneRaices(oR)) {
            double x1 = -oR.getB() + Math.sqrt(Math.pow(oR.getB(), 2) - (4 * oR.getA() * oR.getB()));
            double x2 = oR.getB() + Math.sqrt(Math.pow(oR.getB(), 2) - (4 * oR.getA() * oR.getB()));
            System.out.println("La primera solución es: " + x1);
            System.out.println("La segunda solución es: " + x2);
        }     
    }
    
    public void obtenerRaiz(raices oR) {
        
        if (tieneRaiz(oR)){
            double x = oR.getB() + Math.sqrt(Math.pow(oR.getB(), 2) - (4 * oR.getA() * oR.getB()));              
            System.out.println("La solución es: "+x);
        }
    }
    
    public void calcular (raices c){
        if (c.getDiscriminante() > 0) {
            obtenerRaices(c);
        }
        if (c.getDiscriminante() == 0) {
            obtenerRaiz(c);
        }
        if (c.getDiscriminante() < 0) {
            System.out.println("La ecuación no posee solución real posible...");
        }
            
    }
}
