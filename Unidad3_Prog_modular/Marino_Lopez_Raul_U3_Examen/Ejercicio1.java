package Marino_Lopez_Raul_U3_Examen;
/*Implementa la función aleatorioDeArray con la cabecera que se muestra a continuación:

public static int aleatorioDeArray(int[] a)
Esta función debe devolver un número del array escogido al azar entre todos los disponibles.

Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a) podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37.

Utiliza la función en un programa deprueba.*/
public class Ejercicio1 {
    public static void main(String[] args) {

        int[] a={111,222,333,444};
        int[] b={52,37};
        System.out.println(aleatorioDeArray(a));
    }
    public static int aleatorioDeArray(int[] a){
           int pos;
           int resul=0;

        for (int i = 0; i < a.length; i++) {
            pos =(int)(Math.random()*a.length-1);
            pos = a[i];
            resul=a[i];
        }

        return resul;
    }
}
