/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;



/**
 *
 * @author LMACHADO
 */
public class ahorcado {
    
    private String palabraBuscar[];
    private String palabraIngresada;
    private int letrasEncontradas;
    private int intentos;

    public ahorcado() {
        this.palabraBuscar = new String [palabraIngresada.length()];
    }

    public ahorcado(String[] palabraBuscar, String palabraIngresada, int letrasEncontradas, int intentos) {
        this.palabraBuscar = palabraBuscar;
        this.palabraIngresada = palabraIngresada;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

   
}
