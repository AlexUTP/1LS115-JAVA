import java.util.*;

public class probl1 {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    String palabra;
    char caracter;
    int valorCaracter;

    System.out.print("Introduzca un caracter: ");
    palabra = entrada.next();

    if (palabra.length() == 1) {
      caracter = palabra.charAt(0);//convierte la cadena a caracter
      valorCaracter = caracter;//convierte el caracter a su valor ascii
      
      if (valorCaracter >= 48 && valorCaracter <= 57) { //verificar si es numero
        System.out.println("USTED HA INGRESADO UN NUMERO");
      } else if (valorCaracter >= 65 && valorCaracter <= 90) { //verificar si es una letra mayuscula
        System.out.println("USTED HA INGRESADO UNA LETRA MAYUSCULA");
      } else if (valorCaracter >= 97 && valorCaracter <= 122) { //verificar si es una letra minuscula
        System.out.println("USTED HA INGRESADO UNA LETRA MINUSCULA");
      } else {
        System.out.println("VALOR NO RECONOCIDO");
      }
    }
    else {
      System.out.println("Usted ha ingresado mas de una letra.");
    } //fin if
    entrada.close();
  }
}