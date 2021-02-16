package Jara;

public class Prendas implements Devolver, Doblar {
    private int precio;
    private String nombre;
    private int cod_barra;
    private double peso;
    private static int cantidad;

    public Prendas(int precio, String nombre, int cod_barra, double peso) {
        this.precio = precio;
        this.nombre = nombre;
        this.cod_barra = cod_barra;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod_barra() {
        return cod_barra;
    }

    public void setCod_barra(int cod_barra) {
        this.cod_barra = cod_barra;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Prendas.cantidad = cantidad;
    }

    public void devolver() {
        System.out.println("Devolviendo la prensa con nombre "+this.nombre+" y precio "+this.precio);
    }
    public void doblar() {
        System.out.println( "La prenda "+this.nombre+" se puede doblar");
    }


    @Override
    public String toString() {
        return "Prendas{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                ", cod_barra=" + cod_barra +
                ", peso=" + peso +
                '}';
    }
}
