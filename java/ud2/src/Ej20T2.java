
import java.util.Scanner;

public class Ej20T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = 0;
        
        int i = 0;

        do {
            System.out.print("Introduzca un número: ");
            num = entrada.nextInt();
            i = num + i;
            System.out.println("La suma es: " + i);
        } while (num < 0 || num > 0);
        System.out.println("Se acabó");

    }
}
