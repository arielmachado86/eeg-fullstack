/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class ServicioOperacion {
    public Operacion CrearOperacion (){
        
        Operacion n = new Operacion ();
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número: ");
        n.setNum1(leer.nextInt());
        System.out.println("A continuación ingrese el segundo número: ");
        n.setNum2(leer.nextInt());
        
        return n;
    }
    
    public void Sumar(Operacion n ){
        int Sumar = n.getNum1() + n.getNum2();
        System.out.println("El resultado de la suma entre ambos nros es: "+ Sumar);
    }
    
    public void Restar(Operacion n){
        int Restar = n.getNum1() - n.getNum2();
        System.out.println("El resultado de la resta entre ambos nros es: "+ Restar);
    }
    
    public void Multiplicar(Operacion n){
        if (n.getNum1() == 0 || n.getNum2() == 0) {
            System.out.println("El resultado de la multiplicación entre ambos nros es: 0");
        }else {
            int Multiplicar = n.getNum1() * n.getNum2();
            System.out.println("El resultado de la multiplicación entre ambos nros es: "+ Multiplicar);  
        }
    }
    
    public void Dividir(Operacion n){
        if (n.getNum1() == 0 || n.getNum2() == 0) {
            System.out.println("El resultado de la división entre ambos nros es: 0");
        }else {
            int Dividir = n.getNum1() / n.getNum2();
            System.out.println("El resultado de la división entre ambos nros es: "+ Dividir);  
        }
}
}
