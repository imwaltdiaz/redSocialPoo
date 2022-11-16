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
  public void VerPubli() {    
  }
}
