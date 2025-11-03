package seriesnumericas;

public class S8Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S8: 3, 8, 13, 18, 23, 28, ...\n");

        System.out.println("Usando FOR:");
        g4_S8_for(n);

        System.out.println("\nUsando WHILE:");
        g4_S8_while(n);

        System.out.println("Usando DO-WHILE:");
        g4_S8_doWhile(n);
    }

    // =============================
    // Serie S8 - FOR
    // =============================
    public void g4_S8_for(int n) {
        int valor = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(valor + " ");
            valor += 5;
        }
        System.out.println();
    }

    // =============================
    // Serie S8 - WHILE
    // =============================
    public void g4_S8_while(int n) {
        int valor = 3, i = 0;
        while (i < n) {
            System.out.print(valor + " ");
            valor += 5;
            i++;
        }
        System.out.println();
    }

    // =============================
    // Serie S8 - DO-WHILE
    // =============================
    public void g4_S8_doWhile(int n) {
        int valor = 3, i = 0;
        if (n <= 0) return;
        do {
            System.out.print(valor + " ");
            valor += 5;
            i++;
        } while (i < n);
        System.out.println();
    }
}
