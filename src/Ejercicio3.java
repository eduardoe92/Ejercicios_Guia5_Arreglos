
/*
Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        Random random  = new Random();
        System.out.println("Ingrese el tamaño del vector");
            int n = (int) leer.nextInt();
        
            int vector[]= new int [n];
            int digito;
            int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
            
            for (int i=0; i<n ; i++){
                vector [i] = random.nextInt(99999);
                digito=Integer.toString(vector[i]).length();
                
                switch(digito) {
                        case 1:
                            uno = uno + 1;
                            break;
                        case 2:
                            dos = dos + 1;
                            break;
                        case 3:
                            tres = tres + 1;
                            break;
                        case 4:
                            cuatro = cuatro + 1;
                            break;
                        case 5:
                            cinco = cinco + 1;
                            break;  
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print("[" + vector[i] + "] ");
        }
            System.out.println("");
        System.out.println("El vector tiene " + uno + " números de un dígito \n"
                      + dos + " números de dos dígitos \n"
                      + tres + " números de tres dígitos \n"
                      + cuatro + " números de cuatro dígitos \n"
                      + cinco + " números de cinco dígitos.");
    }
}