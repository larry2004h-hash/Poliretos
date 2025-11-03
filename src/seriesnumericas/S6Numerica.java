package seriesnumericas;

public class S6Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S6: 1, 4, 9, 16, 25, 36 ... (cuadrados perfectos)\n");

        System.out.println("→ Usando FOR:");
        g4_S6_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S6_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S6_doWhile(n);
    }

    // =============================
    // Serie S6 - FOR
    // =============================
    public void g4_S6_for(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((i*i) + " ");
        }
        System.out.println();
    }

    // =============================
    // Serie S6 - WHILE
    // =============================
    public void g4_S6_while(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print((i*i) + " ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S6 - DO-WHILE
    // =============================
    public void g4_S6_doWhile(int n) {
        int i = 1;
        if (n <= 0) return;
        do {
            System.out.print((i*i) + " ");
            i++;
        } while (i <= n);
        System.out.println();
    }
}
