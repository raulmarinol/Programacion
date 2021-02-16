package Jara;

import java.util.Arrays;

public class Cajas {

    private int contenido=0;
    private Prendas [] prendas = new Prendas[0];

    public Cajas(int contenido) {
        this.contenido = contenido;
    }


    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public void addPrendas(Prendas p1){
        if (prendas.length<6){
            Arrays.copyOf(prendas,prendas.length+1);
            prendas[prendas.length-1]=p1;
        }
        System.out.println("La caja esta al completo");
    }
    public void deletePrendas(Prendas p1){
        Prendas[] aux = new Prendas[prendas.length-1];
        int j =0;
        for (int i = 0; i < prendas.length; i++) {
            if (!p1.equals(this.prendas)) {
            aux[j]=prendas[i];
            j++;
            }
        }
        Prendas [] prendas = aux;
    }

    @Override
    public String toString() {
        return "Cajas{" +
                "capacidadmax=" +
                ", contenido=" + contenido +
                '}';
    }
}
