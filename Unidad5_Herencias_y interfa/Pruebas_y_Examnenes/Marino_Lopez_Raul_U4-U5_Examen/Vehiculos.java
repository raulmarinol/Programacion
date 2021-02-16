package Jara;

public abstract class Vehiculos {
    protected String matricula;
    protected int cargamax;
    protected String nomConductor;

    public Vehiculos(String matricula, int cargamax, String nomConductor) {
        this.matricula = matricula;
        this.cargamax = cargamax;
        this.nomConductor = nomConductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargamax() {
        return cargamax;
    }

    public void setCargamax(int cargamax) {
        this.cargamax = cargamax;
    }

    public String getNomConductor() {
        return nomConductor;
    }

    public void setNomConductor(String nomConductor) {
        this.nomConductor = nomConductor;
    }
    public void descargar(int num,int cajas){

    }
    public void descargar(int prendas){

    }


    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula='" + matricula + '\'' +
                ", cargamax=" + cargamax +
                ", nomConductor='" + nomConductor + '\'' +
                '}';
    }
}
