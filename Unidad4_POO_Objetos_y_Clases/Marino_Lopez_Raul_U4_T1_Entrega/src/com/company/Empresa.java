package com.company;

import java.util.Arrays;

public class Empresa {

    private String nombre;
    private Departamento[] departamentos = new Departamento[0];


    public Empresa(String nombre, Departamento[] departamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + Arrays.toString(departamentos) +
                '}';
    }
}
