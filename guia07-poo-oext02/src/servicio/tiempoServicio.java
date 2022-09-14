/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author LMACHADO
 */
public class tiempoServicio {
    
    public void reproducir(int duracion) {
    int horas = 00;
    int minutos = 00;
    int segundos = 00;
    final int N = 59;
    int i;

    for (i = 0; i <= duracion; i++) {
        if (segundos == N) {
            segundos = 0;
            minutos++;
        }

        if (minutos == N) {
            minutos = 0;
            horas++;
        }
        segundos++;
        System.out.printf("\n%02d:%02d:%02d - ", horas, minutos, segundos);
    }
    System.out.print("Fin de la reproducción");
}
}
