/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;
import paquete.clases.*;


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author wadia
 */
public class Gestion {
  private Cuenta[] arregloCuentas;
  private int contaCuenta;
  private ArrayList<Publicacion> arregloPublis;

  public Gestion() {
      
    arregloCuentas = new Cuenta[300];
    arregloPublis = new ArrayList<Publicacion>();
    contaCuenta = 0;
  }

  public void Ingresar(Cuenta ref) {
    if (contaCuenta < arregloCuentas.length) {
      arregloCuentas[contaCuenta] = ref;
    } else {
      System.out.println("Ya no hay mas espacio para mas cuentas!");
    }
  }

  public boolean Validar(String usuario, String contrasena) {
    for (Cuenta arregloCuenta : arregloCuentas) {
        return arregloCuenta.getUsuario().equalsIgnoreCase(usuario)
                && arregloCuenta.getContrasena().equalsIgnoreCase(contrasena);
    }
    return false;
  }
  public void IngresarPubli(String texto, String autor){
     Publicacion nuevaPubli = new Publicacion(texto);
     nuevaPubli.AsignarId();
     nuevaPubli.setAutor(autor);
     arregloPublis.add(nuevaPubli);
  }
  public void VerPubli() 
  {
    Scanner sc = new Scanner(System.in);
    Boolean verPublicacion;
    String user;
    String siyno;
    
    System.out.println("¿Desea ver la publicación de un usuario? (Y)(N) ");
    siyno = sc.next();
    
    
    verPublicacion = true;
    if(siyno.equalsIgnoreCase("N"))
    {
        verPublicacion= false;
    }
    
    else
    {
        System.out.println("Ingrese el nombre del usuario que quiere stalkear ");
        user = sc.next();
        for(Publicacion publi : arregloPublis) { 
            if(publi.getAutor().equalsIgnoreCase(user) ){ 
                String autor = publi.getAutor();
                String contenido = publi.getDescripcion();
                System.out.println(autor + " ha publicado:\n" + contenido);
            }
         }
    }
  }
}
