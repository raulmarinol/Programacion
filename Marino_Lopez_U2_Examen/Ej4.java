import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean n;
        n = true;
        int verdadero;
        verdadero = 3;


        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        n = sc.nextBoolean();



            System.out.println("Ha aumentado sus gastos de vestuario");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("No te deja que mires la agenda de su teléfono móvil");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("Has notado que últimamente se perfuma más");
            n = sc.nextBoolean();
            n = true;
            verdadero++;
            System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
            n = sc.nextBoolean();
            n = true;
            verdadero++;

            if (verdadero <= 10) {
                System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
            } else if (10 < verdadero && verdadero >= 22) {
                System.out.println(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

            } else if (22 < verdadero && verdadero <= 30) {
                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
            }
        }

}