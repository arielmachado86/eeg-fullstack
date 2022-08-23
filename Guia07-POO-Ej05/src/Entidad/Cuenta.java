/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author LMACHADO
 */
public class Cuenta {
    
    private int nCuenta;
    private String Apellido;
    private String Nombre;
    private long DNI;
    private int Sactual;

    public Cuenta() {
    }

    public Cuenta(int nCuenta, String Apellido, String Nombre, long DNI, int Sactual) {
        this.nCuenta = nCuenta;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Sactual = Sactual;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSactual() {
        return Sactual;
    }

    public void setSactual(int Sactual) {
        this.Sactual = Sactual;
    } 

    @Override
    public String toString() {
        return "Cuenta{" + "\nnCuenta=" + nCuenta + ", Apellido=" + Apellido + ", Nombre=" + Nombre + ", DNI=" + DNI + ", Sactual=" + Sactual + '}';
    }
    
    
}
