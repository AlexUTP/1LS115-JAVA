import java.util.*;

public class Retiro {
    public double Depositar(String nom, int numcuenta, Double saldoini) {
        //Crear objetos de de lectura
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int opc2;
        double saldocue;
        
        System.out.println("Hola " + nom + " " + numcuenta + " Bienvenido a Nuestra Banca en Linea");
        System.out.print("\n");
        while (true){
            System.out.println("1. Hacer retiro");
            System.out.println("2. Ver saldo actual");
            opc2 = leer.nextInt();
            if (opc2 == 1) {
                if (saldoini > 0) {
                    System.out.println("Ingrese el monto a retirar ");
                    saldocue = leer.nextDouble();
                    saldoini = saldoini - saldocue;
                    System.out.println("Su retiro ha sido exitoso");
                    break;
                }//fin if
            }
            else {
                System.out.println("Su saldo es de: " + saldoini);
            }//fin if
        } //fin while
        leer.close();
        return saldoini;
    }//fin del metodo
}//fin class
