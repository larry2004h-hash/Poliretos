package seriescaracteres;

public class S2Caracteres {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S2 (caracteres): + + ++ +++ +++++ ++++++++ +++++++++++++ ...\n");

        System.out.println("→ Usando FOR:");
        g4_S2_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S2_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S2_doWhile(n);
    }

    // =============================
    // Serie S2 - FOR
    // =============================
    public void g4_S2_for(int n) {
        int a = 1, b = 1; // términos Fibonacci
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("+");
            }
            System.out.print(" ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // =============================
    // Serie S2 - WHILE
    // =============================
    public void g4_S2_while(int n) {
        int a = 1, b = 1, i = 1;
        while (i <= n) {
            int j = 0;
            while (j < a) {
                System.out.print("+");
                j++;
            }
            System.out.print(" ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S2 - DO-WHILE
    // =============================
    public void g4_S2_doWhile(int n) {
        if (n <= 0) return;
        int a = 1, b = 1, i = 1;
        do {
            int j = 0;
            do {
                System.out.print("+");
                j++;
            } while (j < a);
            System.out.print(" ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        } while (i <= n);
        System.out.println();
    }
}
