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
public class digitoVerificador {
    
    private Integer dni;
    private String letra;

    public digitoVerificador() {
    }

    public digitoVerificador(Integer dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
}
