package seriesnumericas;

public class S1Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S1: 0 1 1 2 3 5 8 13 ... (Fibonacci)\n");

        System.out.println("→ Usando FOR:");
        g4_S1_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S1_while(n);

        System.out.println("\n→ Usando DO-WHILE:");
        g4_S1_doWhile(n);
    }

    // =============================
    // Serie S1 (Fibonacci) - FOR
    // =============================
    public void g4_S1_for(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // =============================
    // Serie S1 (Fibonacci) - WHILE
    // =============================
    public void g4_S1_while(int n) {
        int a = 0, b = 1, i = 0;
        while (i < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S1 (Fibonacci) - DO-WHILE
    // =============================
    public void g4_S1_doWhile(int n) {
        int a = 0, b = 1, i = 0;
        if (n <= 0) return; // seguridad mínima
        do {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < n);
        System.out.println();
    }
}
