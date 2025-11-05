package recursion;

public class R05Recursion {
    
    
    // Método principal que muestra los conteos
    public void mostrarConteo(int n) {
        System.out.println("Conteo progresivo hasta " + n + ":\n");

        System.out.print("→ Recursivo: ");
        mostrarConteoProgresivoHasta(n);
        System.out.println();

        System.out.print("→ For: ");
        conteoFor(n);
        System.out.println();

        System.out.print("→ While: ");
        conteoWhile(n);
        System.out.println();

        System.out.print("→ Do-While: ");
        conteoDoWhile(n);
        System.out.println();
    }

    // Método recursivo
    private static void mostrarConteoProgresivoHasta(int n) {
        if (n > 0) {
            mostrarConteoProgresivoHasta(n - 1); // Llamada recursiva
            System.out.print(n + " ");
        }
    }

    // Versión con for
    private static void conteoFor(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    // Versión con while
    private static void conteoWhile(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }

    // Versión con do-while
    private static void conteoDoWhile(int n) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}
