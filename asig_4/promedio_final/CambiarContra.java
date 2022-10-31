//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;

public class CambiarContra {
    public static String ActualizarContrasena(String aux) throws IOException {
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca su contrasenia actual:");
        String contra = bufer.readLine();
        for (int i = 0; )
        if (aux.equals(contra)) {
            System.out.println("Introduzca su nueva contrasenia:");
            String newcontra = bufer.readLine();
            System.out.println("su contrasenia se ha cambiado con exito");
            return newcontra;
        }
        return "Sin resultado";
    }//fin metodo
}//fin class
