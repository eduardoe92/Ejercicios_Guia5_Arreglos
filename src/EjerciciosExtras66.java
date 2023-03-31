import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosExtras66 {
    public static void main(String[] args) {
        // Definir matriz de 20 x 20
        char[][] sopa = new char[20][20];

        Scanner leer = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese una palabra de entre 3 y 5 caracteres: ");
            String palabra = leer.nextLine();
            while (palabra.length() <= 2 || palabra.length() >= 6) {
                System.out.print("La palabra debe tener entre 3 y 5 caracteres. Ingrese de nuevo: ");
                palabra = leer.nextLine();
            }palabras.add(palabra);            
        }
        
        // Seleccionar aleatoriamente una fila para ubicar las palabras
        Random random = new Random();
        int fila = random.nextInt(sopa.length);

        // Ubicar las palabras en la fila seleccionada
        int pos = 0;
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][pos + i] = palabra.charAt(i);
            }
            pos += palabra.length() + 1; // Dejar un espacio entre palabras
        }

        // Rellenar los espacios no utilizados con un número aleatorio del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == '\u0000') { // '\u0000' es el valor por defecto de un char
                    sopa[i][j] = (char) (random.nextInt(10) + '0');
                }
            }
        }

        // Imprimir la sopa de letras por pantalla
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
