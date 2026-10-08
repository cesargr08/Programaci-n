
import java.util.Scanner;

public class EntradaCine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Como se llama el cliente?: ");
        String cliente = sc.nextLine();

        System.out.print("¿Que edad tiene?: ");
        int edad = sc.nextInt();

        double precio = (edad <= 12) ? 5 : 8;
        System.out.println("Clientes: " + cliente);
        System.out.println("Edad: " + edad);
        System.out.println("Precio de la entrada: " + precio + "€");
    }
}