/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.matematica;

/**
 *
 * @author LMACHADO
 */
public class matematicaServicio {

    public float devolverMayor(matematica m) {
        float mayor, menor;
        if (m.getNum1() > m.getNum2()) {
            mayor = m.getNum1();

        } else {
            mayor = m.getNum2();

        }
        return mayor;
    }

    public int calcularPotencia(matematica p) {
        int redondeo1, redondeo2, potencia;
        if (devolverMayor(p) == p.getNum1()) {

            redondeo1 = Math.round(devolverMayor(p));
            redondeo2 = Math.round(p.getNum2());
            potencia = (int) Math.pow(redondeo1, redondeo2);

        } else {
            redondeo1 = Math.round(devolverMayor(p));
            redondeo2 = Math.round(p.getNum1());
            potencia = (int) Math.pow(redondeo1, redondeo2);
        }

        return potencia;
    }

    public float calcularRaiz(matematica r) {
        float raiz;
        
        if (r.getNum1() < r.getNum2()) {

            float vAbsoluto = Math.abs(r.getNum1());
            raiz = (float) Math.sqrt(vAbsoluto);

        } else {

            float vAbsoluto = Math.abs(r.getNum2());
            raiz = (float) Math.sqrt(vAbsoluto);
        }
        
        return raiz;
    }

}
