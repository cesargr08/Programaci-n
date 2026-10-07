import java.util.Scanner;

public class CondicionSalirALaCalle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean estaLloviendo = sc.nextBoolean();

        System.out.print("¿Has acabado la tarea? (true/false): ");
        boolean tareaTerminada = sc.nextBoolean();

        System.out.print("¿Quieres ir a la biblioteca? (true/false): ");
        boolean quiereIrBiblioteca = sc.nextBoolean();
        
        boolean puedeSalir = !estaLloviendo && tareaTerminada && quiereIrBiblioteca;
        System.out.println("Puedes salir: " + puedeSalir);
    }
}