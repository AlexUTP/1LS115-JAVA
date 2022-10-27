import java.util.*;

public class new_user {
    public static void IngresarDatos(int cant) {
        //Crear objeto de lectura
        Scanner obtener = new Scanner(System.in);
        //
        variable objvar = new variable();

        System.out.println("Ingrese su nombre: ");
        objvar.name[cant] = obtener.nextLine();
        System.out.println("Ingrese una contraseña: ");
        objvar.password[cant] = obtener.nextLine();
        while (true) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la nota [" + (j + 1) + "]: ");
                objvar.notas[cant][j] = obtener.nextDouble();
            }
            break;
        }
        obtener.close();
    }
}
