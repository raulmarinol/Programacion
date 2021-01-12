package Raul_Marino_Lopez_Recuperacion_Eval_1;
/*Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.
Se permiten números de hasta 5 dígitos.


Ejemplo:

Introduce el número:

123

El número cierto 123 tienen 3 dígitos

Introduce el número

-2222

El número -2222 tiene 4 dígitos.

 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,num2;
        int contador =0;
        int aux;

        System.out.println("Dime un numero para contar sus caracteres:");
        num= sc.nextInt();
        num2=num;

        do {
            aux=num/10;
            num=aux;
            contador++;

        }while( num!=0);

        if (contador>5){
            System.out.println("El numero introducido tienes mas digitos de los indicados.");
        }else{
            System.out.println("El numero "+num2+" tienes las siguientes cifras: "+contador);
        }

    }
}
