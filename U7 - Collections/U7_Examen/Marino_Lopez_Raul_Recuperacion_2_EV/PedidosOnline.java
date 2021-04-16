package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.Set;

public class PedidosOnline extends Pedidos implements Log{

    private String ip;
    private Metodo metodo;

    public PedidosOnline(String nombre, int cantidad, double precio, String fechaPedido, String fechaEntrega, Set<Producto> pedido, String ip, Metodo metodo) {
        super(nombre, cantidad, precio, fechaPedido, fechaEntrega, pedido);
        this.ip = ip;
        this.metodo = metodo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }


    @Override
    public String toString() {
        return "PedidosOnline{" +
                "ip='" + ip + '\'' +
                ", metodo=" + metodo +
                '}';
    }


    @Override
    public String printLog() {
        return "La fecha de pedido: "+PedidosOnline.super.getFechaPedido()+" Metodo de pago: "+PedidosOnline.this.metodo
                +" Suma total: ";
    }
}
