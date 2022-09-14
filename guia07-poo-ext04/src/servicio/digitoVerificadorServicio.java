/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.digitoVerificador;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class digitoVerificadorServicio {
    Scanner leer = new Scanner(System.in);
    
    public String crearNIF (digitoVerificador cN){
                
        int resto = cN.getDni() % 23;
        String nif = "";
        String vectorVerificador[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        for (int i = 0; i < 23; i++) {
            if (resto == i) {
                nif = vectorVerificador[i];
            }
        }
        
        return nif;
    }
    
    public void mostrar (digitoVerificador m) {
        System.out.print("SU NIF ES >>> ");
        System.out.println(m.getDni()+"-"+crearNIF(m));
    }
            
}
