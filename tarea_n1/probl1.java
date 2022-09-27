import java.util.*;

public class probl1 {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    char caracter;
    int valorCaracter;

    try {
      System.out.print("Introduzca un caracter: ");
      caracter = entrada.next().charAt(0);
      valorCaracter = caracter;

      if (valorCaracter >= 48 && valorCaracter <= 57) {
        System.out.println("USTED HA INGRESADO UN NUMERO");
      }
      else if (valorCaracter >= 65 && valorCaracter <= 90) {
        System.out.println("USTED HA INGRESADO UNA LETRA MAYUSCULA");
      }
      else if (valorCaracter >= 97 && valorCaracter <= 122) {
        System.out.println("USTED HA INGRESADO UNA LETRA MINUSCULA");
      }
      else {
        System.out.println("VALOR NO RECONOCIDO");
      }
    }
    catch (InputMismatchException ex) {
      System.out.println("Debe ingresar una letra ");
    }
    entrada.close();
  }
}