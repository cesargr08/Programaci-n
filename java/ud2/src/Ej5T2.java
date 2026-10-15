
import java.util.Scanner;

public class Ej5T2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n1 = entrada.nextInt();

        System.out.print("Introduce otro número: ");
        int n2 = entrada.nextInt();

        if (n1 < n2) {
            System.out.println("El segundo número es mayor al primero");
        }
        if (n1 > n2) {
            System.out.println("El primer número es mayor al segundo");
        }
        if (n1 == n2) {
            System.out.println("Ambos números son iguales");
        }

    }

}
