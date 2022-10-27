import java.util.*;

public class new_user{
    public static double[] NotaUsuario(){
        Scanner sc = new Scanner(System.in);
        double[] nota = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Ingrese la nota ["+(i+1)+"]: ");
            nota[i] = sc.nextDouble();
        }
        sc.close();
        return nota;
    }

    public static String[] NameContra(){
        Scanner sc = new Scanner(System.in);
        String[] nomb_pass = new String[2];

        System.out.print("Ingrese el nombre del usuario: ");
        nomb_pass[0] = sc.nextLine();

        System.out.print("Ingrese la contrasena del usuario: ");
        nomb_pass[1] = sc.nextLine();

        sc.close();
        return nomb_pass;
    }
}
