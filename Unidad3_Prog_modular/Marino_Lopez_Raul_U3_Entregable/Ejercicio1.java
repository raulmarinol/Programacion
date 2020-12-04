package Marino_Lopez_Raul_U3_Entregable;
/*Define la función mezcla con la siguiente cabecera:

public static int[] mezcla(int[] a, int[] b)

Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de
mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a, etc.
Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los números de un array
se terminan de coger todos los que quedan del otro.



Ejemplos:

Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }

Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}

Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}

Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}
*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] a;
        int[] b;
        Scanner sc = new Scanner(System.in);
        int tam1, tam2;

        System.out.println("Dime el tamaño del primer array");
        tam1 = sc.nextInt();
        System.out.println("Dime el tamaño del segundo array");
        tam2 = sc.nextInt();

        a= new int[tam1];
        b= new int[tam2];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*10-1);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random()*10-1);
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(" ");

        int c[]=mezcla(a, b);
        System.out.print("La mezcla es: ");

        System.out.print("{");
        for(int i=0;i<c.length;i++){
            if(i==c.length-1){
                System.out.print(c[i]);
            }
            else
            {
                System.out.print(c[i]+",");
            }
        }
        System.out.print("}");

    }

    private static int[] mezcla(int[] a, int[] b) {
        int c[];
        int index=0;
        c= new int[a.length+b.length];

        if(a.length>=b.length){
            for(int i=0;i<a.length;i++){
                if(i<b.length){
                    c[index]=a[i];
                    c[index+1]=b[i];
                    index=index+2;
                }
                else
                {
                    c[index]=a[i];
                    index=index+1;
                }
            }
        }

        if(b.length>a.length){
            for(int i=0;i<b.length;i++){
                if(i<a.length){
                    c[index]=a[i];
                    c[index+1]=b[i];
                    index=index+2;
                }
                else
                {
                    c[index]=b[i];
                    index=index+1;
                }
            }
        }

        return c;


    }

}
