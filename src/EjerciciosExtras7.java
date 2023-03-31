
/*
Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
*/

import java.util.Scanner;

public class EjerciciosExtras7 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        int num;
        num = 0;
        System.out.println("Introduzca la posición fibonacci de la que quiere saber el número");
        num = leer.nextInt();   
        int vector[] = new int [num];
        //int numfibo = 0;
        int n1 = 0;
        int n2 = 1;
        int numfibo;
        numfibo = 0;
        
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                vector[i] = 1;
            } else {
            numfibo = n1 + n2;
            n1 = n2;
            n2 = numfibo;
            vector[i] = numfibo; 
            }    
            System.out.print("[" + vector[i] + "] ");
        }System.out.println("");
        System.out.println("El número de la secuencia Fibonacci en la posición " + num + " Es " + vector[num - 1]);
    }
}