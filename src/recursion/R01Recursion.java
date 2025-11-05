package recursion;

public class R01Recursion {

    // Método principal que muestra los resultados
    public void mostrarFactoriales(int n) {
        System.out.println("\nR01 - Factorial de " + n + ":\n");

        System.out.println("→ Usando FOR:");
        System.out.println("Factorial(" + n + ") = " + factorialFor(n));

        System.out.println("\n→ Usando WHILE:");
        System.out.println("Factorial(" + n + ") = " + factorialWhile(n));

        System.out.println("\n→ Usando DO-WHILE:");
        System.out.println("Factorial(" + n + ") = " + factorialDoWhile(n));

        System.out.println("\n→ Usando RECURSIVIDAD:");
        System.out.println("Factorial(" + n + ") = " + factorialRecursivo(n));
    }

    // =============================
    // Factorial con FOR
    // =============================
    public long factorialFor(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // =============================
    // Factorial con WHILE
    // =============================
    public long factorialWhile(int n) {
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    // =============================
    // Factorial con DO-WHILE
    // =============================
    public long factorialDoWhile(int n) {
        if (n == 0) return 1;
        long fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        return fact;
    }

    // =============================
    // Factorial RECURSIVO
    // =============================
    public long factorialRecursivo(int n) {
        if (n <= 1) return 1; // caso base
        return n * factorialRecursivo(n - 1);
    }
    
}