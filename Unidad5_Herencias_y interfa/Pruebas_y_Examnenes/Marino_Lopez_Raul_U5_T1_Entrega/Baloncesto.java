package Marino_Lopez_Raul_U5_T1_Entrega;

import java.util.Objects;

public class Baloncesto extends Participantes implements Encestar{
    private Double altura;
    private String equipo;
    private static int num_equipos=0;

    public Baloncesto(String nombre, String nombre1, String nombre_pabellon, int edad, String nombre2, Participantes[] participantes, Double altura, String equipo) {
        super(nombre, nombre1, nombre_pabellon, edad, nombre2, participantes);
        this.altura = altura;
        this.equipo = equipo;
    }

    public static int getNum_equipos() {
        return num_equipos;
    }

    public static void setNum_equipos(int num_equipos) {
        Baloncesto.num_equipos = num_equipos;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Baloncesto{" +
                "altura=" + altura +
                ", equipo='" + equipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baloncesto that = (Baloncesto) o;
        num_equipos++;
        return Objects.equals(altura, that.altura) &&
                Objects.equals(equipo, that.equipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(altura, equipo);
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo "+this.getNombre()+", como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }
}
