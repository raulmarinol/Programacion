package Raul_Marino_Lopez_Recuperacion_Eval_1;

import java.util.Arrays;

/*Escribe un programa que genere un array con 100 números aleatorios de 18 a 100 y que los muestre
por pantalla separados por espacios.A continuación deberá mostrar de nuevo dicho array con los números
primos generados con dos asteriscos delante y dos astericos detrás.

Para determinar si un número es primo deberemos crear una función.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] array= new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*82+18);
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])){
                System.out.print(" **"+array[i]+"** ");
            }else {
                System.out.print(" "+array[i]+" ");
            }
        }
    }
    public static boolean esPrimo(int num){
        int cont=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                cont++;
            }
            if (cont==3){
                i=num;
                return false;
            }
        }
     return true;
    }
}
