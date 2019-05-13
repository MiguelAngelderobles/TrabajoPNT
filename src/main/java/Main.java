import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Bebida cocaColaZero=new Bebida("Coca-Cola Zero",1.5,20);
        Bebida cocacola=new Bebida("Cola-Cola",1.5,18);
        ProductoLimpieza shampoo=new ProductoLimpieza("Shampoo Sedal",500,19);
        Fruta frutillas=new Fruta("Frutillas",64,1);

        List<Producto> supermercado=new ArrayList<>();

        supermercado.add(cocaColaZero);
        supermercado.add(cocacola);
        supermercado.add(shampoo);
        supermercado.add(frutillas);

        Producto masCaro = supermercado.stream().max((p1,p2) -> p1.getPrecio().compareTo(p2.getPrecio())).get();
        Producto masBarato = supermercado.stream().min((p1,p2) -> p1.getPrecio().compareTo(p2.getPrecio())).get();

        System.out.println("Producto mas caro: "+masCaro);
        System.out.println("");
        System.out.println("");
        System.out.println("Producto mas barato: "+masBarato);
        System.out.println("");
        System.out.println("");
    }
}
