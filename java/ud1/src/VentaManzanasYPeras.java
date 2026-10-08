
import java.util.Scanner;

public class VentaManzanasYPeras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digame los kilos de manzana que has vendido: ");
        double kilosManzana = sc.nextDouble();

        System.out.print("Digame los kilos de pera que has vendido: ");
        double kilosPera = sc.nextDouble();

        kilosManzana = kilosManzana * 2.35;
        kilosPera = kilosPera * 1.95;

        System.out.println("HAS HECHO:");
        System.out.println("Dinero de las manzanas: " + kilosManzana);
        System.out.println("Dinero de las peras: " + kilosPera);
    }
}
