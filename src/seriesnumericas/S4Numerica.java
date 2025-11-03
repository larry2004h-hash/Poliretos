package seriesnumericas;

public class S4Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S4: 0/2, 1/4, 1/6, 2/8, 3/10 ...\n");

        System.out.println("Usando FOR:");
        g4_S4_for(n);

        System.out.println("\nUsando WHILE:");
        g4_S4_while(n);

        System.out.println("\nUsando DO-WHILE:");
        g4_S4_doWhile(n);
    }

    // =============================
    // Serie S4 - FOR
    // =============================
    public void g4_S4_for(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int den = 2 * i; // denominador par
            System.out.print(a + "/" + den + " ");
            int c = a + b; // Fibonacci
            a = b;
            b = c;
        }
        System.out.println();
    }

    // =============================
    // Serie S4 - WHILE
    // =============================
    public void g4_S4_while(int n) {
        int a = 0, b = 1, i = 1;
        while (i <= n) {
            int den = 2 * i;
            System.out.print(a + "/" + den + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S4 - DO-WHILE
    // =============================
    public void g4_S4_doWhile(int n) {
        int a = 0, b = 1, i = 1;
        if (n <= 0) return;
        do {
            int den = 2 * i;
            System.out.print(a + "/" + den + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i <= n);
        System.out.println();
    }
}
