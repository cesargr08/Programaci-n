import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu año de nacimiento: ");
        int fechaNacimiento = sc.nextInt();

        System.out.print("Introduce el año actual: ");
        int fechaActual = sc.nextInt();

        int edad = fechaActual - fechaNacimiento;

        if (edad >= 18) {
            System.out.println("Credencial Autorizada");
        } else {
            System.out.println("Credencial No Autorizada");
        }

    }
}