package Raul_Marino_Lopez_Recuperacion_Eval_1;

import java.util.Arrays;

/*Crea dos funciones que trabajen com arrays de dos dimensiones:

int[][] eliminarFilasPares(int[][] matriz) que devuelva el resultado de eliminar de matriz las filas pares
int[][] eliminarFilasImpares(int[][] matriz) que devuelva el resultado de eliminar de matriz las filas impares
Ejemplo: Dada la siguiente matriz

12 23 45 56

11 11 99 69

28 75 90 10

21 56 32 33

El resultado de eliminarFilasPares será:

11 11 99 69

21 56 32 33

El resultado de eliminarFilasImpares será:

12 23 45 56

28 75 90 10*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] matriz={{12,23,45,56},{11,11,99,69},{28,75,90,10},{21,56,32,33}};

        System.out.println(Arrays.toString(eliminarFilasPares(matriz)));

        System.out.println(Arrays.toString(eliminarFilasImpares(matriz)));


    }
    public static int[][] eliminarFilasPares(int[][] matriz){

        int[][] matrix2=new int[matriz.length/2][matriz.length/2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i%2==0){
                    matrix2[i][j]=matriz[i][j];
                }
            }

        }
        return matrix2;
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){

        int[][] matrix2=new int[matriz.length/2][matriz.length/2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i%2!=0){
                    matrix2[i][j]=matriz[i][j];
                }
            }

        }
        return matrix2;
    }
}
