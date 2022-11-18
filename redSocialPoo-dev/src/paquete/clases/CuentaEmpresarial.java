/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

import java.util.Scanner;

/**
 *
 * @author gabrielcuray
 */
public class CuentaEmpresarial extends Cuenta{

    public CuentaEmpresarial(String usuario, String contrasena, int edad) {
        super(usuario, contrasena, edad);
    }
  public String CrearPubli() {
    String valid;
    Scanner sc = new Scanner(System.in);
    System.out.println("Desea ingresar una publicación. (Y)(N)");
    valid = sc.next();

    if (valid.equalsIgnoreCase("Y")) {
      this.validPubli = true;
    }

    if (this.validPubli = true) {
      System.out.println("Ingrese su publicación");
      this.publicacion = sc.next();
    }
    return publicacion;
  }

  @Override
  public void VerPubli() 
  {
    Scanner sc = new Scanner(System.in);
    Boolean verPubli;
    String user;
    String siyno;
    
    System.out.println("¿Desea ver la publicación de un usuario? (Y)(N) ");
    siyno = sc.next();
    
    
    verPubli = true;
    if(siyno.equalsIgnoreCase("N"))
    {
        this.verPubli= false;
    }
    
    else
    {
        System.out.println("Ingrese el nombre del usuario que quiere stalkear ");
        user = sc.next();
        if(user.equals(this.usuario))
        {
            System.out.println(this.publicacion);
        }
    }
  }
}
