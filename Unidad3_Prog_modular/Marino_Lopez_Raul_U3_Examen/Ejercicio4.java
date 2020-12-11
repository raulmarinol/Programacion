package Marino_Lopez_Raul_U3_Examen;

import java.util.Arrays;

/*Implementa una función con nombre nEsimo que busque el número que hay dentro
de un array bidimensional en la posición n-ésima contando de izquierda a derecha y de arriba abajo,
como si se estuviera leyendo. El primer elemento es el 0.

Si la posición donde se busca no existe en el array, la función debe devolver -1.

Se debe entregar tanto el código de la función como el código de prueba que la usa.Rellenaremos
los arrays de manera aleatorio con números entre 10 y 100 (ambos incluidos).

La cabecera de la función es la siguiente: public static int nEsimo(int[][] n, int posicion)*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] array= new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]=(int)(Math.random()*90+11);
            }
        }


        public static int nEsimo(int[][] n, int posicion){
            int posicion;

            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n[i].length; j++) {
                    if (posicion/n.length-1){

                    }
                }
            }
            return posicion;
        }
    }
}
