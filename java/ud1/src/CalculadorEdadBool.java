import java.util.Scanner;

public class CalculadorEdadBool {
        public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la edad que tienes: ");
        int edad = teclado.nextInt();
        
        boolean mayorEdad = edad >= 18;
        System.out.println("¿Eres mayor de edad? " + mayorEdad);      
        
        }
}
