/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gabrielcuray
 */
public class CuentaKids extends Cuenta implements Gusto {
  private int[] gusto;

  public CuentaKids(String usuario, String contrasena, int edad) {
    super(usuario, contrasena, edad);
    gusto = new int[3];
  }

  public int[] getGusto() {
    return gusto;
  }

  public void setGusto(int[] Gusto) {
    this.gusto = Gusto;
  }

  @Override
  public String CrearPubli() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Desea ingresar una publicación. (Y)(N)");
    String valid;
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
  public void MarcarGustos() {

    Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        StringBuffer sb = new StringBuffer("Ha escogido: ");
        
        System.out.println("1. Juegos" +
                           "\n2. Libros" +
                           "\n3. Cine" +
                           "\n4. Salir");
        
        for(int i=0;i<=2;i++)
        {
            System.out.println("Escoge al menos una opción");
            opcion = sc.nextInt();
            if (opcion==1)
            {
                System.out.println("Has seleccionado Juegos");
                sb.append("\nJuegos");
            }
            else if(opcion==2)
            {
                System.out.println("Has seleccionado Libros");
                sb.append("\nLibros");
            }
            else if(opcion==3)
            {
                System.out.println("Has seleccionado Cine");
                sb.append("\nCine");
            }
            else if(opcion==4)
            {
                System.out.println(sb.toString());
                break;
            }
        }
  }

}
