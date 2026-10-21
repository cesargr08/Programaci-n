
public class Ej18T2 {
    public static void main(String[] args) {

        double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};

        double total = 0;

        for (double precio : precios) {
            if (precio <= 0) {
                continue;
            }

            total += precio;
        }

        System.out.println("El total de la compra es: " + total);
    }
}
