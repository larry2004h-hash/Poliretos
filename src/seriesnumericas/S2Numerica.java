package seriesnumericas;

public class S2Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S2: 1 0 3 0 5 0 7 0 9 ...\n");

        System.out.println("Usando FOR:");
        g4_S2_for(n);

        System.out.println("\nUsando WHILE:");
        g4_S2_while(n);

        System.out.println("\nUsando DO-WHILE:");
        g4_S2_doWhile(n);
    }

    // =============================
    // Serie S2 - FOR
    // =============================
    public void g4_S2_for(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(num + " ");
                num += 2;
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }

    // =============================
    // Serie S2 - WHILE
    // =============================
    public void g4_S2_while(int n) {
        int i = 1, num = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(num + " ");
                num += 2;
            } else {
                System.out.print("0 ");
            }
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S2 - DO-WHILE
    // =============================
    public void g4_S2_doWhile(int n) {
        int i = 1, num = 1;
        if (n <= 0) return;
        do {
            if (i % 2 != 0) {
                System.out.print(num + " ");
                num += 2;
            } else {
                System.out.print("0 ");
            }
            i++;
        } while (i <= n);
        System.out.println();
    }
}
