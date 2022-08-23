/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class RectanguloServicio {
    public Rectangulo CrearRectangulo () {
        
        Scanner leer = new Scanner(System.in);
        Rectangulo v = new Rectangulo ();
        System.out.println("Ingrese el valor de la base del rectángulo: ");
        v.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        v.setAltura(leer.nextInt());
        
        return v;
    } 
    
    public void Dibujar (Rectangulo v){
        
        for (int i = 0; i < v.getAltura(); i++) {
            for (int j = 0; j < v.getBase(); j++) {
                if (j == 0 || i == 0 || j == (v.getBase() - 1) || i == (v.getAltura() - 1)) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
    public void Superficie (Rectangulo v){
        
        int superficie = v.getBase() * v.getAltura();
        System.out.println("La superficie del rectángulo es: "+superficie);
    }
    
    public void Perimetro (Rectangulo v){
        
        int Perimetro = (v.getBase() + v.getAltura()) * 2;
        System.out.println("El perímetro del rectánculo es: "+Perimetro);
    }
    
}
