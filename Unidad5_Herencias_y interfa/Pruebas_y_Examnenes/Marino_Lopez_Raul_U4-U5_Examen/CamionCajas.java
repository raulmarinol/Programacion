package Jara;

import java.util.Arrays;

public class CamionCajas extends Vehiculos {
    private Cajas [] cajas =new Cajas[0];
    private int numCajas=0;

    public CamionCajas(String matricula, int cargamax, String nomConductor, Cajas[] cajas) {
        super(matricula, cargamax, nomConductor);
        this.cajas = cajas;
    }

    public Cajas[] getCajas() {
        return cajas;
    }

    public void setCajas(Cajas[] cajas) {
        this.cajas = cajas;
    }
    public void addCajas(Cajas c1){
        Arrays.copyOf(cajas, cajas.length+1);
        cajas[cajas.length-1]=c1;
        numCajas++;
    }
    public void deleteCajas(){
        Arrays.copyOf(cajas,cajas.length-1);

    }

    public int getNumCajas() {
        return numCajas;
    }

    public void setNumCajas(int numCajas) {
        this.numCajas = numCajas;
    }

    public void descargar(int a) {
        System.out.println("Descargando "+a+" Prendas");
        numCajas--;
    }

    @Override
    public String toString() {
        return "CamionCajas{" +
                "cajas=" + Arrays.toString(cajas) +
                ", matricula='" + matricula + '\'' +
                ", cargamax=" + cargamax +
                ", nomConductor='" + nomConductor + '\'' +
                '}';
    }
}
