package com.company;

import java.util.Arrays;

public class Departamento {

    private String nombre;
    private String localidad;
    private String extension;
    private Empleado[] lista;

    public Departamento(String nombre, String localidad, String extension) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.extension = extension;
    }

    public Departamento(String nombre, String extension) {
        this.nombre = nombre;
        this.extension = extension;
        this.localidad= "Castilleja";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", extension='" + extension + '\'' +
                '}';
    }



}
