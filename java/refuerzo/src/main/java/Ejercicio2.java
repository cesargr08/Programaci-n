import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera calificación: ");
        double calificacion1 = sc.nextDouble();

        System.out.print("Introduce la segunda calificación: ");
        double calificacion2 = sc.nextDouble();

        System.out.print("Introduce la tercera calificación: ");
        double calificacion3 = sc.nextDouble();

        double promedio = (calificacion1 * 0.20)
                        + (calificacion2 * 0.50)
                        + (calificacion3 * 0.30);

        if (promedio > 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        sc.close();
    }
}