package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Pedido extends Producto {

    private int id;
    static int num;


    public Pedido(String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
        this.id = num;
        num++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                '}';
    }
}
