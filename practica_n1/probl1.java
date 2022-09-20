import java.util.*;

public class probl1 {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float gradc, gradf;
        
        System.out.println("Introduce grados Centígrados: ");
        gradc = sc.nextFloat();
        gradf = 32 + (9 * gradc / 5);

        System.out.println(gradc + " C = " + gradf + " F");
        sc.close();                                             
  }
}
