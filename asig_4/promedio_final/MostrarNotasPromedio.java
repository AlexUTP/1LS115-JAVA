//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;
import java.util.ArrayList;

public class MostrarNotasPromedio {
    public static void ImprimirPromedioNotas(String[][] notas, ArrayList <String> nombres) throws IOException  {
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        //Declaracion de variable
        double promedio = 0;

        System.out.println("Introduzca su usuario:");
        String user = bufer.readLine();
        for (int i = 0; i < nombres.size(); i++) {
            String nom = nombres.get(i);
            if (user.equals(nom)) {
                System.out.print("Las Notas de " + user + "son: ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(notas[i][j] + " ");
                    promedio = promedio + Integer.parseInt(notas[i][j]);
                }//fin for
                System.out.println("El promedio de sus notas es de: " + (promedio/5));
            } //fin if
            else {
                System.out.println("\nERROR: Usuario no registrado");
            }
        }//fin for
    }//fin metodo
}//fin class
