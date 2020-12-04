package Marino_Lopez_Raul_U3_Entregable;
/*Implementa una función con nombre corteza que sea capaz de extraer la capa
exterior de un array bidimensional. Esta capa se extrae en forma de array de
una dimensión. La extracción de números comienza en la esquina superior
izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
tanto el código de la función como el código de prueba que la usa. La cabecera
de la función es la siguiente:

public static int[] corteza(int[][] n)
Por ejemplo, si el array bidimensional a es el que se muestra a continuación:

45 92 14 20 25 78
35 72 24 45 42 60
32 42 64 23 41 39
98 45 94 11 18 48

El array unidimensional generado por corteza(a) sería el siguiente:*/

public class Ejercicio3 {
    public static void main(String[] args) {

        int matriz[][]={{45,92,14,20,25,78}, {35,72,24,45,42,60}, {32,42,64,23,41,39}, {98,45,94,11,18,48}};


        corteza(matriz);
    }
    public static int[] corteza(int[][] matriz){

        for (int i=0;i<=matriz.length;i++){
            if(i==0){
                for(int j=0;j<matriz[0].length;j++){
                    System.out.print(matriz[i][j]+" ");
                }
            }
            else if(i==matriz.length){
                for(int j=matriz[0].length-2;j>0;j--){
                    System.out.print(matriz[i-1][j]+" ");
                }
            }
            else
            {
                System.out.print(matriz[i][matriz.length+1]+" ");
            }

        }

        for (int i=matriz.length-1;i>0;i--){
            System.out.print(matriz[i][0]+" ");
        }
        return null;

    }

}
