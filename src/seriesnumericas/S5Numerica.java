package seriesnumericas;

public class S5Numerica {

    public void mostrarSeries(int n) {
        System.out.println("\nSerie S5: 2, 3, 5, 7, 11, 13, 17 ...\n");

        System.out.println("Usando FOR:");
        g4_S5_for(n);

        System.out.println("\nUsando WHILE:");
        g4_S5_while(n);

        System.out.println("\nUsando DO-WHILE:");
        g4_S5_doWhile(n);
    }

    // =============================
    // Función auxiliar para verificar si un número es primo
    // =============================
    private boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // =============================
    // Serie S5 - FOR
    // =============================
    public void g4_S5_for(int n) {
        int count = 0;
        for (int num = 2; count < n; num++) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
    }

    // =============================
    // Serie S5 - WHILE
    // =============================
    public void g4_S5_while(int n) {
        int count = 0, num = 2;
        while (count < n) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // =============================
    // Serie S5 - DO-WHILE
    // =============================
    public void g4_S5_doWhile(int n) {
        int count = 0, num = 2;
        if (n <= 0) return;
        do {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        } while (count < n);
        System.out.println();
    }
}
