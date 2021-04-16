package Marino_Lopez_Raul_U7_T1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Matriculacion {

    HashMap<Integer, Alumno> alumno = new HashMap<Integer, Alumno>();
    ArrayList<Integer> lista_ids = new ArrayList<>();
    static int id = 0;

    public void introducir_alumno() {
        boolean seguir_introduciendo = true;
        Scanner sc = new Scanner(System.in);
        while (seguir_introduciendo) {
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Apellidos: ");
            String apellidos = sc.nextLine();
            System.out.println("dni: ");
            String dni = sc.nextLine();

            introducir_alumno(nombre, apellidos, dni);
            System.out.println("¿Desea insertar otro aspirante? [s/n]");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                seguir_introduciendo = false;
            }
        }
        guardarFicheros();
    }

    public void introducir_alumno(String nombre, String apellido, String dni) {
        alumno.put(id, new Alumno(nombre, apellido, dni));
        lista_ids.add(id);
        id++;
    }

    public void guardarFicheros() {
        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
            fichero.writeObject(alumno);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
            fichero.writeObject(lista_ids);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
