
/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
*/

import java.util.Scanner;

public class EjercicioGuia1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] equipo = new String [6];
        
            for (int i=0 ; i<6; i++){
                equipo[i]=leer.nextLine();
            }
                                
            for (int i=0 ; i<6; i++){
                System.out.println("[" +equipo[i]+ "]");
    }
        
    }

}