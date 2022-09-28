import java.util.*;

public class probl2 {
 public static void main(String[] args) {
    
        Scanner Leer = new Scanner(System.in);
        int numero, val,mayor,menor;
        double prom;

        try {
            System.out.println("Cuantos numeros quiere ingresar: ");
            numero=Leer.nextInt();

            mayor=0;
            menor=100000;
            prom=0;

            for(int i=1;i<=numero;i++){//ciclo para ingresar la cantidad de numeros ingresadas por el usuario
                System.out.println("Ingrese un numero ["+i+"]: ");
                val=Leer.nextInt();

                if(val>mayor){//Busca el numero mayor
                    mayor=val;//guarda el numero mayor
                }

                if(val<menor) {//Busca el numero menor
                    menor=val;//guarda el numero menor
                }
                
            prom=prom+val;//calcular la suma de los numeros ingresados
            }
            prom=prom/numero;//calcular el promedio de los numeros ingresados
            System.out.println("El numero Mayor es: "+mayor);
            System.out.println("El numero Menor es: "+menor);
            System.out.println("El Promedio es: "+prom);
            
        } catch (Exception e) {
            System.out.println("ERROR: No ingresaste un numero");
        }
        Leer.close();//cerrar scanner
    }//fin main
}//fin class