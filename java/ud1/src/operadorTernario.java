public class operadorTernario {

    public static void main(String[] args) {

        // 1. Operadores aritméticos, relacionales y lógicos
        // Mayor precedencia: * (multiplicación).
        boolean resultado1 = 10 + 5 * 2 > 20 && 4 == 4;

        // 2. Operadores aritméticos, relacionales y lógicos
        // Mayor precedencia: los paréntesis (); después, los operadores aritméticos como + y *.
        boolean resultado2 = !(7 + 3 > 10) || 3 * 2 <= 6;

        // 3. Operadores aritméticos, relacionales y lógicos
        // Mayor precedencia: / y *, que tienen la misma precedencia y se evalúan de izquierda a derecha.
        boolean resultado3 = 10 / 2 + 3 * 5 == 19 && false;

        // 4. Operadores de asignación y aritméticos
        // Mayor precedencia: * (multiplicación).
        int x = 5;
        x += 3 * 2;

        // 5. Operadores de asignación, lógicos, relacionales y aritméticos
        // Mayor precedencia: ! (negación lógica).
        boolean b = false;
        b = !b || 7 % 2 == 1;

        // Mostrar resultados
        System.out.println("Resultado de la expresión 1: " + resultado1);
        System.out.println("Resultado de la expresión 2: " + resultado2);
        System.out.println("Resultado de la expresión 3: " + resultado3);
        System.out.println("Valor final de x: " + x);
        System.out.println("Valor final de b: " + b);
    }
}