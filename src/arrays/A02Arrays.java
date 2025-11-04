package arrays;

public class A02Arrays {
    public void mostrarSeries(int n) {
        if (n < 3) {
            System.out.println("Tamaño muy pequeño, usando tamaño 5 por defecto.");
            n = 5;
        }

        System.out.println("Iniciales: S  R");
        System.out.println("Tamaño: " + n + "x" + n + "\n");

        System.out.println("=== MÉTODO CON FOR ===");
        mostrarConFor(n);

        System.out.println("\n=== MÉTODO CON WHILE ===");
        mostrarConWhile(n);

        System.out.println("\n=== MÉTODO CON DO...WHILE ===");
        mostrarConDoWhile(n);
    }



    // ---------- FOR ----------
    private void mostrarConFor(int n) {
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < n; col++) {
                if (esParteDeS(fila, col, n)) System.out.print("*");
                else System.out.print(" ");
            }

            System.out.print("   "); 

            for (int col = 0; col < n; col++) {
                if (esParteDeR(fila, col, n)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // ---------- WHILE ----------
    private void mostrarConWhile(int n) {
        int fila = 0;
        while (fila < n) {
            int col = 0;
            while (col < n) {
                if (esParteDeS(fila, col, n)) System.out.print("*");
                else System.out.print(" ");
                col++;
            }

            System.out.print("   ");
            col = 0;

            while (col < n) {
                if (esParteDeR(fila, col, n)) System.out.print("*");
                else System.out.print(" ");
                col++;
            }
            System.out.println();
            fila++;
        }
    }


    // ---------- DO...WHILE ----------
    private void mostrarConDoWhile(int n) {
        int fila = 0;
        do {
            int col = 0;
            do {
                if (esParteDeS(fila, col, n)) System.out.print("*");
                else System.out.print(" ");
                col++;
            } while (col < n);

            System.out.print("   ");
            col = 0;

            do {
                if (esParteDeR(fila, col, n)) System.out.print("*");
                else System.out.print(" ");
                col++;
            } while (col < n);

            System.out.println();
            fila++;
        } while (fila < n);
    }

    
    private boolean esParteDeS(int fila, int col, int n) {
        int mid = n / 2;
        return fila == 0 || fila == mid || fila == n - 1 ||
               (fila < mid && col == 0) ||
               (fila > mid && col == n - 1);
    }

    private boolean esParteDeR(int fila, int col, int n) {
        int mid = n / 2;
        return col == 0 ||
               fila == 0 ||
               fila == mid ||
               (fila < mid && col == n - 1) ||
               (fila > mid && col == fila - mid);
    }
}
