package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
          System.out.println("Dime un numero");
          num =sc.nextInt();
          num=num*10+num;
        }while (num>0);{

        }
        System.out.println("Posición inicial: "+);
        System.out.println("Posición final: "+);
        System.out.println("El número resultante es: "+);
    }
}
