package recursion;

public class R04Recursion {
    
    // Método principal que muestra la potencia usando distintos métodos
    public void mostrarPotencia(int a, int b) {
        System.out.println("\nR04 - Potencia de " + a + "^" + b + ":");

        // FOR
        System.out.println("\n? Usando FOR:");
        long resultadoFor = potenciaFor(a, b);
        System.out.println(a + "^" + b + " = " + resultadoFor);

        // WHILE
        System.out.println("\n? Usando WHILE:");
        long resultadoWhile = potenciaWhile(a, b);
        System.out.println(a + "^" + b + " = " + resultadoWhile);

        // DO-WHILE
        System.out.println("\n? Usando DO-WHILE:");
        long resultadoDoWhile = potenciaDoWhile(a, b);
        System.out.println(a + "^" + b + " = " + resultadoDoWhile);

        // RECURSIVO
        System.out.println("\n? Usando RECURSIVIDAD:");
        long resultadoRecursivo = potenciaRecursiva(a, b);
        System.out.println(a + "^" + b + " = " + resultadoRecursivo);
    }

    // =======================
    // Métodos for, while, do while
    // =======================

    private long potenciaFor(int a, int b) {
        long resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    private long potenciaWhile(int a, int b) {
        long resultado = 1;
        int i = 0;
        while (i < b) {
            resultado *= a;
            i++;
        }
        return resultado;
    }

    private long potenciaDoWhile(int a, int b) {
        if (b == 0) return 1;
        long resultado = 1;
        int i = 0;
        do {
            resultado *= a;
            i++;
        } while (i < b);
        return resultado;
    }

    // =======================
    // Método recursivo
    // =======================

    private long potenciaRecursiva(int a, int b) {
        if (b == 0) {
            return 1; // cualquier número elevado a 0 = 1
        } else {
            return a * potenciaRecursiva(a, b - 1);
        }
    }
}
