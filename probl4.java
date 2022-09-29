import java.util.*;

public class probl4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String item[] = {"Zapatos", "Vestidos", "Carteras", "Sombreros"};
        double prec[] = {25,15.50,150.75,5};
        int cant[] = {150,100,2,10};
        String opc;
        int cantc, i;
        double cost = 0;

        System.out.printf("--------------------------------%n");
        System.out.printf("| %5s | %5s | %5s |%n", "ITEM", "PRECIO", "CANTIDAD");
        System.out.printf("--------------------------------%n");
        for(i=0; i<3; i++){
            System.out.printf("| %5s | %5s | %5s |%n", item[i], prec[i], cant[i]);
        }
        System.out.printf("--------------------------------%n");

        System.out.print("Introduzca el item que desea comprar: "); 
        opc = sc.nextLine();
        System.out.print("Introduzca la cantidad que desea comprar del producto escogido: "); 
        cantc = sc.nextInt();

        opc = opc.toLowerCase();
        if(opc.equals("zapatos")){
            if(cantc > cant[0]){
                System.out.print("No hay suficiente inventario para sastifacer su pedido."); 
            }
            else{
                cant[0] = cant[0] - cantc;
                cost = prec[0] * cantc;
            }
        }
        else if(opc.equals("vestidos")){
            if(cantc > cant[1]){
                System.out.print("No hay suficiente inventario para sastifacer su pedido."); 
            }
            else{
                cant[1] = cant[1] - cantc;
                cost = prec[1] * cantc;
                System.out.print("Su total a pagar es de: " + cost); 
            }
        }
        else if(opc.equals("carteras")){
            if(cantc > cant[2]){
                System.out.print("No hay suficiente inventario para sastifacer su pedido."); 
            }
            else{
                cant[2] = cant[2] - cantc;
                cost = prec[2] * cantc;
                System.out.print("Su total a pagar es de: " + cost); 
            }
        }
        else if(opc.equals("sombreros")){
            if(cantc > cant[3]){
                System.out.print("No hay suficiente inventario para sastifacer su pedido."); 
            }
            else{
                cant[3] = cant[3] - cantc;
                cost = prec[3] * cantc;
                System.out.print("Su total a pagar es de: " + cost); 
            }
        }
        else{
            System.out.print("No escogio ninguna de las opciones anteriores."); 
        }
        
        System.out.printf("--------------------------------%n");
        System.out.printf("| %5s | %5s | %5s |%n", "ITEM", "PRECIO", "CANTIDAD");
        System.out.printf("--------------------------------%n");
        for(i=0; i<3; i++){
            System.out.printf("| %5s | %5s | %5s |%n", item[i], prec[i], cant[i]);
        }
        System.out.printf("--------------------------------%n");

       sc.close(); 
    }
}
