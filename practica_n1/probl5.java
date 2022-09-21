import java.util.*;

public class probl5{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        //Declaracion de Variables
        int num, rest, div = 10000;

        System.out.println("Ingrese un numero de 5 digitos: ");
        num = sc.nextInt();
        //Incio ciclo
        while(div > 0){ 
            rest = num / div; //Dividir num entre divisor
            System.out.println(rest);
            div = div / 10; //Dividir divisor entre 10
        }
        sc.close();
    }
}