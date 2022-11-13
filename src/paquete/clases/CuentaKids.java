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
public class CuentaKids extends Cuenta implements Gusto
{
    private int[] gusto;

    public CuentaKids() 
    {
        gusto=new int[3];
    }

    public int[] getGusto() {
        return gusto;
    }

    public void setGusto(int[] Gusto) {
        this.gusto = Gusto;
    }
     
    
    
    
    
    
    
    @Override
    public void CrearPubli() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea ingresar una publicación. (Y)(N)");
        String valid;
        valid = sc.next();
        if(valid.equalsIgnoreCase("Y"))
        {
            this.validPubli=true;
        } 
        
        if (this.validPubli = true)
        {
          System.out.println("Ingrese su publicación");
          this.publicacion = sc.next();
        }
        
        
    }

    @Override
    public void VerPubli() 
    {
        
    }

    @Override
    public void MarcarGustos() 
    {
        
        
        System.out.print("Ingrese sus gustos"
                + "\n1. Juegos"
                + "\n2. Libros"
                + "\n3. Cine");
        
        for (int i=0;i<gusto.length;i++)
        {
            
            Scanner sc = new Scanner(System.in);
            
        }
        
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        StringBuffer sb = new StringBuffer("Ha escogido: ");
 
        while (!salir) {
 
            System.out.println("1. Juegos");
            System.out.println("2. Libros");
            System.out.println("3. Cine");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Juegos");
                        sb.append("\nJuegos");
                        break;
                    case 2:
                        System.out.println("Has seleccionado Libros");
                        sb.append("\nLibros");
                        break;
                    case 3:
                        System.out.println("Has seleccionado Cine");
                        sb.append("\nCine");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                   
                        
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }
        System.out.println(sb.toString());
    }
    
}
