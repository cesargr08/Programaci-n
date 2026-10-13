public class CalculadoraCombustible {
    public static void main(String[] args) {

    double consumoPorKm = 14.75;
    int reservaSeguridad = 500;

    int distanciaKm = 4800;
    double precioLitro = 2.35;
    
        double litrosTotalesExa = ((double)distanciaKm * (double)consumoPorKm) + reservaSeguridad;
        double costeTotalExa = (litrosTotalesExa * precioLitro);

        int litrosOficialesComprar = (int) litrosTotalesExa;
        int costePresupuestado = (int) costeTotalExa;
        
        System.out.println("---PRESUPUESTO---");
        System.out.println("Estos son los litros consumidos o por consumir: "+litrosTotalesExa+"L");
        System.out.println("Este es el coste total exacto: "+ costeTotalExa+"€");
        System.out.println("Estos son los litros oficiales a comprar: "+ litrosOficialesComprar+"L");
        System.out.println("Y este es el coste redondeado: "+ costePresupuestado+"€");
    }
    
}
