//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;

public class new_user {
    public static String IngresarDatos(int aux, int j) throws IOException{
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        if (aux ==1 ){
            System.out.println("Ingrese su nombre: ");
            String nombre = bufer.readLine();
            return  nombre;
        }
        else if (aux == 2){
            System.out.println("Ingrese una contraseña: ");
            String contra = bufer.readLine();
            return contra;
        }

        else if (aux == 3){
            System.out.print("Ingrese la nota [" + (j + 1) + "]: ");
            String notas = bufer.readLine();
            return notas;
        } //fin if
        return "sin rsultados";
    }//fin metodo
}//fin 
