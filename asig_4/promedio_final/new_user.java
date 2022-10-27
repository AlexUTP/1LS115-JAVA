import java.io.*;

public class new_user {
    public static void IngresarDatos(int cant) throws IOException{
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        //Crear objeto
        variable objvar = new variable();

        System.out.println("Ingrese su nombre: ");
        objvar.name[cant] = bufer.readLine();
        System.out.println("Ingrese una contraseña: ");
        objvar.password[cant] = bufer.readLine();
        //Guardar notas
        for (int j = 0; j < 5; j++) {
            System.out.print("Ingrese la nota [" + (j + 1) + "]: ");
            objvar.notas[cant][j] = Integer.parseInt(bufer.readLine());
        }//fin for
    }//fin metodo
}//fin
