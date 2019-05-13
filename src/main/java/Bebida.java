public class Bebida extends Producto{
    private Double litros;

    public Bebida(String nombre,Double litros,Integer precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Double getLitros() {
        return litros;
    }
}
