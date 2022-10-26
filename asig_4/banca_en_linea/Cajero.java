import java.util.Scanner;
import java.util.InputMismatchException;

public class Cajero {
    public static void main (String [] args){
        //Crear objetos de de lectura
        Scanner sn = new Scanner (System.in);
        //Crear objetos
        Deposito objdepositar = new Deposito();
        Retiro objretirar = new Retiro();
        //Declaracin de variables
        int opc = 0, numcuenta;
        double Sinicial = 1000;
        String nombre;
        //Pedir nombre y numero de cuenta
        System.out.println("Introduzca su nombre");
        nombre = sn.nextLine();
        System.out.println("Introduzca su Numero de cuenta ");
        numcuenta = sn.nextInt();

        while (opc!=3){
            System.out.println("Menu ");
            System.out.println("1. Depositar ");
            System.out.println("2. Retirar ");
            System.out.println("3. Salir ");
            opc= sn.nextInt();
            try {
                switch(opc){
                case 1:
                    Sinicial = objdepositar.Depositar(nombre, numcuenta, Sinicial);
                    break;
                case 2:
                    Sinicial = objretirar.Depositar(nombre, numcuenta, Sinicial);
                    break;
                case 3:
                    System.out.println(nombre + " gracias por usar nuestros servicios, tenga un lindo dia \nSaldo: $" + Sinicial);
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                }//fin switch case
            
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }//fin try catch
        }//fin while
        sn.close();
    }//fin main
}//fin class
