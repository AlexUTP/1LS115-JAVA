import java.util.*;

public class probl3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double lada, ladb, ladc, perimetro, area, sp;

        System.out.println("Ingrese el lado a: ");
        lada= sc.nextDouble();

        System.out.println("Ingrese el lado b: ");
        ladb= sc.nextDouble();

        System.out.println("Ingrese el lado c: ");
        ladc= sc.nextDouble();

        perimetro = lada + ladb + ladc;
        sp = (lada + ladb + ladc) / 2;
        area = (Math.sqrt(sp * (sp - lada) * (sp - ladb) * (sp - ladc)));

        System.out.println("El area del triangulo es: " + area + " y el perimetro es: " + perimetro);
        sc.close();
    }
}
