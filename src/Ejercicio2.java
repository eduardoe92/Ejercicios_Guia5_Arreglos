
/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = input.nextInt();
        
        int[] vector = new int[n];
        
        // Llenar el vector con valores aleatorios
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
        
        System.out.print("Ingrese el número a buscar: ");
        int num = input.nextInt();
        
        boolean encontrado = false;
        int pos = -1;
        int count = 0; // Contador de veces que se encuentra el número
        
        // Recorrer el vector para buscar el número
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                encontrado = true;
                pos = i;
                count++;
            }
        }
                for (int i=vector.length-1; i>=0; i--){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");
        // Mostrar los resultados
        if (encontrado) {
            System.out.println("El número " + num + " se encuentra en la posición " + pos);
            if (count > 1) {
                System.out.println("El número " + num + " está repetido " + count + " veces en el vector");
            }
        } else {
            System.out.println("El número " + num + " no se encuentra en el vector");
        }
    }
}
