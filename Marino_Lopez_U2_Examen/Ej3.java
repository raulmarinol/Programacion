import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la altura de la flecha");
        altura = sc.nextInt();

        if (altura >= 3 || altura % 2 != 0)

            for (int i = 0; i < altura / 2 + 1; i++) {
                for (int j = 0; j < altura - (3 + i); j++) {
                    System.out.print("-");
                }
                System.out.println("*");
            }
        for (int i = altura / 2 + 1; i < altura; i++) {
            for (int j = 1; j < altura - i; j++) {
                System.out.print("-");
            }
            for (int j = 1; j < altura / 2; j++) {
                System.out.println("*");

            }
            if ( int j = altura / 2){
                System.out.println("*****");

            }

        }
    }
}


