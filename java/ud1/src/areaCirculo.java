import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = teclado.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);
    }
}