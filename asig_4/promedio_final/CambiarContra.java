import java.io.*;

public class CambiarContra {
    public static void ActualizarContrasena() throws IOException {
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        //Crear objeto
        variable objvar = new variable();

        System.out.println("Introduzca la contrasenia actual:");
        System.out.println("Introduzca la contrasenia actual:");
        String contra = bufer.readLine();
        if (objvar.password[i] == contra) {
            System.out.println("Introduzca su nueva contrasenia:");
            objvar.password[i] = bufer.readLine();
            System.out.println("su contrasenia se ha cambiado con exito");
        }//fin if
    }//fin metodo
}//fin class
