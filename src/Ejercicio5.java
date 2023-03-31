
/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
*/

public class Ejercicio5 {

    public static void main(String[] args) {
        
        int matriz[][]= {{ 0, -2, 4},{ 2, 0, 2},{ -4, -2, 0}};
        int matriz2[][]=new int [3][3];
        boolean anti=true;
                
        System.out.println("===================");
        System.out.println("Matriz A"); 
        System.out.println("===================");
            for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("[" + matriz[i][j] + "] ");
                    }
                    System.out.println("");  
                  }
       System.out.println("===================");
       System.out.println("Matriz B");
       System.out.println("===================");
       
            for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz2[i][j] = matriz[j][i];
                        System.out.print("[" + matriz2[i][j] + "] ");
                      }
                    System.out.println("");
                  }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz2[i][j] != -matriz[i][j]){
                     anti=false;                   
                    }
                }
        }
            if (anti){
                System.out.println("La matriz -AT es antisimétrica");
            }else System.out.println("La matriz -AT no es antisimétrica");                        
    }
}