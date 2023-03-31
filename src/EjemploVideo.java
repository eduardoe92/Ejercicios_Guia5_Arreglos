
/*
Realizar una multiplicación de un vector por una matriz
Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM

Ej: Vector 1x2 * Matriz 2x3 = producto 1x3

V= | 3,5 | * M= | 4,8,6 | = |3*4+5*2 , 3*8+5.1 , 3*6+5*7| = |22,29,53|
                       | 2,1,7 |
    
*/

import java.util.Scanner;

public class EjemploVideo {

    public static void main(String[] args) {
        
        int [] vector;
        vector = new int [2];
        int [] producto = new int[3];
        
        int [] [] matriz = {{4,8,6},{2,1,7}};
        
        System.out.println("Ingrese los valores del vector de tamaño " +vector.length+ ":");
        Scanner leer = new Scanner(System.in);
        
        for (int i=0; i<vector.length; i++){
            System.out.print("v[" +i+ "]=");
            vector[i]=leer.nextInt();
        }
                
        for (int j=0; j<matriz[0].length; j++){
            int sum = 0;
            for (int i =0 ; i<vector.length; i++){
                sum+=vector[i]*matriz[i][j];
            }
            producto[j]=sum;
        }
        String aux= "";
        
        System.out.println("* Vector: ");
        for (int elemento: vector) {
            aux = aux + "  " + elemento;
        }
        System.out.println(aux);
        
        System.out.println("\n* Matriz:");
        for (int[] fila : matriz) {
            aux= "" ;
            for (int elemento: fila) {
                aux+="  " + elemento;
               }
            System.out.println(aux);
        }
        aux="";
        System.out.println("\n Vector * Matriz");
        for (int elemento: producto){
            aux += "  " + elemento;
        }
        System.out.println(aux);
    }

}