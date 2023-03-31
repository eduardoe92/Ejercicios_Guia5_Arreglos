
/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
*/

import java.util.Scanner;

public class EjerciciosExtras4 {

    public static void main(String[] args) {
      
        // Declaración de variables
        final int CANT_ALUMNOS = 10;
        double[] promedios = new double[CANT_ALUMNOS];
        int aprobados = 0;
        int desaprobados = 0;
        
        Scanner leer = new Scanner(System.in);

        // Carga de notas y cálculo de promedios
        for (int i = 0; i < CANT_ALUMNOS; i++) {
            double nota1 = 0;
            double nota2 = 0;
            double nota3 = 0;
            double nota4 = 0;

            // Lectura y validación de notas
            do {
                System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
                System.out.print("Primer trabajo práctico evaluativo (10%): ");
                nota1 = leer.nextDouble();
                System.out.print("Segundo trabajo práctico evaluativo (15%): ");
                nota2 = leer.nextDouble();
                System.out.print("Primer Integrador (25%): ");
                nota3 = leer.nextDouble();
                System.out.print("Segundo Integrador (50%): ");
                nota4 = leer.nextDouble();

                if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10
                        || nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10) {
                    System.out.println("Ingrese notas válidas (entre 0 y 10).");
                }
            } while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10
                    || nota3 < 0 || nota3 > 10 || nota4 < 0 || nota4 > 10);

            // Cálculo del promedio y almacenamiento en el arreglo
            double promedio = (nota1 * 0.1) + (nota2 * 0.15)
                    + (nota3 * 0.25) + (nota4 * 0.5);
            promedios[i] = promedio;
        }
        // Cálculo de aprobados y desaprobados
        for (int i = 0; i < CANT_ALUMNOS; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        // Impresión de resultados
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }
}