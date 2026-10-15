
import java.util.Scanner;

public class Ej8T2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");
        int n1 = entrada.nextInt();

        if (n1 == 5) {
            System.out.println("Es suficiente");
        }
        else if (n1 == 6){
            System.out.println("Es un bien");
        
            else if (n1 == 0) || (n1 == 1) || (n1 ==  2) || (n1 == 3) || (n1 == 4){
            System.out.println("Es un insuficiente");
        }
        }
        }
    }

