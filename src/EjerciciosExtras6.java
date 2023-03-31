
/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
*/

import java.util.Scanner;

public class EjerciciosExtras6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] [] sopa = new String [20] [20];
        String palabra;
        int m = 0;
        int n = 0;
        boolean solapado;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra");
            palabra = leer.next();
            while (palabra.length() < 3 || palabra.length() >5) {                
                System.out.println("Error, palabra demasiado larga o corta. Inténtelo nuevamente");
                palabra = leer.next();
            }
            do {
                solapado = false;
                m = (int) (Math.random()*20);
                n = (int) (Math.random()*20);
                if (m > 19-palabra.length()+1) {
                    solapado = true;
                }
                if (!solapado) {
                    for (int j = m; j < m+palabra.length()-1; j++) {
                        if (sopa [n] [m] != null) {
                            solapado = true;
                        }
                    }
                }
            } while (solapado);
            for (int j = m; j < m+palabra.length(); j++) {
                sopa [n] [j] = palabra.substring(j-m, j-m+1);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa [i] [j] == null) {
                    sopa [i] [j] = String.valueOf((int) (Math.random()*9-1+1)+1);
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa [i] [j] + "]");
            }
            System.out.println("");
        }
    }

}
