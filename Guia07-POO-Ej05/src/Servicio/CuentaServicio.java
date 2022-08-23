/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author LMACHADO
 */
public class CuentaServicio {

    public void CrearCuenta(Cuenta cn) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su DNI (sin punto): ");
        cn.setDNI(leer.nextLong());
        System.out.println("Ingrese su Apellido: ");
        cn.setApellido(leer.nextLine());
        cn.setApellido(leer.nextLine());
        System.out.println("Ingrese su Nombre: ");
        cn.setNombre(leer.nextLine());
        cn.setnCuenta((int) (Math.random() * 10 + 1));

    }

    public void Ingresar(Cuenta cn) {
        Scanner leer = new Scanner(System.in);
        double ingreso = 0;
        System.out.println("Indique cuanto dinero depositará: ");
        ingreso = leer.nextDouble();
        cn.setSactual(cn.getSactual() + (int) ingreso);
    }

    public void Retirar(Cuenta cn) {
        Scanner leer = new Scanner(System.in);
        double retiro = 0;
        System.out.println("Indique el monto a retirar: ");
        retiro = leer.nextDouble();
        if (retiro > cn.getSactual()) {
            cn.setSactual(0);
        }

        cn.setSactual(cn.getSactual() - (int) retiro);
    }

    public void ExtRapida(Cuenta cn) {
        Scanner leer = new Scanner(System.in);
        double limite = 0;

        System.out.println("Indique el monto a retirar, recuerde que no debe ser mayor a 20%: ");
        double retiro = leer.nextDouble();

        limite = (cn.getSactual() * 20) / 100;

        while (limite < retiro) {

            System.out.println("El monto solicitado supera el 20%, reingrese por favor: ");
            retiro = leer.nextDouble();
        }

        cn.setSactual(cn.getSactual() - (int) retiro);
    }

    public int consultarSaldo(Cuenta cn) {

        return cn.getSactual();

    }

    public void consultarDatos(Cuenta cn) {

        cn.getnCuenta();
        cn.getDNI();
        cn.getApellido();
        cn.getNombre();
        cn.getSactual();

        System.out.println(cn);

    }
}
