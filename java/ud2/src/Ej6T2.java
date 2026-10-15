
import java.util.Scanner;

public class Ej6T2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n1 = entrada.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }

    }

}