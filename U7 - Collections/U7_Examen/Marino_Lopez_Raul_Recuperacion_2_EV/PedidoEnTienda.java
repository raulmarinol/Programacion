package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.Set;

public class PedidoEnTienda extends Pedidos{
    private String direccion;

    public PedidoEnTienda(String nombre, int cantidad, double precio, String fechaPedido, String fechaEntrega, Set<Producto> pedido, String direccion) {
        super(nombre, cantidad, precio, fechaPedido, fechaEntrega, pedido);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "PedidoEnTienda{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
