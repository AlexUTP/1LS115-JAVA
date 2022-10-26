import java.util.*;

public class Deposito {
    public double Depositar(String nom, int numcuenta, Double saldoinicial) {
        //crear objetos de de lectura
        Scanner obtener = new Scanner(System.in);
        //declaracion de variables
        int opc1;
        double saldo;
        
        System.out.println("Hola " + nom + " " + numcuenta + " Bienvenido a Nuestra Banca en Linea");
        System.out.print("\n");
        while (true){
            System.out.println("1. Hacer deposito");
            System.out.println("2. Ver saldo actual");
            opc1 = obtener.nextInt();
            if (opc1 == 1) {
                System.out.println("Ingrese el monto");
                saldo = obtener.nextDouble();
                saldoinicial = saldoinicial + saldo;
                break;
            }
            else {
                System.out.println("Su saldo es de: " + saldoinicial);
            }//fin if
        } //fin while
        return saldoinicial;
    }//fin del metodo
}//fin class
