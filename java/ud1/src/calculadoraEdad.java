import java.util.Scanner;

public class CalculadoraEdad {
        public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu año de nacimiento: ");
        int nacimiento = teclado.nextInt();

        int edad = 2026 - nacimiento;

        System.out.println("Tu edad es: " + edad + " años.");
    }
}