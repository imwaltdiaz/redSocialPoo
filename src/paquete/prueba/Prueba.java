/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.prueba;

import java.util.Scanner;
import paquete.clases.*;
import paquete.gestion.*;

/**
 *
 * @author wadia
 */
public class Prueba {
  public static void main(String[] args) {
    // Bienvenida
    System.out.println("Hola!\nBienvenido a RealText, expresa tus ideas libremente\n");
    System.out.println("Selecciona tu opción:\n\n1)Iniciar Sesión\n2)Crear cuenta");

    // Iniciamos objeto Gestion
    Gestion objG = new Gestion();
    // Objeto de muestra

    CuentaPersonal objM = new CuentaPersonal("Alan", "Garcia", 40);
    objG.Ingresar(objM);
    //Publicacion de muestra
    Publicacion objP = new Publicacion("Esta es mi primera publicacion");
    objG.IngresarPubli("Esta es mi primera publicacion", "Alan");
    
    
    // Opciones
    System.out.println("Opcion: ");
    Scanner sc = new Scanner(System.in);
    int opcionElegida = sc.nextInt();
    switch (opcionElegida) {
      case 1:
        System.out.println("Elegiste Iniciar Sesión");
        break;
      case 2:
        System.out.println("Elegiste Crear Cuenta");
        break;
      default:
        System.out.println("Ingrese una opcion valida por favor");
        break;
    }

    // Iniciar sesión
    if (opcionElegida == 1) {
      System.out.println("Ingrese nombre de usuario: ");
      String usuario = new Scanner(System.in).nextLine();

      System.out.println("Ingrese contrasena: ");
      String contrasena = new Scanner(System.in).nextLine();
      
      boolean val = objG.Validar(usuario, contrasena);
      
      if (val) {
        System.out.println("Bienvenido " + usuario);
        System.out.println("Que desea hacer?:\n\t1)Crear publicacion\n\t2)Ver publicacion\n\t0)Salir");
        int actividad = new Scanner(System.in).nextInt();
       
        while(actividad != 0){
          
                if (actividad == 1) {
               String texto = objM.CrearPubli();
               System.out.println("Tu publicacion es: " + texto);
               objG.IngresarPubli(texto, usuario);
                System.out.println("Listo! ");
                System.out.println("Que deseas hacer?\n1)Crear otra publicacion\n2)Ver Publicaciones\n0)Salir");
                actividad = new Scanner(System.in).nextInt();
            } else if (actividad == 2) {
                objG.VerPubli();
                actividad = 0;
            }
        }
      } else {
        System.out.println("Usuario o contraseña incorrecta");
      }

    }

    // Crear
    if (opcionElegida == 2) {
      // Cuenta nuevaCuenta = new Cuenta();
      System.out.println("Ingrese nombre de usuario: ");
      String usuario = new Scanner(System.in).nextLine();
      System.out.println(usuario);

      System.out.println("Ingrese contrasena: ");
      String contrasena = new Scanner(System.in).nextLine();
      System.out.println("Ingrese edad: ");
      int edad = new Scanner(System.in).nextInt();
      if (edad >= 18) {
        System.out.println("¿Desea una cuenta personal o empresarial?\n");
        System.out.println("1)Cuenta personal\n2)Cuenta empresarial");
        int tipoCuenta = new Scanner(System.in).nextInt();
        if (tipoCuenta == 1) {
          CuentaPersonal obj1 = new CuentaPersonal(usuario, contrasena, edad);
          System.out.println("Hay que conocernos mejor!");
          obj1.MarcarGustos();
          System.out.println("Que desea hacer?:\n\t1)Crear publicacion\n\t2)Ver publicacion\n\t0)Salir");
            int actividad = new Scanner(System.in).nextInt();

            while(actividad != 0){

                    if (actividad == 1) {
                   String texto = objM.CrearPubli();
                   System.out.println("Tu publicacion es: " + texto);
                   objG.IngresarPubli(texto, usuario);
                    System.out.println("Listo! ");
                    System.out.println("Que deseas hacer?\n1)Crear otra publicacion\n2)Ver Publicaciones\n0)Salir");
                    actividad = new Scanner(System.in).nextInt();
                } else if (actividad == 2) {
                    objG.VerPubli();
                    System.out.println("Que deseas hacer?\n1)Crear otra publicacion\n2)Ver Publicaciones\n0)Salir");
                    actividad = new Scanner(System.in).nextInt();
                }
            }

            } else if (tipoCuenta == 2) {
              System.out.println("Elegiste cuenta empresarial");
            }
      }
      if (edad < 18) {
        System.out.println("Eres cuenta kids!");
        CuentaKids obj3 = new CuentaKids(usuario, contrasena, edad);
        // Ingresar gustos abajo
        obj3.MarcarGustos();

      }
    }
    
  }
}
