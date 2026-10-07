public class CalculadorTiempo {
        public static void main(String[] args){
            
int totalSegundos = 3725;

int horas = totalSegundos / 3600;
int minutos = (totalSegundos % 3600) / 60;
int segundos = totalSegundos % 60;

System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

        }
}