package Marino_Lopez_Raul_U3_Entregable;
/*Realiza un programa que rellene un array de 5 filas por 9 columnas con
números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.

Las funciones deben ser lo más genéricas posibles.*/


import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[5][9];
        crear(matrizNumeros);
        recorrer(matrizNumeros);
    }

    private static void crear(int[][] matriz) {

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] =(int) (Math.random() *1000);
            }
        }
    }

    static void recorrer(int[][] matriz){
        int min=0;
        int max=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]>max){
                    max=matriz[i][j];
                }
                if(matriz[i][j]<min){
                    min=matriz[i][j];
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println("El maximo es: "+ max);
        System.out.println("El minimo es: "+ min);
    }

}


