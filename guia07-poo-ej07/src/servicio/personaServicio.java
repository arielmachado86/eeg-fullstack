/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.persona;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class personaServicio {
    
    public void crearPersona(persona p) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese sexo (H, M u O): ");
        p.setSexo(leer.nextLine());
        p.setSexo(leer.nextLine());
        
        while (!(p.getSexo().equalsIgnoreCase("h") || p.getSexo().equalsIgnoreCase("m") || p.getSexo().equalsIgnoreCase("o"))) {
            
            System.out.println("Por favor ingrese un valor correcto (H, M u O): ");
            p.setSexo(leer.nextLine());
        }
        
        System.out.println("Ingrese su peso: ");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura:");
        p.setAltura(leer.nextDouble());
    }
    
    public int calcularIMC(persona p){
        double imc = p.getPeso()/(Math.pow (p.getAltura(),2));
        
        if (imc < 20) {
            return -1;   
        }else if (imc >= 20 && imc <= 25) {
            return 0;
        }    
        return 1;
        }
            
    public boolean esMayoDeEdad (persona p){
        if (p.getEdad() < 18) {
            return false;
        }
        
        return true;
    }    
    
}
