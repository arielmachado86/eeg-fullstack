/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.matematica;
import servicio.matematicaServicio;

/**
 *
 * @author LMACHADO
 */
public class matematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matematica m = new matematica();
        matematicaServicio ms = new matematicaServicio();

        m.setNum1((float) Math.random() * 10);
        m.setNum2((float) Math.random() * 10);

        System.out.println("Número 1: " + m.getNum1());
        System.out.println("Número 2: " + m.getNum2());
        System.out.println("");
        System.out.println("El mayor de ambos es: " + ms.devolverMayor(m));
        System.out.println("La potencia del mayor por el menor es: "+ms.calcularPotencia(m));
        System.out.println("La raíz cuadrada del menor es: "+ms.calcularRaiz(m));

    }

}
