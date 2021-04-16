package Marino_Lopez_Raul_Recuperacion_2_EV;

import java.util.Objects;

public class Producto implements Comparable<Producto>{

    private String nombre;
    private int cantidad;
    private double precio;
    private int cod;
    static int num=1;

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.cod = num;
        num++;
    }

    public void addProducto(Producto p){
        if(this.nombre.equals(p)){
            this.cantidad+=p.cantidad;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Producto.num = num;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", cod=" + cod +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return (int) (this.precio-o.precio);
    }

}
