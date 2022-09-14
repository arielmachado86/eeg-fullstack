/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.fraccion;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class fraccionServicio {

    Scanner leer = new Scanner(System.in);

    public void Ingreso(fraccion ing) {
        System.out.println("********************************");
        System.out.println("            BIENVENIDO          ");
        System.out.println("********************************");
        System.out.println("");
        System.out.println("- Ingrese la primer fracción.");
        System.out.println("- Primero el numerador: ");
        ing.setNumerador1(leer.nextInt());
        System.out.println("- Ahora el denominador: ");
        ing.setDenominador1(leer.nextInt());
        System.out.println("- Ingrese la segunda fracción.");
        System.out.println("- Primero el numerador: ");
        ing.setNumerador2(leer.nextInt());
        System.out.println("- Ahora el denominador: ");
        ing.setDenominador2(leer.nextInt());
        System.out.println("Las fracciones ingresadas son: [" + ing.getNumerador1() + "/" + ing.getDenominador1() + "] - [" + ing.getNumerador2() + "/" + ing.getDenominador2() + "]");
    }

    public void Sumar(fraccion sum) {
        int sumNum = 0;
        int sumDen = 0;

        if (sum.getDenominador1() == sum.getDenominador2()) {
            sumNum = sum.getNumerador1() + sum.getNumerador2();
            System.out.println("El resultado de la suma es: " + sumNum + "/" + sum.getDenominador1());
        } else {
            sumDen = sum.getDenominador1() * sum.getDenominador2();
            sumNum = (sum.getNumerador1() * sum.getDenominador2() + (sum.getNumerador2() * sum.getDenominador1()));
            System.out.println("El resultado de la suma es: " + sumNum + "/" + sumDen);
        }
    }

    public void Restar(fraccion res) {
        int resNum = 0;
        int resDen = 0;

        if (res.getDenominador1() == res.getDenominador2()) {
            resNum = res.getNumerador1() + res.getNumerador2();
            System.out.println("El resultado de la resta es: " + resNum + "/" + res.getDenominador1());
        } else {
            resDen = res.getDenominador1() * res.getDenominador2();
            resNum = (res.getNumerador1() * res.getDenominador2() - (res.getNumerador2() * res.getDenominador1()));
            System.out.println("El resultado de la resta es: " + resNum + "/" + resDen);
        }
    }
    
    public void Multiplicar(fraccion mult){
        System.out.println("El resultado de la multiplicación es: "+mult.getNumerador1() * mult.getNumerador2()+"/"+mult.getDenominador1() * mult.getDenominador2());         
    }
    
    public void Dividir(fraccion div){
        System.out.println("El resultado de la división es: " + div.getNumerador1() * div.getDenominador2() + "/" + div.getDenominador1()* div.getNumerador2());
    }
        

}
