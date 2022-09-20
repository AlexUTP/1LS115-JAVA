import java.util.*;
import java.text.DecimalFormat;

class probl7 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int i, nummay = 0, nummen = 0;
        int [] num = new int[3];
        double prom = 0;
       
        for(i = 0; i < 3 ; i++){
            System.out.println("Ingrese un numero ["+ (i+1) + "]: ");
            num [i] = sc.nextInt();
            prom = prom + num[i];
        }
        
        if(num[0] > num[1] && num[0] > num[2]){
            nummay = num[0];
        }
        else if(num[1] > num[0] && num[1] > num[2]){
            nummay = num[1];
        }
        else{
            nummay = num[2];
        }

        if(num[0] < num[1] && num[0] < num[2]){
            nummen = num[0];
        }
        else if(num[1] < num[0] && num[1] < num[2]){
            nummen = num[1];
        }
        else{
            nummen = num[2];
        }

        System.out.println("El numero mayor es: "+ nummay + " y el numero menor es: " + nummen);
        System.out.println("El promedio es: " + df.format(prom / 3));
    }
}
