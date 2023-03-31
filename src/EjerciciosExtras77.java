// Metodo Recursión 

import java.util.Scanner;

public class EjerciciosExtras77 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = fibonacci(i+1);
            System.out.print("[" +vector[i] + "] ");
        }
        System.out.println("\nEl número del vector es: [" + vector[vector.length-1] + "] ");
    }
    
    public static int fibonacci(int nn){
        int rta;
        if (nn>1){
            rta = fibonacci(nn-1) + fibonacci(nn-2);
        }else if(nn==1){
            rta = 1;
        }else {
            rta = 0;
        }return rta;
    }
}