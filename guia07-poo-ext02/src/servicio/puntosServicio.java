/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.puntos;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class puntosServicio {

    public void crearPuntos(puntos p) {
        Scanner leer = new Scanner(System.in);

        System.out.println("- Por favor ingrese las cordenadas de los extremos");
        System.out.println("1. Coordenadas extremo 1");
        System.out.println("X1: ");
        p.setX1(leer.nextInt());
        System.out.println("Y1: ");
        p.setY1(leer.nextInt());
        System.out.println("2. Coordenadas extremo 2");
        System.out.println("X2: ");
        p.setX2(leer.nextInt());
        System.out.println("Y2: ");
        p.setY2(leer.nextInt());
    }

    public double calcularDistancia(puntos d) {
        double distancia = Math.sqrt(Math.pow(d.getX2() - d.getX1(), 2) + Math.pow(d.getY2() - d.getY1(), 2));
        return distancia;
    }

}
