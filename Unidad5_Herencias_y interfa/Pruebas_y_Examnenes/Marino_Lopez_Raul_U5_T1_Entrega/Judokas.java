package Marino_Lopez_Raul_U5_T1_Entrega;

import java.util.Objects;

public class Judokas extends Participantes implements Luchar{
    private static int num_tatami;
    private int peso;
    private int tatami;
    ;

    public Judokas(String nombre, String nombre1, String nombre_pabellon, int edad, String nombre2, Participantes[] participantes, int peso, int tatami) {
        super(nombre, nombre1, nombre_pabellon, edad, nombre2, participantes);
        this.peso = peso;
        this.tatami = tatami;
    }

    public int getTatami() {
        return tatami;
    }

    public void setTatami(int tatami) {
        this.tatami = tatami;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public static int getNum_tatami() {
        return num_tatami;
    }

    public static void setNum_tatami(int num_tatami) {
        Judokas.num_tatami = num_tatami;
    }

    @Override
    public String toString() {
        return "Judokas{" +
                "peso=" + peso +
                '}';
    }


    @Override
    public void hacer_juramento() {
        System.out.println("Yo "+this.getNombre()+", como judoka, juro los valores deportivos mundiales");
    }

    @Override
    public void luchar() {
        System.out.println("Voy a pelear");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Judokas judokas = (Judokas) o;
        num_tatami++;
        return peso == judokas.peso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso);
    }
}
