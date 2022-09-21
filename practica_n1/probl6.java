import java.util.*;

public class probl6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //Declaracion de variables
        int num, cont = 0, i, j;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        //Inicio ciclo for
        for(i = 2; i <= num; i++){
            cont = 0;
            for(j = 1; j <= i; j++){
                if(i % j == 0){ //condicion para verificar si es primo o no
                    cont++;
                }
            }
            if(cont == 2){
                System.out.print( i + " ");
            }
        } 
    } 
}
