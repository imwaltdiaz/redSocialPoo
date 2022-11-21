package paquete.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadia
 */
public abstract class Cuenta {
  protected String usuario, contrasena, publicacion;
  protected int edad;
  protected boolean verPubli, validPubli;

  public Cuenta(String usuario, String contrasena, int edad) {
    this.usuario = usuario;
    this.contrasena = contrasena;
    this.edad = edad;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public boolean isVerPubli() {
    return verPubli;
  }

  public void setVerPubli(boolean verPubli) {
    this.verPubli = verPubli;
  }

  public boolean isValidPubli() {
    return validPubli;
  }

  public void setValidPubli(boolean validPubli) {
    this.validPubli = validPubli;
  }

  public abstract String CrearPubli();

  
}
