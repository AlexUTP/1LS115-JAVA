
//Alexander Caballero 8-997-2227 || Nahin Mendoza 9-889-50 || Shaniska Walker 8-992-2056 || Camilo Yepes 20-14-6092

import java.util.*;

public class probl4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String item[] = {"Zapatos", "Vestidos", "Carteras", "Sombreros"}; //Crear Arreglos
        double prec[] = {25,15.50,150.75,5};
        int cant[] = {150,100,2,10};
        String opc;
        int cantc, i;
        double cost = 0;
        try {
            //Imprimir Inventario
            System.out.printf("----------------------------------%n");
            System.out.printf("| %9s | %7s | %8s |%n", "ITEM", "PRECIO", "CANTIDAD");
            System.out.printf("----------------------------------%n");
            for(i=0; i < 4; i++){
                System.out.printf("| %9s | %7s | %8s |%n", item[i], prec[i], cant[i]);
            }
            System.out.printf("----------------------------------%n");

            System.out.print("Introduzca el item que desea comprar: "); 
            opc = sc.nextLine();
            System.out.print("Introduzca la cantidad que desea comprar del producto escogido: "); 
            cantc = sc.nextInt();

            opc = opc.toLowerCase();
            if(opc.equals("zapatos")){ //Inicio if para calcular total a pagar y actualizar inventario de los items
                if(cantc > cant[0]){
                    System.out.print("No hay suficiente inventario para sastifacer su pedido."); 
                }
                else{
                    cant[0] = cant[0] - cantc; //Actualizar item en el arreglo
                    cost = prec[0] * cantc; //Calcular costo a pagar
                    System.out.println("Su total a pagar es de: " + cost); 
                }
            }
            else if(opc.equals("vestidos")){
                if(cantc > cant[1]){
                    System.out.println("No hay suficiente inventario para sastifacer su pedido."); 
                }
                else{
                    cant[1] = cant[1] - cantc;
                    cost = prec[1] * cantc;
                    System.out.println("Su total a pagar es de: " + cost); 
                }
            }
            else if(opc.equals("carteras")){
                if(cantc > cant[2]){
                    System.out.println("No hay suficiente inventario para sastifacer su pedido."); 
                }
                else{
                    cant[2] = cant[2] - cantc;
                    cost = prec[2] * cantc;
                    System.out.println("Su total a pagar es de: " + cost); 
                }
            }
            else if(opc.equals("sombreros")){
                if(cantc > cant[3]){
                    System.out.println("No hay suficiente inventario para sastifacer su pedido."); 
                }
                else{
                    cant[3] = cant[3] - cantc;
                    cost = prec[3] * cantc;
                    System.out.println("Su total a pagar es de: " + cost); 
                }
            }
            else{
                System.out.println("ERROR: No escogio ninguna de las opciones anteriores."); 
            } //Fin If
            //Imprimir Inventario Actualizado
            System.out.printf("----------------------------------%n");
            System.out.printf("| %9s | %7s | %8s |%n", "ITEM", "PRECIO", "CANTIDAD");
            System.out.printf("----------------------------------%n");
            for(i=0; i < 4; i++){
                System.out.printf("| %9s | %7s | %8s |%n", item[i], prec[i], cant[i]);
            }
            System.out.printf("----------------------------------%n");
        } catch (Exception e){
            System.out.print("ERROR: No introdujo uno de los valores pedidos."); 
        }
        sc.close(); 
    }
}
