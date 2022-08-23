/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class ServicioCircunferencia {

    public Circunferencia crearcircunferencia() {
        Scanner leer = new Scanner(System.in);
        Circunferencia R = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia: ");
        R.setRadio(leer.nextDouble());
        return R;
    }

    public void Area(Circunferencia a) {
        double Area = Math.PI * (Math.pow(a.getRadio(), 2));
        System.out.println("El área de la circunferencia es: " + Area);
    }

    public void Perimetro(Circunferencia a) {
        double Per = 2 * Math.PI * a.getRadio();
        System.out.println("El perímetro de la circunferencia es: "+Per);
    }

}
