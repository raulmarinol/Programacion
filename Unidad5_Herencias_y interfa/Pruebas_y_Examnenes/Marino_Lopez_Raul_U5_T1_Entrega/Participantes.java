package Marino_Lopez_Raul_U5_T1_Entrega;

import java.util.Arrays;

abstract public class Participantes extends Deporte implements Juramento {
    private int edad;
    private String nombre;
    private Participantes[] participantes;

    public Participantes(String nombre, String nombre1, String nombre_pabellon, int edad, String nombre2, Participantes[] participantes) {
        super(nombre, nombre1, nombre_pabellon);
        this.edad = edad;
        this.nombre = nombre2;
        this.participantes = participantes;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addpais(Participantes nombre) {
        this.participantes = Arrays.copyOf(this.participantes,this.participantes.length+1);
        this.participantes[this.participantes.length-1]=nombre;
    }
    public boolean quitarPais() {
        if (participantes.length == 0) {
            return false;
        } else {
            participantes = Arrays.copyOf(participantes, participantes.length - 1);
            return true;
        }

    }


    @Override
    public String toString() {
        return "Participantes{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                '}';
    }
}
