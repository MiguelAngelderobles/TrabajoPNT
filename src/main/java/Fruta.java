public class Fruta extends Producto{
    private Integer kilo;

    public Fruta(String nombre, Integer precio, Integer kilo) {
        super(nombre, precio);
        this.kilo = kilo;
    }

    public Integer getKilo() {
        return kilo;
    }

}
