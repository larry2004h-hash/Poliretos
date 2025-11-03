package seriescaracteres;

public class S4Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S4 (caracteres): + - * / + - * / + - * / ...\n");

        System.out.println("→ Usando FOR:");
        g4_S4_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S4_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S4_doWhile(n);
    }

    // =============================
    // Serie S4 - FOR
    // =============================
    public void g4_S4_for(int n) {
        char[] symbols = {'+', '-', '*', '/'};
        for (int i = 0; i < n; i++) {
            System.out.print(symbols[i % 4] + " ");
        }
        System.out.println();
    }

    // =============================
    // Serie S4 - WHILE
    // =============================
    public void g4_S4_while(int n) {
        char[] symbols = {'+', '-', '*', '/'};
        int i = 0;
        while (i < n) {
            System.out.print(symbols[i % 4] + " ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S4 - DO-WHILE
    // =============================
    public void g4_S4_doWhile(int n) {
        if (n <= 0) return;
        char[] symbols = {'+', '-', '*', '/'};
        int i = 0;
        do {
            System.out.print(symbols[i % 4] + " ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
