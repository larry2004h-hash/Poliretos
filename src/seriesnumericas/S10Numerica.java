package seriesnumericas;

public class S10Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S10: 3, 9, 27, 81, 243, 729, ...\n");

        System.out.println("Usando FOR:");
        g4_S10_for(n);

        System.out.println("\nUsando WHILE:");
        g4_S10_while(n);

        System.out.println("Usando DO-WHILE:");
        g4_S10_doWhile(n);
    }

    // =============================
    // Serie S10 - FOR
    // =============================
    public void g4_S10_for(int n) {
        int valor = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(valor + " ");
            valor *= 3;
        }
        System.out.println();
    }

    // =============================
    // Serie S10 - WHILE
    // =============================
    public void g4_S10_while(int n) {
        int valor = 3, i = 0;
        while (i < n) {
            System.out.print(valor + " ");
            valor *= 3;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S10 - DO-WHILE
    // =============================
    public void g4_S10_doWhile(int n) {
        int valor = 3, i = 0;
        if (n <= 0) return;
        do {
            System.out.print(valor + " ");
            valor *= 3;
            i++;
        } while (i < n);
        System.out.println();
    }
}
