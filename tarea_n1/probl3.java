
//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.util.*;

public class probl3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max, num1 = 0, num2 = 1, sum = 1, cont = 1;
    try {//atrapa el error
        System.out.print("Introduce un valor numerico: "); 
        max = sc.nextInt();
        System.out.println("Su entrada es: " + max);
        System.out.print("Su salida es: 0 "); 
        
        while (cont <= max) {//ciclo para calcular la serie Fibonacci
          System.out.print(sum + " ");
          sum = num1 + num2;
          num1 = num2;
          num2 = sum;
          cont++;
          
        }//fin while
    } catch (Exception e){
        System.out.print("ERROR: No introduciste un numero."); 
    }
    sc.close();
  }
}