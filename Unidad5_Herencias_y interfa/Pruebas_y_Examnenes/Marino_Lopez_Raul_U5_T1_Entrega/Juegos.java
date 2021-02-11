package Marino_Lopez_Raul_U5_T1_Entrega;

import java.util.Arrays;

public class Juegos {
    private int year;
    private String sede;
    private Pais[] pais;
    private Deporte[] deporte;

    public Juegos(int year, String sede) {
        this.year = year;
        this.sede = sede;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPais() {
        return pais;
    }

    public void setPais(Pais[] pais) {
        this.pais = pais;
    }

    public Deporte[] getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte[] deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Juegos{" +
                "year=" + year +
                ", sede='" + sede + '\'' +
                ", pais=" + Arrays.toString(pais) +
                ", deporte=" + Arrays.toString(deporte) +
                '}';
    }
}
