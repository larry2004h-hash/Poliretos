package seriescaracteres;

public class S6Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S6 (caracteres): a b c d e f g h ...\n");

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
        for (int i = 0; i < n; i++) {
            char letra = (char) ('a' + (i % 26)); // para volver a 'a' si pasa de 'z'
            System.out.print(letra + " ");
        }
        System.out.println();
    }

    // =============================
    // Serie S6 - WHILE
    // =============================
    public void g4_S6_while(int n) {
        int i = 0;
        while (i < n) {
            char letra = (char) ('a' + (i % 26));
            System.out.print(letra + " ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S6 - DO-WHILE
    // =============================
    public void g4_S6_doWhile(int n) {
        if (n <= 0) return;
        int i = 0;
        do {
            char letra = (char) ('a' + (i % 26));
            System.out.print(letra + " ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
