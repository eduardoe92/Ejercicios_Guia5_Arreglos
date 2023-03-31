
/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
*/

import java.util.Scanner;

public class EjerciciosExtras1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor introduzca un tamaño para el vector");
        int vec =(int) leer.nextInt();
        int vector[] ;
        int num=0; 
        vector = new int [vec];
        
        for (int i = 0; i < vec; i++) {
            vector[i] = (int) (Math.random()*100);
        }
        for (int i = 0; i < vec; i++) {
            num += vector[i];
        }
        
        for (int i=0; i<vec; i++){
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println(num);
       }
    }
