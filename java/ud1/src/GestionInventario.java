public class GestionInventario {
    public static void main(String[] args) {
        int pociones = 0;
        double precioUnitario = 10;
        boolean mochilaLlena = false;
        double oro = 200;

        int cantidadCompra = 3;
        double importe = cantidadCompra * precioUnitario;

        if (pociones + cantidadCompra >= 2) { 
            mochilaLlena = true;
            
            pociones = pociones + cantidadCompra; 
            oro = oro - importe;                  
        } 

        System.out.println("Pociones iniciales (simuladas): 0");
        System.out.println("Mochila llena: false");       
        System.out.println("Oro inicial: 200.0");
        System.out.println("---DESPUES DE COMPRAR 3 POCIONES---");
        System.out.println("Mochila llena: " + mochilaLlena); 
       
        System.out.println("Pociones actuales: " + pociones);
        System.out.println("Oro restante: " + oro); 
    }
}