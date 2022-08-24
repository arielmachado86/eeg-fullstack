/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.persona;
import java.util.Scanner;
import servicio.personaServicio;

/**
 *
 * @author LMACHADO
 */
public class imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        personaServicio ps = new personaServicio();

        persona p1 = new persona();
        persona p2 = new persona();
        persona p3 = new persona();
        persona p4 = new persona();

        //Contadores
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int mayorEdad = 0;
        int menorEdad = 0;

        ps.crearPersona(p1);
        ps.crearPersona(p2);
        ps.crearPersona(p3);
        ps.crearPersona(p4);

        ///Verificación de IMC para 4 personas    
        // Persona 1   
        switch (ps.calcularIMC(p1)) {
            case -1:
                bajoPeso++;
                System.out.println(p1.getNombre() + " esta por debajo de su peso ideal");
                break;
            case 0:
                pesoIdeal++;
                System.out.println(p1.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                sobrePeso++;
                System.out.println(p1.getNombre() + " posee sobre peso");

        }

        //Persona 2
        switch (ps.calcularIMC(p2)) {
            case -1:
                bajoPeso++;
                System.out.println(p2.getNombre() + " esta por debajo de su peso ideal");
                break;
            case 0:
                pesoIdeal++;
                System.out.println(p2.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                sobrePeso++;
                System.out.println(p2.getNombre() + " posee sobre peso");

        }

        //Persona 3
        switch (ps.calcularIMC(p3)) {
            case -1:
                bajoPeso++;
                System.out.println(p3.getNombre() + " esta por debajo de su peso ideal");
                break;
            case 0:
                pesoIdeal++;
                System.out.println(p3.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                sobrePeso++;
                System.out.println(p3.getNombre() + " posee sobre peso");

        }

        //Persona 4
        switch (ps.calcularIMC(p4)) {
            case -1:
                bajoPeso++;
                System.out.println(p4.getNombre() + " esta por debajo de su peso ideal");
                break;
            case 0:
                pesoIdeal++;
                System.out.println(p4.getNombre() + " esta en su peso ideal");
                break;
            case 1:
                sobrePeso++;
                System.out.println(p4.getNombre() + " posee sobre peso");

        }

        //Calcular porcentaje de mayoria y minoria de edad
        //Persona 1
        if (ps.esMayoDeEdad(p1)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }

        //Persona 2
        if (ps.esMayoDeEdad(p2)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }

        //Persona 3
        if (ps.esMayoDeEdad(p3)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }

        //Persona 4
        if (ps.esMayoDeEdad(p4)) {
            mayorEdad++;
        } else {
            menorEdad++;
        }

        //PROMEDIOS
        double promBajoPeso = ((double) bajoPeso * 100) / 4;
        double promPesoIdeal = ((double) pesoIdeal * 100) / 4;
        double promsobrePeso = ((double) sobrePeso * 100) / 4;
        double promMayorEdad = ((double) mayorEdad * 100) / 4;
        double promMenorEdad = ((double) menorEdad * 100) / 4;

        //Devolucuiones
        System.out.println("El porcentaje de personas con bajo peso es %" + promBajoPeso);
        System.out.println("El porcentaje de personas con peso ideal es %" + promPesoIdeal);
        System.out.println("El porcentaje de personas con sobre peso es %" + promsobrePeso);
        System.out.println("El %" + promMayorEdad + " de personas es mayor de edad");
        System.out.println("El %" + promMenorEdad + " de personas es menor de edad");
    }

}
