
/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
*/

public class EjerciciosExtras2 {

    public static void main(String[] args) {
        
       int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {1, 2, 3, 4, 5};
        int tru = 0;
        boolean fals = true;

        do {
            if (vector1[tru] == vector2[tru]) {
                fals = true;
            }
            
            else {
                System.out.println("El array es diferente y falló en la posición " + (1+tru));
                fals = false;
            } 
            
            tru++;
        } while (fals == true && tru < 5);
                
            if (fals == true) {
                System.out.println("El array es igual");
            }        
    }
}