package seriesnumericas;

public class S3Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S3: 0/1, 1/3, 1/5, 2/7, 3/9, 5/11, 8/13 ...\n");

        System.out.println("→ Usando FOR:");
        g4_S3_for(n);

        System.out.println("\n→ Usando WHILE:");
        g4_S3_while(n);

        System.out.println("→ Usando DO-WHILE:");
        g4_S3_doWhile(n);
    }

    // =============================
    // Serie S3 - FOR
    // =============================
    public void g4_S3_for(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int den = 1 + 2 * i; // denominador impar
            System.out.print(a + "/" + den + " ");
            int c = a + b; // Fibonacci
            a = b;
            b = c;
        }
        System.out.println();
    }

    // =============================
    // Serie S3 - WHILE
    // =============================
    public void g4_S3_while(int n) {
        int a = 0, b = 1, i = 0;
        while (i < n) {
            int den = 1 + 2 * i;
            System.out.print(a + "/" + den + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S3 - DO-WHILE
    // =============================
    public void g4_S3_doWhile(int n) {
        int a = 0, b = 1, i = 0;
        if (n <= 0) return;
        do {
            int den = 1 + 2 * i;
            System.out.print(a + "/" + den + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < n);
        System.out.println();
    }
}

