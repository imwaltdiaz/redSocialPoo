/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import java.util.ArrayList;

import paquete.clases.*;

/**
 *
 * @author wadia
 */
public class Gestion {
    private Cuenta[] arregloCuentas;
    private int contaCuenta;
    private ArrayList<Publicacion> arregloPublis;
    
    public Gestion(){
        arregloCuentas = new Cuenta[300];
        contaCuenta = 0;
    }
    public void Ingresar(Cuenta ref){
        if (contaCuenta < arregloCuentas.length) {
            arregloCuentas[contaCuenta] = ref;
        }
        else{
            System.out.println("Ya no hay mas espacio para mas cuentas!");
        }
    }
    public boolean Validar(String usuario, String contrasena){
        for (Cuenta arregloCuenta : arregloCuentas) {
            if (arregloCuenta.getUsuario().equalsIgnoreCase(usuario) && arregloCuenta.getContrasena().equalsIgnoreCase(contrasena)) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
