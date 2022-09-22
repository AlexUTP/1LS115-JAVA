import java.util.*;

public class probl10 {
    public static void main(String[] args){
        //Declaracion de Variables
        Scanner leer  = new Scanner (System.in);
        String varx;

        while(true){ //condicicion while
            System.out.println("Ingrese un valor cualquiera" );
            System.out.println("Escriba Salir para cerrar el programa");
            varx = leer.nextLine();

            varx = varx.toLowerCase();
            if(varx.equals("salir")){
                break;
            }
        }
        leer.close();
    }
}
