
import java.util.Scanner;

public class Ej3T2 {

    public static void main(String[] args) {

        final String USUARIO_CORRECTO = "admin";

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre de usuario: ");
        String nombre = teclado.nextLine();

        if (nombre == (USUARIO_CORRECTO)) {
            System.out.println("¡Bienvenido!");

        }
    }
}