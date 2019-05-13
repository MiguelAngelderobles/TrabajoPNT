
import java.util.Objects;

public class Producto implements Comparable<Producto>{
    private Integer precio;
    private String nombre;

    public Producto(String nombre,Integer precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public Integer getPrecio(){
        return precio;
    }
    public String getNombre(){
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Objects.equals(precio, producto.precio) &&
                Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio, nombre);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return this.getPrecio().compareTo(o.getPrecio());
    }
}
