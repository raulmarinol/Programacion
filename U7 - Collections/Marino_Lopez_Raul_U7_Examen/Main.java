package U7_Examen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elige in opción del menú");
            System.out.println("**************************");

            System.out.println("1 Cargar Atletas");
            System.out.println("2 Guardar Atletas");
            System.out.println("3 Incribir Atleta");
            System.out.println("4 Guardar Tiempo");
            System.out.println("5 Borrar Atleta");
            System.out.println("6 Mostrar Lista Finishers");
            System.out.println("7 Mostrar Lista de una cateforía");
            System.out.println("8 Participantes por país");
            System.out.println("9 Salir");

            opcion = sc.nextInt();

        }while (opcion != 0);
    }
}
