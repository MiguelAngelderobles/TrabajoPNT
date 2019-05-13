
public class ProductoLimpieza extends Producto{
    private Integer contenido;

    public ProductoLimpieza(String nombre,Integer contenido, Integer precio) {
        super(nombre, precio);
        this.contenido=contenido;
    }

    public Integer getContenido() {
        return contenido;
    }
}