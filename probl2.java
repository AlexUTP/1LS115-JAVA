import java.util.*;

class probl2 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);
        double cata, catb, hipo;
        int opc;
        
        System.out.println("1. Buscar cateto a ");
        System.out.println("2. Buscar cateto b");
        System.out.println("3. Buscar hipotenusa");
        System.out.println("Ingrese una opcion: ");
        opc = sc.nextInt();

        switch(opc){
            case 1:
                System.out.println("Ingrese la hipotenusa: ");
                hipo = sc.nextDouble();
                System.out.println("Ingrese cateto b: ");
                catb = sc.nextDouble();
                cata = Math.sqrt(Math.pow(hipo, 2) - Math.pow(catb, 2));
                System.out.println("Su resultado es: " + cata);
                break;
            case 2:
                System.out.println("Ingrese la hipotenusa: ");
                hipo = sc.nextDouble();
                System.out.println("Ingrese cateto a: ");
                cata = sc.nextDouble();
                catb = Math.sqrt(Math.pow(hipo, 2)- Math.pow(cata, 2));
                System.out.println("Su resultado es: " + catb);
                break;
            case 3:
                System.out.println("Ingrese cateto a: ");
                cata = sc.nextDouble();
                System.out.println("Ingrese cateto b: ");
                catb = sc.nextDouble();
                hipo = Math.sqrt(Math.pow(cata, 2)+ Math.pow(cata, 2));
                System.out.println("Su resultado es: " + hipo);
                break;
        }
    }
}
