package seriescaracteres;

public class S5Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S5 (caracteres): \\ | / - | \\ | / - | ...\n");

        System.out.println("→ Usando FOR:");
        g4_S5_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S5_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S5_doWhile(n);
    }

    // =============================
    // Serie S5 - FOR
    // =============================
    public void g4_S5_for(int n) {
        char[] symbols = {'\\', '|', '/', '-', '|'};
        for (int i = 0; i < n; i++) {
            System.out.print(symbols[i % 5] + " ");
        }
        System.out.println();
    }

    // =============================
    // Serie S5 - WHILE
    // =============================
    public void g4_S5_while(int n) {
        char[] symbols = {'\\', '|', '/', '-', '|'};
        int i = 0;
        while (i < n) {
            System.out.print(symbols[i % 5] + " ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S5 - DO-WHILE
    // =============================
    public void g4_S5_doWhile(int n) {
        if (n <= 0) return;
        char[] symbols = {'\\', '|', '/', '-', '|'};
        int i = 0;
        do {
            System.out.print(symbols[i % 5] + " ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
