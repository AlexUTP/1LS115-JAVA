import java.util.*;

public class probl2 {
 public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int numero, val, mayor = 0, menor = 100000;
        double prom = 0;

        try {
            System.out.println("Cuantos numeros quiere ingresar: ");
            numero = leer.nextInt();

            for(int i = 1; i <= numero; i++){//ciclo para ingresar la cantidad de numeros ingresadas por el usuario
                System.out.println("Ingrese un numero ["+i+"]: ");
                val=leer.nextInt();

                if(val>mayor){//busca el numero mayor
                    mayor=val;//guarda el numero mayor
                }

                if(val<menor){//busca el numero menor
                    menor=val;//guarda el numero menor
                }
                
                prom=prom+val; //calcular la suma de los numeros ingresados
            } //cerrar for
            
            prom=prom/numero; //calcular el promedio de los numeros ingresados
            System.out.println("El numero mayor es: "+ mayor);
            System.out.println("El numero menor es: "+ menor);
            System.out.println("El promedio es: " + prom);
            
        } catch (Exception e){
            System.out.println("ERROR: No ingresaste un numero.");
        } 
        leer.close();
    }
}