import java.util.*;

class probl4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int num;

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        while(num > 0){
            if(num % 2 == 0){
                num = num / 2;
                System.out.println(num + " / 2");
            }
            else if(num % 3 == 0){
                num = num / 3;
                System.out.println(num + " / 3");
            }
            else if(num % 5 == 0){
                num = num / 5;
                System.out.println(num + " / 5");
            }
        }
    }
}
