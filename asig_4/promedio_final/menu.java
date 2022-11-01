//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;
import java.util.ArrayList;

public class menu {
    public static void main(String[] args) throws IOException {
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        //Declaracion de variables
        int opc = 0, cant = 0, j = 0;
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();
        String[][] notas = new String[5][5];

        while (opc != 5) {
            
            System.out.println("1. Ingresar nuevo usuario.");
            System.out.println("2. Actualizar contrasena del usuario.");
            System.out.println("3. Imprimir total de notas y promedio final del usuario.");
            System.out.println("4. Imprimir nombre de los usuarios creados.");
            System.out.println("5. Salir del programa.");
            System.out.print("Ingrese una opcion: ");
            opc = Integer.parseInt(bufer.readLine());

            switch (opc) {
                case 1:
                    if (cant < 5) {
                        name.add(new_user.IngresarDatos(1, j));
                        password.add(new_user.IngresarDatos(2, j));
                        while (j != 5){
                            notas[cant][j] = new_user.IngresarDatos(3, j);
                            j++;
                        }//fin while
                        j = 0;
                        cant = cant + 1;
                    } 
                    else {
                        System.out.println("Ya se ha ingresado la cantidad maxima de usuarios.");
                    }//fin if
                    break;
                case 2:
                    CambiarContra.ActualizarContrasena(password, name);
                    //password.set(j, CambiarContra.ActualizarContrasena(password, name));
                    for (String contrasenas : password) {
                        System.out.println(contrasenas);
                    }
                    break;
                case 3:
                    MostrarNotasPromedio.ImprimirPromedioNotas(notas,name);
                    break;
                case 4:
                    ImprimirNombres.MostrarUsuariosCreados(name);
                    break;
                case 5:
                    System.out.println("Que tenga un lindo día");
                    break;
                default:
                    System.out.println("ERROR: No ha introducido ninguno de los valores anteriores.");
            }//fin switch case
        }// fin while
    }//fin main
}//fin class