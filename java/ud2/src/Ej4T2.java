
import java.util.Scanner;

public class Ej4T2 {

    public static void main(String[] args) {

        final String USUARIO_CORRECTO = "admin";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre de usuario: ");
        String nombre = teclado.nextLine();

        if (nombre.equals(USUARIO_CORRECTO))  {
            System.out.println("¡Bienvenido!");

        }else{
            System.out.println("Usuario incorrecto");
        }
    }
}