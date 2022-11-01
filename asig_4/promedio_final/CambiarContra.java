//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;
import java.util.ArrayList;

public class CambiarContra {
    public static ArrayList <String> ActualizarContrasena(ArrayList <String> contrasenias, ArrayList <String> names) throws IOException {
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca su nombre:");
        String nomb = bufer.readLine();
        System.out.println("Introduzca su contrasenia actual:");
        String contra = bufer.readLine();

        //Comparar los nombres que contiene el ArrayList
        for (int i = 0; i < contrasenias.size(); i++) {
            String contras = contrasenias.get(i);
            if (contras.equals(contra)) {
                System.out.println("Hola " + nomb + " ");
                System.out.println("Introduzca su nueva contrasenia:");
                String newcontra = bufer.readLine();
                System.out.println("su contrasenia se ha cambiado con exito");
                names.set(i, newcontra);
            } //fin if
        }//fin for
        return names;
    }//fin metodo
}//fin class
