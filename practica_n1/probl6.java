import java.util.*;

public class probl6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num, cont = 0, i, j;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        for(i = 2; i <= num; i++) {
            cont = 0;
            for(j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cont++;
                }
            }
            if(cont == 2){
                System.out.print( i + " ");
            }
        } 
    } 
}
