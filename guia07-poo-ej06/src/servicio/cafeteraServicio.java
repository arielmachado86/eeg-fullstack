/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.cafetera;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class cafeteraServicio {

    public void llenarCafetera(cafetera c){

        c.setCantidadActual(c.getCapacidadMaxima());
    }

    public void servirTaza(cafetera c) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Indique el tamaño de la taza (ml): ");
        int tamtaza = leer.nextInt();

        if (tamtaza <= c.getCantidadActual()) {
            c.setCantidadActual(c.getCantidadActual() - tamtaza);
        } else {
            System.out.println("Se sirvió " + c.getCantidadActual() + " ml de café, que fue el restante actual en la cafetera... ");
            c.setCantidadActual(0);
        }
       
    }

    public void vaciarCafetera(cafetera c) {
        c.setCantidadActual(0);
    }

    public void agregarCafe(cafetera c) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indica la cantidad de cafe que desea agregar: ");
        int cantidadCafe = leer.nextInt();
        if (cantidadCafe < c.getCapacidadMaxima()) {
            c.setCantidadActual(cantidadCafe);
        }
        else {
            System.out.println("Excede la capacidad máxima de la cafetera, ingrese un valor que no supere "+c.getCapacidadMaxima()+" :");
            cantidadCafe = leer.nextInt();
            c.setCantidadActual(cantidadCafe);
        }
    }
}
