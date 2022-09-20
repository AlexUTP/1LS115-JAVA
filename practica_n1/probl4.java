import java.util.*;

public class probl4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        while(num > 1){
            if(num % 2 == 0){
                System.out.println(num + " / 2");
                num = num / 2;
            }
            else if(num % 3 == 0){
                System.out.println(num + " / 3");
                num = num / 3;
            }
            else if(num % 5 == 0){
                System.out.println(num + " / 5");
                num = num / 5;
            }
        }
        System.out.println(num);
        sc.close();
    }
}
