package recursion;

public class R06Recursion {
    
    // Método principal que muestra los conteos
    public void mostrarConteoRegresivo(int n) {
        System.out.println("Conteo regresivo desde " + n + " hasta 0:\n");

        System.out.print("→ Recursivo: ");
        conteoRegresivo(n);
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
    private static void conteoRegresivo(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            conteoRegresivo(n - 1); // Llamada recursiva
        }
    }

    // Versión con for
    private static void conteoFor(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    // Versión con while
    private static void conteoWhile(int n) {
        int i = n;
        while (i >= 0) {
            System.out.print(i + " ");
            i--;
        }
    }

    // Versión con do-while
    private static void conteoDoWhile(int n) {
        int i = n;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 0);
    }
}
