
import java.util.*;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable objvariable = new variable();
        
        int opc = 0, cant = 0;
            while (opc != 5) {
                    System.out.println("1. Ingresar nuevo usuario.");
                    System.out.println("2. Actualizar contrasena del usuario.");
                    System.out.println("3. Imprimir total de notas y promedio final del usuario.");
                    System.out.println("4. Imprimir nombre de los usuarios creados.");
                    System.out.println("5. Salir del programa.");
                    System.out.print("Ingrese una opcion: ");
                    opc = sc.nextInt();
                
                    switch (opc) {
                        case 1:
                            if (cant < 5) {
                                new_user.IngresarDatos(cant);
                                cant = cant + 1;
                            } else {
                                System.out.println("Ya se ha ingresado la cantidad maxima de usuarios.");
                            }
                            break;

                        case 2:

                            break;

                        case 3:

                            break;

                        case 4:
                            break;

                        default:
                            System.out.println("ERROR: No ha introducido ninguno de los valores anteriores.");
                    }
                    System.out.println(opc);
            }
        sc.close(); 
    }
}