package seriesnumericas;

public class S12Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S12: 2, 6, 12, 20, 30, 42, 56, 72 ...\n");

        System.out.println("→ Usando FOR:");
        g4_S12_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S12_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S12_doWhile(n);
    }

    // =============================
    // Serie S12 - FOR
    // =============================
    public void g4_S12_for(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i * (i + 1)) + " ");
        }
        System.out.println();
    }

    // =============================
    // Serie S12 - WHILE
    // =============================
    public void g4_S12_while(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print((i * (i + 1)) + " ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S12 - DO-WHILE
    // =============================
    public void g4_S12_doWhile(int n) {
        int i = 1;
        if (n <= 0) return;
        do {
            System.out.print((i * (i + 1)) + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }
}
