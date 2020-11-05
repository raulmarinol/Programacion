import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        int entidad, surcural, control, numero;
        Scanner sc = new Scanner(System);
        boolean numprimo;

        System.out.println("Dime numero de cuenta");
        System.out.println("Dime tu numero de entidad");
        entidad = sc.nextInt();
        System.out.println("Dime tu numero de sucursal");
        surcural = sc.nextInt();
        System.out.println("Dime tu numero de control");
        control = sc.nextInt();
        System.out.println("Dime tu numero de control");
        numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero / i == 0) {
                numero = numprimo;
            }
        }

        if (numero=numprimo){
            System.out.println("Es una cuenta valida");
        }else {
            System.out.println("No es una cuenta valida");
        }
    }
}
