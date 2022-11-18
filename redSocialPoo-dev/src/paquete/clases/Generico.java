package paquete.clases;

public class Generico<T> {
  private T contenido;

  public void Asignar(T ref) {
    contenido = ref;
  }

  public T Retornar() {
    return contenido;
  }
}
