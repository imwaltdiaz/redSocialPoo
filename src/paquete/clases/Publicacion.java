package paquete.clases;

import java.util.Random;

public class Publicacion {
  private int id;
  private String autor;
  private String descripcion;
  // private Boolean mayorEdad;



  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  // public Boolean isMayorEdad() {
  //   return this.mayorEdad;
  // }

  // public Boolean getMayorEdad() {
  //   return this.mayorEdad;
  // }

  // public void setMayorEdad(Boolean mayorEdad) {
  //   this.mayorEdad = mayorEdad;
  // }
  

  public void AsignarId(){
    Random rand = new Random();
    this.id = rand.nextInt(200-1+1)+1; 
  }
}
