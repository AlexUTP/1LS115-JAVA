//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.io.*;

public class menu {
    public static void main(String[] args) throws IOException {
        //Crear objeto de lectura
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        variable obj = new variable();
        //Declaracion de variables
        int opc = 0, cant = 0, j = 0;

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
                        obj.name[cant] = new_user.IngresarDatos(1, j);
                        obj.password[cant] = new_user.IngresarDatos(2, j);
                        while (j != 5){
                            obj.notas[cant][j] = new_user.IngresarDatos(3, j);
                            j++;
                        }
                        j = 0;
                        cant = cant + 1;
                    } 
                    else {
                        System.out.println("Ya se ha ingresado la cantidad maxima de usuarios.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < obj.name.length; i++) {
                        obj.password[i] = CambiarContra.ActualizarContrasena(obj.password);
                    }
                    
                    break;
                case 3:
                    break;
                case 4:
                    for (int i = 0; i < obj.name.length; i++) {
                        ImprimirNombres.MostrarUsuariosCreados(obj.name, i);
                    }
                    break;

                default:
                    System.out.println("ERROR: No ha introducido ninguno de los valores anteriores.");
            }//fin switch case
        }// fin while
    }//fin main
}//fin class