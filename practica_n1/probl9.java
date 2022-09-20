import java.util.*;

public class probl9 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        char caracter; 
        int ascii;
        boolean cierto = true;
        
        do{
            System.out.println("Ingrese el caracter que desea convertir a ASCII: ");
            caracter = sc.next().charAt(0); 
            ascii = caracter;
            if(ascii >= 32 && ascii <= 126){
                System.out.println("El caracter " + caracter + " es el numero " + ascii + " en la tabla");
                cierto = false;
            }
            else{
                System.out.println("ERROR: El caracter ingresado no es ASCII.");
            }
        }while(cierto);
        sc.close();
    }
}

