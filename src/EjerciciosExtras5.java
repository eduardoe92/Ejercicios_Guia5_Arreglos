
/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
*/

import java.util.Arrays;
import java.util.Random;

public class EjerciciosExtras5 {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        int suma = 0;
        int n = 3;
        int m = 3;
        int[][] matriz;
        matriz = new int[n][m];

        // Cargamos la matriz principal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        // Mostramos la matriz por pantalla
        System.out.println("Matriz principal:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma = matriz[i][j] + suma;
            }
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
        
 