package seriesnumericas;

public class S7Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S7: 1, 4, 7, 10, 13, 16, ...\n");

        System.out.println("→ Usando FOR:");
        g4_S7_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S7_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S7_doWhile(n);
    }

    // =============================
    // Serie S7 - FOR
    // =============================
    public void g4_S7_for(int n) {
        int valor = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(valor + " ");
            valor += 3;
        }
        System.out.println();
    }

    // =============================
    // Serie S7 - WHILE
    // =============================
    public void g4_S7_while(int n) {
        int valor = 1, i = 0;
        while (i < n) {
            System.out.print(valor + " ");
            valor += 3;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S7 - DO-WHILE
    // =============================
    public void g4_S7_doWhile(int n) {
        int valor = 1, i = 0;
        if (n <= 0) return;
        do {
            System.out.print(valor + " ");
            valor += 3;
            i++;
        } while (i < n);
        System.out.println();
    }
}
