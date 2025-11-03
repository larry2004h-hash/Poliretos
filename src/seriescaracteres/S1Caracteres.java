package seriescaracteres;

public class S1Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S1 (caracteres): + - + - + - ...\n");

        System.out.println("→ Usando FOR:");
        g4_S1_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S1_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S1_doWhile(n);
    }

    // =============================
    // Serie S1 - FOR
    // =============================
    public void g4_S1_for(int n) {
        char[] symbols = {'+', '-'};
        for (int i = 0; i < n; i++) {
            System.out.print(symbols[i % 2] + " ");
        }
        System.out.println();
    }

    // =============================
    // Serie S1 - WHILE
    // =============================
    public void g4_S1_while(int n) {
        char[] symbols = {'+', '-'};
        int i = 0;
        while (i < n) {
            System.out.print(symbols[i % 2] + " ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S1 - DO-WHILE
    // =============================
    public void g4_S1_doWhile(int n) {
        char[] symbols = {'+', '-'};
        int i = 0;
        if (n <= 0) return;
        do {
            System.out.print(symbols[i % 2] + " ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
