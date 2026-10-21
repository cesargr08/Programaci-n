import java.util.Scanner;

public class Ej19T2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final int pin = 1234;
       
        System.out.print("Introduce el pin: ");
        int pin2 = entrada.nextInt();
        
        if (pin == pin2){
            System.out.println("Ha accedido al sistema");
        }
        if (pin < pin2 || pin > pin2){
                System.out.println("No ha conseguido acceder al sistema");
                }
    
    }
    
    
}
