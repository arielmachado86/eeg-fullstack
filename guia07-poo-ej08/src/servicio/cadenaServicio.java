/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.cadena;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class cadenaServicio {
    Scanner leer = new Scanner(System.in);
    
    public void setCadena (cadena c){
        System.out.println("********************************");
        System.out.println("            BIENVENIDO          ");
        System.out.println("********************************");
        System.out.println("");
        System.out.println("- Ingrese una frase: ");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        
    }

    public int mostrarVocales (cadena c){
        String frase = c.getFrase().toLowerCase();
        int vocales = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.substring(i,i+1).equals("a") || frase.substring(i,i+1).equals("e") || frase.substring(i,i+1).equals("i") || frase.substring(i,i+1).equals("o") || frase.substring(i,i+1).equals("u")){
                vocales++;
            }    
        }
     
        return vocales;
    }
    
    public String invertirFrase (cadena iF) {
        char vectorAux [] = iF.getFrase().toCharArray();
        String invertir = "";
        for (int i = iF.getLongitud()-1; i >= 0; i--) {
            invertir += vectorAux[i];
        }
        return invertir;
    }
    
    public void vecesRepetido (cadena vR){
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el caracter que desea buscar: ");
        String letra = leer.nextLine();
        int cont = 0;
        
        for (int i = 0; i < vR.getLongitud(); i++) {
            if (vR.getFrase().substring(i, i+1).equals(letra)) {
                cont++;
            }
        }
        System.out.println("FRASE = "+vR.getFrase());
        System.out.println("CARACTER = "+letra);
        System.out.println("SE REPITE "+cont+" VECES...");
    }
    
    public void compararLongitud (cadena cL) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una nueva frase para comparar su longitud: ");
        String newFrase = leer.nextLine();
        int largo = newFrase.length();
        int diferencia = 0;
        if (largo == cL.getLongitud()) {
            System.out.println("La frases tienen la misma cantidad de caracteres!");
        }else if (largo > cL.getLongitud()) {
            diferencia = largo - cL.getLongitud();
            System.out.println("La frase que acaba de ingresar es más larga que la inicial por "+diferencia+" caracteres.");
        }else if (largo < cL.getLongitud()) {
            diferencia = cL.getLongitud() - largo;
            System.out.println("La frase que acaba de ingresar es más corta que la inicial por "+diferencia+" caracteres.");
        }
    }
    
    public String unirFrases (cadena uF){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase que desea unir o adicional a la inicial: ");
        String nuevaFrase = leer.nextLine();
        String addFrases = uF.getFrase().concat(nuevaFrase); 
        return addFrases;
    }
    
    public void reemplazar (cadena r){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique el caracter de la frase que desea reemplazar: ");
        String caracterFrase = leer.nextLine();
        System.out.println("Ahora por cual será reemplazado: ");
        String  caracterReemplazo = leer.nextLine();
        String vectorAux [] = new String [r.getLongitud()];
        System.out.print("Frase original: ");
        for (int i = 0; i < r.getLongitud() ; i++) {
            vectorAux[i] = r.getFrase().substring(i, i+1);
            
            System.out.print(vectorAux[i]);
        }
        System.out.println("");
        System.out.print("Frase modificada: ");
        for (int i = 0; i < r.getLongitud(); i++) {
            if (vectorAux[i].equals(caracterFrase)) {
                vectorAux[i] = caracterReemplazo;
                System.out.print(vectorAux[i]);
            }
            else {
                System.out.print(vectorAux[i]);
            }
        }
        System.out.println("");
    }
    
    public boolean contiene (cadena c){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique que caracter desea buscar en la frase: ");
        String caracterBuscar = leer.nextLine();
        boolean comprobar = false;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if (caracterBuscar.equals(c.getFrase().substring(i, i+1))) { 
               comprobar = true;
               break;
            }
        }
        return comprobar;
    }

}    
    
