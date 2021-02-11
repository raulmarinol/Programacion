package Marino_Lopez_Raul_U5_T1_Entrega;

import java.util.Objects;

public class Atletas extends Participantes implements Correr{
    private String prueba;
    private static int num_pruebas=0;

    public Atletas(String nombre, String nombre1, String nombre_pabellon, int edad, String nombre2, Participantes[] participantes, String prueba) {
        super(nombre, nombre1, nombre_pabellon, edad, nombre2, participantes);
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "Atletas{" +
                "prueba='" + prueba + '\'' +
                '}';
    }

    @Override
    public void hacer_juramento() {
        System.out.println("Yo "+this.getNombre()+", como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public void correr() {
        System.out.println("Voy a correr");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atletas atletas = (Atletas) o;
        num_pruebas++;
        return Objects.equals(prueba, atletas.prueba);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prueba);
    }

    public static int getNum_pruebas() {
        return num_pruebas;
    }

    public static void setNum_pruebas(int num_pruebas) {
        Atletas.num_pruebas = num_pruebas;
    }
}
