package Marino_Lopez_Raul_U7_T1;

import ExamenCollectionsMañana1920.Perro;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Unidad {
    private String nombre;
    private Map<String, List<Alumno>> alumnos;

    public Unidad(String nombre, Map<String, List<Alumno>> alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }
    public void addAlumnoUnidad(String nombre, Alumno alumno ) {
        if (alumno.getNombre().equals(nombre)) {
            if (!alumno.containsKey(nombre)) {
                alumnos.put(nombre, (List<Alumno>) new TreeSet<Alumno>());
            }
            alumnos.get(nombre).add(alumno);
        } else {
            System.out.println("El perro no es de la raza en la que quiere apuntarse");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, List<Alumno>> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Map<String, List<Alumno>> alumnos) {
        this.alumnos = alumnos;
    }
}

