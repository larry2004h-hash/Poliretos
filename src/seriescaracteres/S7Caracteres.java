package seriescaracteres;

public class S7Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S7 (caracteres): aa bbbb cccccc dddddddd ...\n");

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
        for (int i = 0; i < n; i++) {
            char letra = (char) ('a' + (i % 26));
            for (int j = 0; j < (i + 1) * 2; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    // =============================
    // Serie S7 - WHILE
    // =============================
    public void g4_S7_while(int n) {
        int i = 0;
        while (i < n) {
            char letra = (char) ('a' + (i % 26));
            int j = 0;
            while (j < (i + 1) * 2) {
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S7 - DO-WHILE
    // =============================
    public void g4_S7_doWhile(int n) {
        if (n <= 0) return;
        int i = 0;
        do {
            char letra = (char) ('a' + (i % 26));
            int j = 0;
            do {
                System.out.print(letra);
                j++;
            } while (j < (i + 1) * 2);
            System.out.print(" ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
