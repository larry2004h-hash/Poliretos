package seriesnumericas;

public class S9Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S9: 2, 4, 8, 16, 32, 64, ...\n");

        System.out.println("→ Usando FOR:");
        g4_S9_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S9_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S9_doWhile(n);
    }

    // =============================
    // Serie S9 - FOR
    // =============================
    public void g4_S9_for(int n) {
        int valor = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(valor + " ");
            valor *= 2;
        }
        System.out.println();
    }

    // =============================
    // Serie S9 - WHILE
    // =============================
    public void g4_S9_while(int n) {
        int valor = 2, i = 0;
        while (i < n) {
            System.out.print(valor + " ");
            valor *= 2;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S9 - DO-WHILE
    // =============================
    public void g4_S9_doWhile(int n) {
        int valor = 2, i = 0;
        if (n <= 0) return;
        do {
            System.out.print(valor + " ");
            valor *= 2;
            i++;
        } while (i < n);
        System.out.println();
    }
}

