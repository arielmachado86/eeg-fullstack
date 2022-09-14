/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.poo.ext5;

import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class mesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String mes[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = mes[7];

        System.out.println("*********************************");
        System.out.println("     ADIVINE EL MES SECRETO      ");
        System.out.println("*********************************\n");
        System.out.println("Indique el mes secreto:");
        
            while (true) {
            String ingreso = leer.nextLine().toLowerCase();
            if (!ingreso.equals(mes[7])) {
                System.out.println("No ha acertado. Intentelo nuevamente:");
            } else {
                System.out.println("¡Ha acertado!");
            }
        
    }
}

}
