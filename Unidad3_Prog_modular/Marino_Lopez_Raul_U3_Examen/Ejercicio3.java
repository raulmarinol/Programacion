package Marino_Lopez_Raul_U3_Examen;
/*
Utilizando vectores bidimensionales enla función,realizar la siguiente función para un juego de ajedrez:

public static boolean jaque(String posRey,String posReina)

Y nos devuelva si reina está en posición de jaque al rey.

La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8

Para recordar una imagen de un tablero con las posiciones:
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] filas={1,2,3,4,5,6,7,8};
        String[] columnas={"A","B","C","D","E","F","G","H"};

        int[][] tablero= new int[8][8];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length-1; j++) {
                if (){
                System.out.println("El rey esta en jaque");
            }

        }
    }
}
