//Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.

import java.util.*;

public class probl1 {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Declaracion de Variables
        float gradc, gradf; 
        
        System.out.println("Introduce grados Centígrados: "); 
        gradc = sc.nextFloat();
        //Prodecimiento para convertir a Farenheit
        gradf = 32 + (9 * gradc / 5); 

        //Imprimir Resultado
        System.out.println(gradc + " C = " + gradf + " F"); 
        sc.close();                                             
  }
}
