
/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
*/

import java.util.Scanner;

public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa la dimensión de la matriz: ");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un valor para la posición " + i + "," + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz original: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  " + matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        boolean retorno = checkAsimetrico(matriz, n, aux);
        System.out.println("Las matrices son asimétricas? " + retorno);

    }

    public static boolean checkAsimetrico(int[][] matriz, int n, int aux) {
        boolean asimetria = (aux == 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                asimetria = (aux == -matriz[i][j]);
            }
        }
        return asimetria;
    }
}