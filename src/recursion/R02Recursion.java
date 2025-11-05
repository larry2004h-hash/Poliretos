package recursion;

public class R02Recursion {
    
    // Método principal para mostrar los resultados
    public void mostrarSuma(int a, int b) {
        System.out.println("\nR02 - Suma de " + a + " y " + b + ":\n");

        System.out.println("→ Usando FOR:");
        System.out.println("Suma(" + a + ", " + b + ") = " + sumaFor(a, b));

        System.out.println("\n→ Usando WHILE:");
        System.out.println("Suma(" + a + ", " + b + ") = " + sumaWhile(a, b));

        System.out.println("\n→ Usando DO-WHILE:");
        System.out.println("Suma(" + a + ", " + b + ") = " + sumaDoWhile(a, b));

        System.out.println("\n→ Usando RECURSIVIDAD:");
        System.out.println("Suma(" + a + ", " + b + ") = " + sumaRecursiva(a, b));
    }

    // =============================
    // Suma con FOR
    // =============================
    public int sumaFor(int a, int b) {
        int resultado = a;
        if (b >= 0) {
            for (int i = 0; i < b; i++) {
                resultado++;
            }
        } else {
            for (int i = 0; i > b; i--) {
                resultado--;
            }
        }
        return resultado;
    }

    // =============================
    // Suma con WHILE
    // =============================
    public int sumaWhile(int a, int b) {
        int resultado = a;
        int i = 0;
        if (b >= 0) {
            while (i < b) {
                resultado++;
                i++;
            }
        } else {
            while (i > b) {
                resultado--;
                i--;
            }
        }
        return resultado;
    }

    // =============================
    // Suma con DO-WHILE
    // =============================
    public int sumaDoWhile(int a, int b) {
        int resultado = a;
        int i = 0;
        if (b > 0) {
            do {
                resultado++;
                i++;
            } while (i < b);
        } else if (b < 0) {
            do {
                resultado--;
                i--;
            } while (i > b);
        }
        return resultado;
    }

    // =============================
    // Suma RECURSIVA
    // =============================
    public int sumaRecursiva(int a, int b) {
        if (b == 0) return a;
        if (b > 0) return sumaRecursiva(a + 1, b - 1);
        else return sumaRecursiva(a - 1, b + 1);
    }
}
