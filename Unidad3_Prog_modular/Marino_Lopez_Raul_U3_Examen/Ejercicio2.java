package Marino_Lopez_Raul_U3_Examen;

import java.util.Arrays;
import java.util.Scanner;

/*Crear una función insertarValor que:

Reciba como parámetros un vector de enteros, un valor y una posición
Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado
en la posición indicada. De esta manera el vector resultado tendrá un elemento más.
En caso de que la posición exceda los límites del vector deberá mostrar un error por pantalla
y devolver el mismo vector recibido.
Realizar una llamada a la función mostrando el vector resultado.

Ejemplo:

v = { 1 , 2 , 3 , 4 , 5 }

v1 = invertarValor(v,8,3)

Entonces v1 será {1,2,3,8,4,5}*/
public class Ejercicio2 {
    public static void main(String[] args) {/*
        int[] array ={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int num,pos;
        System.out.println("Dime el numero que quiere intruducir:");
        num= sc.nextInt();
        System.out.println("Dime en la posición que lo quieres introducir");
        pos= sc.nextInt();

        insertarValor(array,num,pos);

    }
    static public int insertarValor(int[] v,int n; int p){
        int n,p;
        int resultado[]= new int [v.length+1];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dime el numero que quiere intruducir:");
            n= sc.nextInt();
            System.out.println("Dime en la posición que lo quieres introducir");
            p= sc.nextInt();

        }while (p<0 || p>v.length);

        for (int i = 0; i < v.length; i++) {
            if (p<0 || p>v.length){
                resultado[i]= Arrays.copyOf(v,);

            }
        }

        return resultado;
    }*/
    }
}
