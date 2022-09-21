//Programa que calcule el área y perímetro de un triángulo en función de las longitudes de sus lados (a, b, c), según la captura del usuario en pantalla.

import java.util.*;

public class probl3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        //Declaracion de Variables
        double lada, ladb, ladc, perimetro, area, sp;

        System.out.println("Ingrese el lado a: ");
        lada= sc.nextDouble();

        System.out.println("Ingrese el lado b: ");
        ladb= sc.nextDouble();

        System.out.println("Ingrese el lado c: ");
        ladc= sc.nextDouble();

        perimetro = lada + ladb + ladc; //Calcular promedio
        sp = (lada + ladb + ladc) / 2; //Sacar semi perimetro
        area = (Math.sqrt(sp * (sp - lada) * (sp - ladb) * (sp - ladc))); //Calcular area

        System.out.println("El area del triangulo es: " + area + " y el perimetro es: " + perimetro);
        sc.close();
    }
}
