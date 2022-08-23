/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class ServicioLibro {
    public Libro carga (){
        Scanner leer = new Scanner (System.in);
        Libro v = new Libro();
        
        System.out.print("Ingrese nro. de ISBN: ");
        v.setISBN(leer.nextInt());
        System.out.print("Ingrese el título del libro: ");
        leer.next();
        v.setTitulo(leer.nextLine());
        System.out.print("Ingrese el autor: ");
        v.setAutor(leer.nextLine());
        System.out.print("Ingrese la cantidad de páginas: ");
        v.setNpaginas(leer.nextInt());
        
        return v;
    }
    
    public void imprimir(Libro x){
        x.getISBN();
        x.getTitulo();
        x.getAutor();
        x.getNpaginas();
        
        System.out.println(x);
    }
}
