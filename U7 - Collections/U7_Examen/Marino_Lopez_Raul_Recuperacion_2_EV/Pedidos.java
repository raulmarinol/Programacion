package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pedidos extends Pedido {
    private String fechaPedido;
    private String fechaEntrega;
    private Set<Producto> pedido;
    private int numPedidos;
    static int num=1;

    public Pedidos(String nombre, int cantidad, double precio, String fechaPedido, String fechaEntrega, Set<Producto> pedido) {
        super(nombre, cantidad, precio);
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.pedido = pedido;
        this.numPedidos=num;
        num++;
    }

    public void pedidosRealizados(){
        System.out.println("Los pedidos que se llevan efectuados son: "+numPedidos);
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Set<Producto> getPedido() {
        return pedido;
    }

    public void setPedido(Set<Producto> pedido) {
        this.pedido = pedido;
    }

    public int getNumPedidos() {
        return numPedidos;
    }

    public void setNumPedidos(int numPedidos) {
        this.numPedidos = numPedidos;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Pedidos.num = num;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "fechaPedido='" + fechaPedido + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", pedido=" + pedido +
                ", numPedidos=" + numPedidos +
                '}';
    }
}
