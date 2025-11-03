package seriescaracteres;

public class S8Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S8 (caracteres): a bbb ccccc ddddddd eeeeeeeee ...\n");

        System.out.println("→ Usando FOR:");
        g4_S8_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S8_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S8_doWhile(n);
    }

    // =============================
    // Serie S8 - FOR
    // =============================
    public void g4_S8_for(int n) {
        for (int i = 0; i < n; i++) {
            char letra = (char) ('a' + (i % 26));
            int repeticiones = 1 + (2 * i); // 1, 3, 5, 7, 9...
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    // =============================
    // Serie S8 - WHILE
    // =============================
    public void g4_S8_while(int n) {
        int i = 0;
        while (i < n) {
            char letra = (char) ('a' + (i % 26));
            int repeticiones = 1 + (2 * i);
            int j = 0;
            while (j < repeticiones) {
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S8 - DO-WHILE
    // =============================
    public void g4_S8_doWhile(int n) {
        if (n <= 0) return;
        int i = 0;
        do {
            char letra = (char) ('a' + (i % 26));
            int repeticiones = 1 + (2 * i);
            int j = 0;
            do {
                System.out.print(letra);
                j++;
            } while (j < repeticiones);
            System.out.print(" ");
            i++;
        } while (i < n);
        System.out.println();
    }
}
