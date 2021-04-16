package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Casco", 1,12);
        Producto producto2 = new Producto("Pantalón", 1, 30);
        Producto producto3 = new Producto("Chaqueta", 2, 20);
        Producto producto4 = new Producto("Casco", 1,12);

        Set<Producto> pedido1 = new LinkedHashSet<>();


        pedido1.add(producto1);
        pedido1.add(producto2);
        pedido1.add(producto3);
        pedido1.add(producto4);


        Set<Producto> pedido2 = new LinkedHashSet<>();

        pedido2.add(producto1);
        pedido2.add(producto2);
        pedido2.add(producto3);
        pedido2.add(producto4);

        System.out.println(producto1);
        System.out.println(producto3);

        System.out.println(pedido1);

        List<Producto> pedidoaux = (List<Producto>) pedido1;

        Collections.sort(pedidoaux);

        System.out.println(pedidoaux);


    }


}
