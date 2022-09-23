import java.util.*;

public class probl8 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num, temp = 0;
        int decimal = 0;
        int p = 0;

        System.out.println("Ingrese un numero binario de 5 digitos: ");
        num = sc.nextInt();
        try {
            while(true){
                if(num == 0){
                    break;
                } 
                else{
                    temp = num % 10;
                    decimal += temp * Math.pow(2, p);
                    num = num / 10;
                    p++;
                }
            }
            System.out.println("El numero binario convertido a decimal es: " + decimal);
            sc.close();
        } catch(Exception e){
            System.out.println("ERROR: No introduciste un numero binario.");
        }
    }
}
