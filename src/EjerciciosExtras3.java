/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
*/

public class EjerciciosExtras3 {

    public static void main(String[] args) {
        
        int vector[] = new int[5];
            rellenar(vector);
            mostrar(vector);
        }

        public static void rellenar(int vector[]) {
            for (int i = 0; i < 5; i++) {
                vector[i] = (int) (Math.random() * 100);
        }
    }

        public static void mostrar(int vector[]) {
            for (int i = 0; i < 5; i++) {
                System.out.print("[" +vector[i]+ "]");
        }
            System.out.println("");
    }
}