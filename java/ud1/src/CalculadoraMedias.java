import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digame las notas del 1º trimestre: ");
        double primerTrimestre = sc.nextDouble();
       
        System.out.print("Digame las notas del 2º trimestre: ");
        double segundoTrimestre = sc.nextDouble();
       
        System.out.print("Digame las notas del 3º trimestre: ");
        double tercerTrimestre = sc.nextDouble();
        
        double media = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;
        
        System.out.println("        ---SU BOLETIN---");
        System.out.println("Su media del 1º trimestre es: "+ primerTrimestre);
        System.out.println("Su media del 2º trimestre es: "+ segundoTrimestre);
        System.out.println("Su media del 3º trimestre es: "+ tercerTrimestre);
        System.out.println("Su media TOTAL: "+ media);
        System.out.println("Su media TOTAL truncada: "+ (int)media);


        
        
        
    }
}
