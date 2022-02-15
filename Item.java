public class Item {
  private String nombre;
  private double precio;

  public Item(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getPrecio() {
    return this.precio;
  }
}
