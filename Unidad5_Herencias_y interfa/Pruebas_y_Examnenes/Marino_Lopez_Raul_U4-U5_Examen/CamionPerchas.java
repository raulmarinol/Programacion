package Jara;

import java.util.Arrays;
import java.util.Comparator;

public class CamionPerchas extends Vehiculos implements Comparator {
    private PrendaColgada [] prendaColgadas = new PrendaColgada[0];
    private int numPrendas=0;

    public int getNumPrendas() {
        return numPrendas;
    }

    public void setNumPrendas(int numPrendas) {
        this.numPrendas = numPrendas;
    }

    public CamionPerchas(String matricula, int cargamax, String nomConductor, PrendaColgada[] prendaColgadas) {
        super(matricula, cargamax, nomConductor);
        this.prendaColgadas = prendaColgadas;
    }

    public PrendaColgada[] getPrendaColgadas() {
        return prendaColgadas;
    }

    public void setPrendaColgadas(PrendaColgada[] prendaColgadas) {
        this.prendaColgadas = prendaColgadas;
    }

    @Override
    public void descargar(int a) {
        System.out.println("Descargando "+a+" Prendas");
    }
    public void addPrendas(PrendaColgada p1){
        Arrays.copyOf(prendaColgadas, prendaColgadas.length+1);
        prendaColgadas[prendaColgadas.length-1]=p1;
        numPrendas++;
    }
    public void deleteCajas(){
        Arrays.copyOf(prendaColgadas,prendaColgadas.length-1);
        numPrendas--;
    }

    @Override
    public String toString() {
        return "CamionPerchas{" +
                "prendaColgadas=" + Arrays.toString(prendaColgadas) +
                ", matricula='" + matricula + '\'' +
                ", cargamax=" + cargamax +
                ", nomConductor='" + nomConductor + '\'' +
                '}';
    }

    @Override

    public int compareTo(PrendaColgada o1,PrendaColgada o2) {
        Arrays.sort(CamionPerchas);
        return ;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return this.numPrendas-numPrendas;
    }
}
