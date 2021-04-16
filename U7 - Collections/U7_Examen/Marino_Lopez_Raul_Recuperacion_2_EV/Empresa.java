package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.Set;

public class Empresa extends Pedido {
    private String nombre;

    public Empresa(int id, String fechaPedido, String fechaEntrega, Set<Producto> pedido, String nombre) {
        super(id, fechaPedido, fechaEntrega, pedido);
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", pedido=" + pedido +
                '}';
    }

}
