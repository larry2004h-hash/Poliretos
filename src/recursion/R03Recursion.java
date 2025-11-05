package recursion;

public class R03Recursion {
    
    // Método principal que muestra la multiplicación usando distintos métodos
    public void mostrarMultiplicacion(int a, int b) {
        System.out.println("\nR03 - Multiplicación de " + a + " x " + b + ":");

        // FOR
        System.out.println("\n? Usando FOR:");
        int resultadoFor = multiplicacionFor(a, b);
        System.out.println(a + " x " + b + " = " + resultadoFor);

        // WHILE
        System.out.println("\n? Usando WHILE:");
        int resultadoWhile = multiplicacionWhile(a, b);
        System.out.println(a + " x " + b + " = " + resultadoWhile);

        // DO-WHILE
        System.out.println("\n? Usando DO-WHILE:");
        int resultadoDoWhile = multiplicacionDoWhile(a, b);
        System.out.println(a + " x " + b + " = " + resultadoDoWhile);

        // RECURSIVO
        System.out.println("\n? Usando RECURSIVIDAD:");
        int resultadoRecursivo = multiplicacionRecursiva(a, b);
        System.out.println(a + " x " + b + " = " + resultadoRecursivo);
    }

    // =======================
    // Métodos for, while, do while
    // =======================

    private int multiplicacionFor(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    private int multiplicacionWhile(int a, int b) {
        int resultado = 0;
        int i = 0;
        while (i < b) {
            resultado += a;
            i++;
        }
        return resultado;
    }

    private int multiplicacionDoWhile(int a, int b) {
        if (b <= 0) return 0;
        int resultado = 0;
        int i = 0;
        do {
            resultado += a;
            i++;
        } while (i < b);
        return resultado;
    }

    // =======================
    // Método recursivo
    // =======================

    private int multiplicacionRecursiva(int a, int b) {
        if (b == 0) {
            return 0; // caso base
        } else {
            return a + multiplicacionRecursiva(a, b - 1);
        }
    }
}
