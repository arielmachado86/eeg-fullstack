/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.ahorcado;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class ahorcadoServicio {
    Scanner leer = new Scanner(System.in);
    String letra;
    int acierto = 0;
    int fallo = 0;
    
    public void crearJuego (ahorcado cJ){
     
        System.out.println("*********************************");
        System.out.println("*     BIENVENIDO AL AHORCADO    *");
        System.out.println("*********************************");
        System.out.println("");
        System.out.println("1). Indique la palabra a buscar: ");
        cJ.setPalabraIngresada(leer.nextLine());
        System.out.println("1). Indique la cantidad de intentos que tendran para adivinarla: ");
        cJ.setIntentos(leer.nextInt());
        System.out.println("*********************************");
        System.out.println("*            INICIEMOS          *");
        System.out.println("*********************************");
        System.out.println("");
        System.out.println(" Intente adivinar la palabra o frase ");
        System.out.println("");
        
        for (int i = 0; i < cJ.getPalabraIngresada().length(); i++) {
            cJ.getPalabraBuscar()[i] = cJ.getPalabraIngresada().substring(i, i+1);
        } 
        cJ.setLetrasEncontradas(0);
    }
    
    public int longitud (ahorcado l){
        int largoFrase = l.getPalabraBuscar().length;
        return largoFrase;
    }
    
    public  void buscarLetra (ahorcado bL){
    
        System.out.println("- Ingrese una letra: ");
        letra = leer.nextLine();
        
        for (int i = 0; i < longitud(bL)-1; i++) {
            if (letra.equals(bL.getPalabraBuscar()[i])) {
                System.out.println("La letra se encuentra en la palabra");
            }else{
                System.out.println("La letra no se encuentra en la palabra");
            }
        }
    }
    
    public void letrasEncontradas (ahorcado le){
       
        for (int i = 0; i < longitud(le)-1; i++) {
            if (letra.equals(le.getPalabraBuscar()[i])) {
                acierto++;
                le.setLetrasEncontradas(acierto);
                System.out.println("Número de letras (encontradas/faltantes): ("+le.getLetrasEncontradas()+"/"+longitud(le));
            }else{
                fallo++;
                le.setIntentos(-fallo);
                System.out.println("Número de letras (encontradas/faltantes): ("+le.getLetrasEncontradas()+"/"+longitud(le));
            }
        }
    }
    
    public void intentos (ahorcado i){
        System.out.println("Oportunidades restantes: "+i.getIntentos()); 
    }
    
    public void juego (ahorcado j){
        
        crearJuego(j);
        while (j.getIntentos() > 0 || acierto != longitud(j) ){
        
            buscarLetra(j);
            System.out.println("Longitud de la frase: "+longitud(j));
            letrasEncontradas(j);
            intentos(j);
        }
    }
            
}
