package Jara;

public class PrendaColgada extends Prendas implements Doblar,Colgar{

    private double altura;

    public PrendaColgada(int precio, String nombre, int cod_barra, double peso, double altura) {
        super(precio, nombre, cod_barra, peso);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void doblar() {
        System.out.println("La prenda "+this.getNombre()+" no se puede doblar");;
    }
    @Override
    public void colgar() {
        System.out.println("La prenda "+this.getNombre()+" se debe colgar");;
    }

    @Override
    public String toString() {
        return "PrendaColgada{" +
                "altura=" + altura +
                '}';
    }

}
