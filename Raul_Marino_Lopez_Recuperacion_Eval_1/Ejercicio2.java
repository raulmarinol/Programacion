package Raul_Marino_Lopez_Recuperacion_Eval_1;

import java.util.Scanner;

/*
Realizar un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y corriente.
Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la superior):
la primera se pinta, la segunda no, la tercera sí, la cuarta no, etc. La terraza (la línea superior)
de la pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide normal
tienen 4 asteriscos y el espacio entre las líneas que no se pintan tiene también 4 asteriscos.

Se solicitará al usuario la altura hasta que el usuario introduza una altura mayor o igual que 3.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.print("Introduzca la altura de la pirámide ");
        altura= sc.nextInt();

        int planta = 1;
        int longitud = 1;
        int espacios = altura - 1;

        while (planta <= altura) {


            for (int i = 1; i <= espacios; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i <= longitud / 2; i++) {
                System.out.print('*');
            }

            System.out.print(planta % 2 == 1 ? "****" : "    ");

            for (int i = 0; i <= longitud / 2; i++) {
                System.out.print('*');
            }
            System.out.println();

            planta++;
            espacios--;
            longitud += 2;
        }
    }
}
