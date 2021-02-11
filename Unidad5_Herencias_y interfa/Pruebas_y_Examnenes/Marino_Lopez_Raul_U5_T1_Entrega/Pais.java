package Marino_Lopez_Raul_U5_T1_Entrega;

import java.util.Arrays;

abstract public class Pais {
    private String nombre;
    private static int num_paticipantes=0;
    private Pais[] pais;

    public Pais(String nombre) {
        this.nombre = nombre;
        num_paticipantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getNum_paticipantes() {
        return num_paticipantes;
    }

    public static void setNum_paticipantes(int num_paticipantes) {
        Pais.num_paticipantes = num_paticipantes;
    }
    public void addpais(Pais nombre) {
        this.pais = Arrays.copyOf(this.pais,this.pais.length+1);
        this.pais[this.pais.length-1]=nombre;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + Arrays.toString(pais) +
                '}';
    }

    public boolean quitarPais() {
        if (pais.length==0) {
            return false;
        } else {
            pais = Arrays.copyOf(pais,pais.length-1);
            return true;
        }


    }


}
