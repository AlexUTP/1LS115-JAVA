
//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.util.*;

public class probl5 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double area,perimetro,base,altura,a,c,s,basemenor,lado1,lado2,radio;
        int opc;
        
        do{
            System.out.println("Que operacions desea realizar");//indicar que opcion desea escoger
            System.out.println("1. Calcular el area y el perimetro de un Cuadrilatero");
            System.out.println("2. Calcular el area y el perimetro de un Triangulo");
            System.out.println("3. Calcular el area y el perimetro de un Trapecio");
            System.out.println("4. Calcular el area y el perimetro de un Circulo");
            opc = sc.nextInt(); //guardar opcion
            if (opc == 1) {
                System.out.println("Introduzca el valor de la base: ");
                base= sc.nextFloat();
                System.out.println("Introduzca el valor del altura: ");
                altura= sc.nextFloat();
                area=base*altura;//calcular el area del rectangulo
                perimetro= 2*(base+altura);//hallar el perimetro
                System.out.println("El valor del area es: "+area);
                System.out.println("El valor del perimetro es: "+perimetro);
            }

            else if (opc==2){
                System.out.println("Introduce el valor de a");
                a=sc.nextDouble();
                System.out.println("Introduce el valor de b");
                base=sc.nextDouble();
                System.out.println("Introduce el valor de c");
                c=sc.nextDouble();
                perimetro=a+base+c;//calcular el perimetro del triangulo
                s=perimetro/2;//hallar el semiperimetro
                area=Math.sqrt(s*(s-a)*(s-base)*(s-c));//calcular el area del triangulo
                System.out.println("El valor del perimetro: "+perimetro);
                System.out.println("El valor del area es de: "+area);
            }

            else if(opc==3){
                System.out.println("Introduzca el valor de la base mayor: ");
                base = sc.nextFloat();
                System.out.println("Introduzca el valor de la base menor ");
                basemenor = sc.nextFloat();
                System.out.println("Introduzca el valor de la altura ");
                altura = sc.nextFloat();
                System.out.println("Introduzca el valor del lado 1 ");
                lado1 = sc.nextFloat();
                System.out.println("Introduzca el valor del lado 2 ");
                lado2 = sc.nextFloat();
                area = (base + basemenor) / 2 * altura;//calcular el area del trapecio
                perimetro = base + basemenor + lado1 + lado2;//calcular el perimetro
                System.out.println("El valor del area es: " + area);
                System.out.println("El valor del perimetro es: " + perimetro);
            }
                
            else if(opc==4){
                System.out.println("Introduzca el valor del radio: ");
                radio= sc.nextFloat();
                area=3.1416 * Math. pow(radio,2);//calcular el area del circulo
                perimetro=2*3.1416*radio;//calcular del perimetro
                System.out.println("El valor del area es: "+area);
                System.out.println("El valor del perimetro es: "+perimetro);
            }
            
            System.out.println("Si desea calcular otra figura ingrese 5, de lo contrario ingrese 6.");
            opc=sc.nextInt();
        }while(opc!=6);//fin do while
        sc.close();
    }
}