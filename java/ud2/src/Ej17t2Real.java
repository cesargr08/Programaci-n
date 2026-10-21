
import java.util.Scanner;

public class Ej17t2Real {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Mostrando saldo...");
            } else if (opcion == 2) {
                System.out.println("Retirando dinero...");
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el cajero. ¡Adiós!");
                break;
            }
        }
    }
}
