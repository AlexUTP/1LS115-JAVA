import java.util.*;

public class probl10 {
    public static void main(String[] args){
        Scanner leer  = new Scanner (System.in);
        String varx;

        while(true)
        {
            System.out.println("Ingrese un valor cualquiera" );
            System.out.println("Escriba Salir para cerrar el programa");
            varx = leer.nextLine(); 
            if(varx=="salir")
            {
                break;
            }
        }
    }
}
