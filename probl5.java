import java.util.*;

class probl5{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num, rest, div = 10000;

        System.out.println("Ingrese un numero de 5 digitos: ");
        num = sc.nextInt();
        while(div > 0){
            rest = num / div;
            System.out.println(rest);
            div = div / 10;
        }
    }
}